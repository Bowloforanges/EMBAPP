import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CTL_ACTUALIZAR_BD")
public class CTL_ACTUALIZAR_BD extends HttpServlet {



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
		
         try {
               PrintWriter out=response.getWriter();
                int Id       = parseInt(request.getParameter("ID_E"));
		String name     =request.getParameter("Nombre");
		String password =request.getParameter("password");
		String puesto    =request.getParameter("Puesto");
		String Fecha_ingreso  =request.getParameter("Fecha_ingreso");
		
		Informacion_del_Empleado e=new Informacion_del_Empleado();
                e.setId(Id);
		e.setName(name);
		e.setPassword(password);
		e.setPuesto(puesto);
		e.setFecha(Fecha_ingreso);
		
		int status=CTL_CRUD.save(e);
		if(status>0){
			out.print("<p>Record saved successfully!</p>");
			request.getRequestDispatcher("IU_Employees.jsp").include(request, response);
		}else{
			out.println("Sorry! unable to save record");
		      }
          
                out.close();
         
         }  catch  ( IOException | ServletException ex  ) {}
	

         
	}

  
    }
