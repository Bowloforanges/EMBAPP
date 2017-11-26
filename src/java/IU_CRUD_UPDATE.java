
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IU_CRUD_UPDATE")
public class IU_CRUD_UPDATE extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        out.println("    <meta charset=\"UTF-8\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"css/datepicker.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"assets/theme/css/style.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"css/buttonstyle.css\">\n"
                + "    <link rel=\"stylesheet\" href=\"css/newcolstyle.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/formstyle.css\">\n"
                + "    <link href=\"https://fonts.googleapis.com/css?family=Nunito\" rel=\"stylesheet\">\n"
                + "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n"
                + "    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
        out.println("        <br>\n"
                + "    <div class=\"buttondiv\">\n"
                + "        <input type=\"button\" value=\"Return\" onclick=\"window.history.go(-1); return false;\" class=\"btn\"/><br>\n"
                + "    </div>\n"
                + "    <hr>");

        out.println("<h1>Update </h1>");
        String sid = request.getParameter("ID_E");
        int id = Integer.parseInt(sid);

        Informacion_del_Empleado e = CTL_CRUD.getEmployeeById(id);
        
        out.print("<div class=\"separatepls\">");
        out.print("<form action=\"CTL_CRUD_UPDATE\" method=\"get\">\n"
                + "        <div class=\"row\">\n"
                + "            <div class=\"col-25\">\n"
                + "                <label for=\"lID\">ID</label>\n"
                + "            </div>\n"
                + "            <div class=\"col-75\">\n"
                + "                <input type=\"text\" id=\"fname\" name=\"ID_E\" value='" + e.getId() + "' placeholder=\"Employee's ID\">\n"
                + "            </div>\n"
                + "        </div>\n"
                + "        <div class=\"row\">\n"
                + "            <div class=\"col-25\">\n"
                + "                <label for=\"lname\">Name</label>\n"
                + "            </div>\n"
                + "            <div class=\"col-75\">\n"
                + "                <input type=\"text\" id=\"lname\" name=\"Nombre\" value='" + e.getName() + "' placeholder=\"Employee's Name\">\n"
                + "            </div>\n"
                + "        </div>\n"
                + "        <div class=\"row\">\n"
                + "            <div class=\"col-25\">\n"
                + "                <label for=\"lpass\">Password</label>\n"
                + "            </div>\n"
                + "            <div class=\"col-75\">\n"
                + "                <input type=\"text\" id=\"lname\" name=\"password\" value='" + e.getPassword() + "' placeholder=\"Employee's Password\">\n"
                + "            </div>\n"
                + "        </div>\n"
                + "        <div class=\"row\">\n"
                + "            <div class=\"col-25\">\n"
                + "                <label for=\"Position\">Position</label>\n"
                + "            </div>\n"
                + "            <div class=\"col-75\">\n"
                + "                <select id=\"Position\" value\" + e.getPuesto() + \" name=\"Puesto\">\n"
                + "                    <option>Director General</option>\n"
                + "                    <option>Jefe RH</option>\n"
                + "                    <option>Jefe Administrativo</option>\n"
                + "                    <option>Gerente Operativo</option>\n"
                + "                    <option>Supervisor</option>\n"
                + "                    <option>Empleado</option>\n"
                + "                </select>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "        \n"
                + "        <div class=\"row\">\n"
                + "            <div class=\"col-25\">\n"
                + "                <label for=\"ladate\">Admission Date</label>\n"
                + "            </div>\n"
                + "            <div class=\"col-75\">\n"
                + "                <input type='date'    name='Fecha_ingreso'    value='" + e.getFecha() + "'/>\n"
                + "            </div>\n"
                + "        </div>\n"        
                + "        <div class=\"row\"class='buttondiv'>\n"
                + "            <hr>\n"
                + "            <input type='submit' value='Save Changes' class='btn'>\n"
                + "        </div>\n"
                + "    </form>\n"
                + "</div>\n"
                + "<hr>\n"
                + "");
                out.print("</div>");

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
