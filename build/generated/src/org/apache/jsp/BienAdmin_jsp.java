package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import metier.Administrateur;

public final class BienAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("            <style type=\"text/css\">\n");
      out.write("            \n");
      out.write("   \n");
      out.write("body {\n");
      out.write("    background-image: url('az.jpg');\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("               .myButton {\n");
      out.write("\t-moz-box-shadow: 0px 0px 0px 2px #9fb4f2;\n");
      out.write("\t-webkit-box-shadow: 0px 0px 0px 2px #9fb4f2;\n");
      out.write("\tbox-shadow: 0px 0px 0px 2px #9fb4f2;\n");
      out.write("\tbackground:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #7892c2), color-stop(1, #476e9e));\n");
      out.write("\tbackground:-moz-linear-gradient(top, #7892c2 5%, #476e9e 100%);\n");
      out.write("\tbackground:-webkit-linear-gradient(top, #7892c2 5%, #476e9e 100%);\n");
      out.write("\tbackground:-o-linear-gradient(top, #7892c2 5%, #476e9e 100%);\n");
      out.write("\tbackground:-ms-linear-gradient(top, #7892c2 5%, #476e9e 100%);\n");
      out.write("\tbackground:linear-gradient(to bottom, #7892c2 5%, #476e9e 100%);\n");
      out.write("\tfilter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#7892c2', endColorstr='#476e9e',GradientType=0);\n");
      out.write("\tbackground-color:#7892c2;\n");
      out.write("\t-moz-border-radius:10px;\n");
      out.write("\t-webkit-border-radius:10px;\n");
      out.write("\tborder-radius:10px;\n");
      out.write("\tborder:1px solid #4e6096;\n");
      out.write("\tdisplay:inline-block;\n");
      out.write("\tcursor:pointer;\n");
      out.write("\tcolor:#ffffff;\n");
      out.write("\tfont-family:Arial;\n");
      out.write("\tfont-size:19px;\n");
      out.write("\tpadding:12px 37px;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\ttext-shadow:0px 1px 0px #283966;\n");
      out.write("}\n");
      out.write(".myButton:hover {\n");
      out.write("\tbackground:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #476e9e), color-stop(1, #7892c2));\n");
      out.write("\tbackground:-moz-linear-gradient(top, #476e9e 5%, #7892c2 100%);\n");
      out.write("\tbackground:-webkit-linear-gradient(top, #476e9e 5%, #7892c2 100%);\n");
      out.write("\tbackground:-o-linear-gradient(top, #476e9e 5%, #7892c2 100%);\n");
      out.write("\tbackground:-ms-linear-gradient(top, #476e9e 5%, #7892c2 100%);\n");
      out.write("\tbackground:linear-gradient(to bottom, #476e9e 5%, #7892c2 100%);\n");
      out.write("\tfilter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#476e9e', endColorstr='#7892c2',GradientType=0);\n");
      out.write("\tbackground-color:#476e9e;\n");
      out.write("}\n");
      out.write(".myButton:active {\n");
      out.write("\tposition:relative;\n");
      out.write("\ttop:1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <title>Administrateur </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("  \n");
      out.write("        \n");
      out.write("         \n");
      out.write("    <center><h1>  <font> Bienvenue Administrateur  <br><br><br>\n");
      out.write("             <font color=\"#285c82\">\n");
      out.write("                \n");
      out.write("        \n");
      out.write("             ");

                  
          String nom = ((Administrateur)session.getAttribute("admin")).getNom();
          String p = ((Administrateur)session.getAttribute("admin")).getPrenom();
      out.println(nom+" &nbsp; "+p); 
      out.write("\n");
      out.write("      </font>\n");
      out.write("</h1>\n");
      out.write("      <br>\n");
      out.write("      <img src=\"admin.png\" alt=\"\"/>\n");
      out.write("    <br> <br> \n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/gestionetudiant.jsp\"  class=\"myButton\">Gestion des Etudiants</a>\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp; <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/gestionCours.jsp\"  class=\"myButton\">Gestion Des Cours</a>\n");
      out.write("       <br>   <br> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/authentifier.jsp\" class=\"myButton\">Log Out</a>\n");
      out.write("</center> \n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
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
