
import java.util.*;
import java.sql.*;

public class CTL_CRUD {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/embagroup","root","1234");
		}catch(ClassNotFoundException | SQLException e){System.out.println(e);}
		return con;
	}
	public static int save(Informacion_del_Empleado e){
		int status=0;
		try{
			Connection con=CTL_CRUD.getConnection();

  PreparedStatement ps=con.prepareStatement("insert into embagroup.info_empleado (ID_E,Nombre,Puesto,Fecha_ingreso) values (?,?,?,?)");
			ps.setInt(1, e.getId());
                        ps.setString(2,e.getName());
			ps.setString(3,e.getPuesto());
			ps.setString(4,e.getFecha());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(SQLException ex){ ex.printStackTrace();}
                try{
			Connection con=CTL_CRUD.getConnection();

  PreparedStatement ps=con.prepareStatement("insert into embagroup.contra_emp (ID_E,Password) values (?,?)");
			ps.setInt(1, e.getId());
                        ps.setString(2,e.getPassword());
			status=ps.executeUpdate();
			con.close();
		}catch(SQLException ex){ ex.printStackTrace();}
		
		return status;
	}
	
        public static int update(Informacion_del_Empleado e){
		int status=0;
		try {
			Connection con=CTL_CRUD.getConnection();
			PreparedStatement ps=con.prepareStatement("update embagroup.info_empleado set Nombre=?, Puesto=?,Fecha_ingreso=? where ID_E=?");
			ps.setString(1,e.getName());
			ps.setString(2,e.getPuesto());
			ps.setString(3,e.getFecha());
                        ps.setInt(4,e.getId());
	
			
			status=ps.executeUpdate();
			
			con.close();
		} catch ( SQLException ex){ }
		try {
			Connection con=CTL_CRUD.getConnection();
			PreparedStatement ps=con.prepareStatement("update embagroup.contra_emp set Password=? where ID_E=?");
			ps.setString(1,e.getPassword());
                        ps.setInt(2,e.getId());
	
			
			status=ps.executeUpdate();
			
			con.close();
		} catch ( SQLException ex){ }
		
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=CTL_CRUD.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from embagroup.info_empleado where ID_E=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception e){e.printStackTrace();}
		try{
			Connection con=CTL_CRUD.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from embagroup.contra_emp where ID_E=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception e){e.printStackTrace();}
		return status;
	}
	public static Informacion_del_Empleado getEmployeeById(int id){
		Informacion_del_Empleado e=new Informacion_del_Empleado();
		
		try{
			Connection con=CTL_CRUD.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from embagroup.info_empleado NATURAL JOIN embagroup.contra_emp where ID_E=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPuesto(rs.getString(3));
				e.setFecha(rs.getString(4));
                                e.setPassword(rs.getString(5));
			}
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return e;
	}
	public static List<Informacion_del_Empleado> getAllEmployees(){
		List<Informacion_del_Empleado> list=new ArrayList<Informacion_del_Empleado>();
		
		try{
			Connection con=CTL_CRUD.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from embagroup.info_empleado NATURAL JOIN embagroup.contra_emp");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Informacion_del_Empleado e=new Informacion_del_Empleado();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPuesto(rs.getString(3));
				e.setFecha(rs.getString(4));
                                e.setPassword(rs.getString(5));
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
}
