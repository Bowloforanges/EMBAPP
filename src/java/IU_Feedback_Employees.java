
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/IU_Feedback_Employees")
public class IU_Feedback_Employees extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        try {

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
            out.println("<link rel=\"stylesheet\" href=\"css/tablestyle.css\">");

            List<Informacion_del_Empleado> list = CTL_CRUD.getAllEmployeesBrackets();

            out.println("<table>");
            out.println("<center><caption>Employees List</caption></center>\n"
                    + "  <thead>\n"
                    + "    <tr>\n"
                    + "      <th scope=\"col\">ID</th>\n"
                    + "      <th scope=\"col\">Name</th>\n"
                    + "      <th scope=\"col\" href=\"\" >Trimestral Feedback</th>\n"
                    + "      <th scope=\"col\" href=\"\" >Annual Feedback</th>\n"//EDITAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAR
                    + "    </tr>\n"
                    + "  </thead>\n"
                    + "  <tbody>");
            for (Informacion_del_Empleado e : list) {
                out.print("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td><a href='IU_UPDATE_TRIMESTRALF?ID_E=" + e.getId() + "'>Trimestral Feedback</a><td><a href='IU_UPDATE_ANNUALF?ID_E=" + e.getId() + "'>Annual Feedback</a></td></td></tr></tbody>");
            }
            out.print("</table>");

        } finally {

            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
