package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class IU_005fE_005fBrackets_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Brackets</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newcolstyle.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
    String DRIVER = "com.mysql.jdbc.Driver";

            Class.forName(DRIVER).newInstance();
            Connection con = null;
            ResultSet rst = null;
            ResultSet usr = null;
            Statement stmt = null;
            Statement stmt2 = null;
            try {

                String url = "jdbc:mysql://localhost:3306/embagroup";

                String user = "root";
                String password = "1234";
                con = DriverManager.getConnection(url, user, password);
                stmt = con.createStatement();
                stmt2 = con.createStatement();
                rst = stmt.executeQuery("SELECT * FROM embagroup.brackets; ");
                //usr = stmt2.executeQuery("SELECT * FROM embagroup.info_empleado; ");
                while (rst.next()) {

        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("            <h1>Brackets:</h1>\r\n");
      out.write("            <div class=\"columns\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>");
      out.print(rst.getString(2));
      out.write("</li>\r\n");
      out.write("                    <li>");
      out.print(rst.getInt("Exp"));
      out.write("</li>\r\n");
      out.write("                </ul>         \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
            }

                response.sendRedirect("showerror.html");

                rst.close();
                usr.close();
                stmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
