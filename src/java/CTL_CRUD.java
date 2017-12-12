
import java.util.*;
import java.sql.*;

public class CTL_CRUD {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public static int save(Informacion_del_Empleado e) {
        int status = 0;
        try {
            Connection con = CTL_CRUD.getConnection();

            PreparedStatement ps = con.prepareStatement("insert into test.level_exp (Emp_Tot_Exp, Level_Exp_Current_Level) values (?,9)");
            ps.setInt(1, e.getExp());
            status = ps.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        try {
            Connection con = CTL_CRUD.getConnection();

            PreparedStatement ps = con.prepareStatement("insert into test.employee (Emp_ID, Emp_Name, Emp_LastName, Emp_Password, Emp_Age, Emp_Gender, Emp_Position, Emp_Admission_Date ) values (?,?,?,?,?,?,?,?)");
            ps.setInt(1, e.getId());
            ps.setString(2, e.getName());
            ps.setString(3, e.getLast_Name());
            ps.setString(4, e.getPassword());
            ps.setInt(5, e.getAge());
            ps.setString(6, e.getGender());
            ps.setString(7, e.getPuesto());
            ps.setString(8, e.getFecha());
            status = ps.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return status;
    }

    public static int update(Informacion_del_Empleado e) {
        int status = 0;
        try {
            
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("update employee set Emp_Name=?, Emp_LastName=?, Emp_Password=?,Emp_Position=?,Emp_Admission_Date=? where Emp_ID=?");
            ps.setString(1, e.getName());
            ps.setString(2, e.getLast_Name());
            ps.setString(3, e.getPassword());
            ps.setString(4, e.getPuesto());
            ps.setString(5, e.getFecha());
            ps.setInt(6, e.getId());

            status = ps.executeUpdate();

            con.close();
        } catch (SQLException ex) {
        }

        return status;
    }
public static int updateAnn(Informacion_del_Empleado e) {
        int status = 0;
        try {
            
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("update ann_feed set Ann_Feed_Date=? where Feedback_ID=?");
            ps.setString(1, e.getAnnDate());
            ps.setInt(2, e.getID_Rev());

            status = ps.executeUpdate();

            con.close();
        } catch (SQLException ex) {
        }

        return status;
    }
public static int updateTri(Informacion_del_Empleado e) {
        int status = 0;
        try {
            
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("update tri_feed set Tri_Feed_Date=? where Feedback_ID=?");
            ps.setString(1, e.getTriDate());
            ps.setInt(2, e.getID_Rev());

            status = ps.executeUpdate();

            con.close();
        } catch (SQLException ex) {
        }

        return status;
    }

public static int updateScore(Informacion_del_Empleado e) {
        int status = 0;
        try {
            
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("update employee set Emp_Score=?,Emp_Tot_Exp=? where Emp_ID=?");
            ps.setString(1, e.getScore());
            ps.setInt(2, e.getTotalExp());
               ps.setInt(3, e.getId());
            status = ps.executeUpdate();

            con.close();
        } catch (SQLException ex) {
        }

        return status;
    }

    public static int delete(int id) {
        int status = 0;
        try {
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from employee where Emp_ID=?");
            ps.setInt(1, id);
            status = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from bracket_emp where Emp_ID=?");
            ps.setInt(1, id);
            status = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return status;
    }

    public static Informacion_del_Empleado getEmployeeById(int id) {
        Informacion_del_Empleado e = new Informacion_del_Empleado();

        try {
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("select Emp_ID,Emp_Name,Emp_LastName,Emp_Password,Emp_Position,Emp_Admission_Date from employee where Emp_ID=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setLast_Name(rs.getString(3));
                e.setPassword(rs.getString(4));
                e.setPuesto(rs.getString(5));
                e.setFecha(rs.getString(6));
                
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return e;
    }
    

    public static Informacion_del_Empleado getAnnFeedEmployeeById(int id) {
        Informacion_del_Empleado e = new Informacion_del_Empleado();

        try {
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM test.ann_feed natural join test.feedback where Emp_ID = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e.setID_Rev(rs.getInt(1));
                e.setAnnDate(rs.getString(2));
                
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return e;
    }
    public static Informacion_del_Empleado getTriFeedEmployeeById(int id) {
        Informacion_del_Empleado e = new Informacion_del_Empleado();

        try {
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM test.tri_feed natural join test.feedback where Emp_ID = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e.setID_Rev(rs.getInt(1));
                e.setAnnDate(rs.getString(2));
                
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return e;
    }
    
public static Informacion_del_Empleado getScoreById(int id) {
        Informacion_del_Empleado e = new Informacion_del_Empleado();

        try {
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT Emp_Score,Emp_Tot_Exp FROM test.employee where Emp_ID = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                e.setScore(rs.getString(1));
                e.setExp(rs.getInt(2));
                e.setId(id);
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return e;
    }
    
    public static List<Informacion_del_Empleado> getAllEmployees() {
        List<Informacion_del_Empleado> list = new ArrayList<Informacion_del_Empleado>();

        try {
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("select Emp_ID,Emp_Name,Emp_LastName,Emp_Password,Emp_Position,Emp_Admission_Date from employee");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Informacion_del_Empleado e = new Informacion_del_Empleado();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setLast_Name(rs.getString(3));
                e.setPassword(rs.getString(4));
                e.setPuesto(rs.getString(5));
                e.setFecha(rs.getString(6));
                
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public static List<Informacion_del_Empleado> getAllEmployeesBrackets() {
        List<Informacion_del_Empleado> list = new ArrayList<Informacion_del_Empleado>();

        try {
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("select Emp_ID,Emp_Name from test.employee where Emp_Position='Empleado'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Informacion_del_Empleado e = new Informacion_del_Empleado();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public static List<Informacion_del_Empleado> getBracketById(int id) {
        List<Informacion_del_Empleado> list = new ArrayList<Informacion_del_Empleado>();

        try {
            Connection con = CTL_CRUD.getConnection();
            PreparedStatement ps = con.prepareStatement("select Bracket_Name,Bracket_Emp_Status from test.brackets natural join test.bracket_emp where Emp_ID=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Informacion_del_Empleado e = new Informacion_del_Empleado();
                e.setBracketName(rs.getString(1));
                e.setCumplimiento(rs.getString(2));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
