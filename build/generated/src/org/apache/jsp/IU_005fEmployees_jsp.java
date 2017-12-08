package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IU_005fEmployees_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <title>TODO supply a title</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/datepicker.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/theme/css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/buttonstyle.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/newcolstyle.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/formstyle.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Nunito\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("        <br>\r\n");
      out.write("    <div class=\"buttondiv\">\r\n");
      out.write("        <input type=\"button\" value=\"Return\" onclick=\"window.history.go(-1); return false;\" class=\"btn\"/><br>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr>\r\n");
      out.write("<h1>Add New Employee</h1>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <form action=\"CTL_ACTUALIZAR_BD\" method=\"post\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-25\">\r\n");
      out.write("                <label for=\"lID\">ID</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-75\">\r\n");
      out.write("                <input type=\"text\" id=\"ide\" name=\"ID_E\" placeholder=\"Employee's ID\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-25\">\r\n");
      out.write("                <label for=\"lname\">Name</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-75\">\r\n");
      out.write("                <input type=\"text\" id=\"name\" name=\"Nombre\" placeholder=\"Employee's Name\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("        <div class=\"col-25\">\r\n");
      out.write("                <label for=\"llast\">Last Name</label>\r\n");
      out.write("        </div>\r\n");
      out.write("            <div class=\"col-75\">\r\n");
      out.write("                <input type=\"text\" id=\"Apellido\" name=\"Apellido\" placeholder=\"Employee's Last Name\">\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-25\">\r\n");
      out.write("                <label for=\"lpass\">Password</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-75\">\r\n");
      out.write("                <input type=\"text\" id=\"pass\" name=\"Password\" placeholder=\"Employee's Password\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-25\">\r\n");
      out.write("                <label for=\"lposition\">Position</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-75\">\r\n");
      out.write("                <select id=\"position\" name=\"Position\">\r\n");
      out.write("                    <option>RH</option>\r\n");
      out.write("                    <option>Gerente Operativo</option>\r\n");
      out.write("                    <option>Supervisor</option>\r\n");
      out.write("                    <option>Empleado</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-25\">\r\n");
      out.write("                <label for=\"lage\">Age</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-75\">\r\n");
      out.write("                <input type=\"text\" id=\"age\" name=\"Age\" placeholder=\"Employee's Age\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-25\">\r\n");
      out.write("                <label for=\"lgender\">Gender</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-75\">\r\n");
      out.write("                <select id=\"gender\" name=\"Gender\">\r\n");
      out.write("                    <option>F</option>\r\n");
      out.write("                    <option>M</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-25\">\r\n");
      out.write("                <label for=\"LAD\">Admission Date</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-75\">\r\n");
      out.write("                <input type=\"date\" id=\"AD\" name=\"Admission_Date\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\"class='buttondiv'>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <input type=\"submit\" value=\"Submit\" class='btn'>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<center><a href=\"IU_CRUD\">view employees</a></center>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
