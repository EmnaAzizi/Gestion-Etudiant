package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class authentifier_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("            <style type=\"text/css\">\n");
      out.write("            \n");
      out.write("   \n");
      out.write("body {\n");
      out.write("    background-image: url('ur.png');\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("                .myButton {\n");
      out.write("\tbackground-color:#ff5bb0;\n");
      out.write("\t-moz-border-radius:38px;\n");
      out.write("\t-webkit-border-radius:38px;\n");
      out.write("\tborder-radius:38px;\n");
      out.write("\tborder:2px solid #ee1eb5;\n");
      out.write("\tdisplay:inline-block;\n");
      out.write("\tcursor:pointer;\n");
      out.write("\tcolor:#ffffff;\n");
      out.write("\tfont-family:Arial;\n");
      out.write("\tfont-size:23px;\n");
      out.write("\tpadding:10px 43px;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\ttext-shadow:-2px 2px 0px #c70067;\n");
      out.write("}\n");
      out.write(".myButton:hover {\n");
      out.write("\tbackground-color:#ef027d;\n");
      out.write("}\n");
      out.write(".myButton:active {\n");
      out.write("\tposition:relative;\n");
      out.write("\ttop:1px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <title>S'authentifier </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body background=\"ur.png\">\n");
      out.write(" <P> \n");
      out.write("     \n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"/tpp/Servletauthentiff\" style=\"\">\n");
      out.write("\n");
      out.write("    <P>  \n");
      out.write("        <br>\n");
      out.write("    <br>\n");
      out.write("    <center><h1>  <font color=\"#DA23BC\" > S'authentifier </h1></center> \n");
      out.write("    <br>\n");
      out.write("    <br><br>\n");
      out.write("    <br><br>\n");
      out.write("    <br><br>\n");
      out.write("    <br><br>\n");
      out.write("    <br>\n");
      out.write("   \n");
      out.write("    <font color =\"#00000\">\n");
      out.write("    <center>\n");
      out.write("        <strong>\n");
      out.write("        Login :   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type=\"text\" name=\"log\" value=\"\" SIZE=\" 12\" MAXLENGTH=\"50\">\n");
      out.write(" <br>\n");
      out.write("    <br>Password :&nbsp; <input type=\"password\" name=\"pass\" value=\"\" SIZE=\" 12\" MAXLENGTH=\"50\">  \n");
      out.write("       \n");
      out.write("        <P> Type :&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <select name=\"type\"><option>Administrateur </option> \n");
      out.write("        <option>Etudiant</option></select>\n");
      out.write("        </strong><br>\n");
      out.write("    <br><br>\n");
      out.write(" \n");
      out.write("    <strong> OU Bien <a href=\"form.jsp\">s'inscire</a> </Strong>\n");
      out.write("     <br>\n");
      out.write("    <br>\n");
      out.write("      <input type=\"submit\" value=\"Log in\" class=\"myButton\"/>\n");
      out.write("      \n");
      out.write("      <br> <br> \n");
      out.write("    \n");
      out.write("    </center>\n");
      out.write("  \n");
      out.write("  <br>  <br>  <br> \n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("</FORM>\n");
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
