package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class IU_005fBracket_005fEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/datepicker.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/theme/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/buttonstyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/newcolstyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/formstyle.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <div class=\"buttondiv\">\n");
      out.write("            <input type=\"button\" value=\"Return\" onclick=\"window.history.go(-1); return false;\" class=\"btn\"/><br>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
    String DRIVER = "com.mysql.jdbc.Driver";

            Class.forName(DRIVER).newInstance();
            Connection con = null;
            ResultSet rs = null;
            Statement stmnt = null;

            try {

                String url = "jdbc:mysql://localhost:3306/test";

                String user = "root";
                String password = "1234";
                con = DriverManager.getConnection(url, user, password);
                stmnt = con.createStatement();
                rs = stmnt.executeQuery("select * from test.brackets natural join test.bracket_desc where brackets.Bracket_Name = bracket_desc.Bracket_Name order by Bracket_ID asc;");
                //usr = stmt2.executeQuery("SELECT * FROM embagroup.info_empleado; ");
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Select a Bracket:</h1>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"\" method=\"post\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div >\n");
      out.write("                        <label for=\"lbrid\">Bracket ID</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-75\">\n");
      out.write("                        <select id=\"brid\" name=\"BR_id\" onchange=\"showDescription()\">\n");
      out.write("                            ");
  while (rs.next()) {

                            
      out.write("\n");
      out.write("                            <option> ");
      out.print( rs.getInt("Bracket_ID"));
      out.write(" </option>\n");
      out.write("                            ");
  }
                                    rs.close();
                                    stmnt.close();
                                    con.close();
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                     <!--   <div class>\n");
      out.write("                            \n");
      out.write("                        </div>-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\"class='buttondiv'>\n");
      out.write("                    <hr>\n");
      out.write("                    <input type=\"submit\" value=\"Submit\" class='btn'>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("    <center><a href=\"IU_CRUD\">view employees</a></center>\n");
      out.write("\n");
      out.write("    <h1>Select a Bracket:</h1>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form action=\"\" method=\"post\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"lbrid\">Bracket ID</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <select id=\"brid\" name=\"BR_id\">\n");
      out.write("                        <option>Director General</option>\n");
      out.write("                        <option>RH</option>\n");
      out.write("                        <option>Jefe Administrativo</option>\n");
      out.write("                        <option>Gerente Operativo</option>\n");
      out.write("                        <option>Supervisor</option>\n");
      out.write("                        <option>Empleado</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"lname\">Name</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <input type=\"text\" id=\"name\" name=\"Nombre\" placeholder=\"Employee's Name\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"lpass\">Password</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <input type=\"text\" id=\"pass\" name=\"Password\" placeholder=\"Employee's Password\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"lage\">Age</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <input type=\"text\" id=\"age\" name=\"Age\" placeholder=\"Employee's Age\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"lgender\">Gender</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <select id=\"gender\" name=\"Gender\">\n");
      out.write("                        <option>F</option>\n");
      out.write("                        <option>M</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-25\">\n");
      out.write("                    <label for=\"LAD\">Admission Date</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-75\">\n");
      out.write("                    <input type=\"date\" id=\"AD\" name=\"Admission_Date\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\"class='buttondiv'>\n");
      out.write("                <hr>\n");
      out.write("                <input type=\"submit\" value=\"Submit\" class='btn'>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("    <br/>\n");
      out.write("    <center><a href=\"IU_CRUD\">view employees</a></center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
