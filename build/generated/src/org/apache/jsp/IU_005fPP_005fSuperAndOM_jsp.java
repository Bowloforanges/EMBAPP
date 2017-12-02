package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IU_005fPP_005fSuperAndOM_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>EMBAGROUP</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Noto+Sans:700'>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylePP.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <span class=\"navbar-logo\">\n");
      out.write("                <a>\n");
      out.write("                <img src=\"assets/images/embalogo-150x150.png\" alt=\"\" title=\"\" media-simple=\"true\" style=\"height: 2.7rem;\">\n");
      out.write("                </a>\n");
      out.write("            </span>\n");
      out.write("            <span class=\"TitleEMBA\">EMBAGROUP</span>\n");
      out.write("            <button class=\"hamburger\">&#9776;</button>\n");
      out.write("            <button class=\"cross\">&#735;</button>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                <a href=\"IU_NotificationScreen.jsp\"><li>Notifications</li></a>\n");
      out.write("                <a href=\"IU_Calendar.jsp\"><li>Calendar</li></a>\n");
      out.write("                <a href=\"IU_VacationDays.jsp\"><li>Vacation Days</li></a>\n");
      out.write("                <a href=\"IU_Bracket_Menu.jsp\"><li>Brackets</li></a>\n");
      out.write("                <a href=\"IU_E_Score.jsp\"><li>Score</li></a>\n");
      out.write("                <a href=\"IU_E_AnnualFeedback.jsp\"><li>Annual Feedback</li></a>\n");
      out.write("                <a href=\"IU_E_TriFeedback.jsp\"><li>Trimestral Feedback</li></a>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("\n");
      out.write("        <script  src=\"js/index.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
