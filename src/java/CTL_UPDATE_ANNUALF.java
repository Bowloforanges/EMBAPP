import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CTL_UPDATE_ANNUALF")
public class CTL_UPDATE_ANNUALF extends HttpServlet {



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
        
        response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sid=request.getParameter("ID_Rev");
		int id=Integer.parseInt(sid);
		String Fecha=request.getParameter("Fecha_Rev");

		
		Informacion_del_Empleado e=new Informacion_del_Empleado();
		e.setID_Rev(id);
		e.setAnnDate(Fecha);
		
		int status=CTL_CRUD.updateTri(e);
		if(status>0){
			 response.sendRedirect("IU_Feedback_Employees");
                        
              //         	out.print("<p>Record saved successfully!</p>");
	      //	request.getRequestDispatcher("index.html").include(request, response);
                        
                        
                        
		}else{
			out.println("Sorry! unable to update record");
		}
		
		out.close();
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

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


