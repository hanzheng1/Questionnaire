package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exampleJSPtoTestJQuery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<title>jQuery UI Accordion - Default functionality</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css\" />\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.9.1.js\"></script>\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.10.3/jquery-ui.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\" />\n");
      out.write("<script>\n");
      out.write("$(function() {\n");
      out.write("$( \"#accordion\" ).accordion();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"accordion\">\n");
      out.write("<h3>Section 1</h3>\n");
      out.write("<div>\n");
      out.write("<p>\n");
      out.write("Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integer\n");
      out.write("ut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sit\n");
      out.write("amet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo ut\n");
      out.write("odio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("<h3>Section 2</h3>\n");
      out.write("<div>\n");
      out.write("<p>\n");
      out.write("Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet\n");
      out.write("purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor\n");
      out.write("velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In\n");
      out.write("suscipit faucibus urna.\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("<h3>Section 3</h3>\n");
      out.write("<div>\n");
      out.write("<p>\n");
      out.write("Nam enim risus, molestie et, porta ac, aliquam ac, risus. Quisque lobortis.\n");
      out.write("Phasellus pellentesque purus in massa. Aenean in pede. Phasellus ac libero\n");
      out.write("ac tellus pellentesque semper. Sed ac felis. Sed commodo, magna quis\n");
      out.write("lacinia ornare, quam ante aliquam nisi, eu iaculis leo purus venenatis dui.\n");
      out.write("</p>\n");
      out.write("<ul>\n");
      out.write("<li>List item one</li>\n");
      out.write("<li>List item two</li>\n");
      out.write("<li>List item three</li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("<h3>Section 4</h3>\n");
      out.write("<div>\n");
      out.write("<p>\n");
      out.write("Cras dictum. Pellentesque habitant morbi tristique senectus et netus\n");
      out.write("et malesuada fames ac turpis egestas. Vestibulum ante ipsum primis in\n");
      out.write("faucibus orci luctus et ultrices posuere cubilia Curae; Aenean lacinia\n");
      out.write("mauris vel est.\n");
      out.write("</p>\n");
      out.write("<p>\n");
      out.write("Suspendisse eu nisl. Nullam ut libero. Integer dignissim consequat lectus.\n");
      out.write("Class aptent taciti sociosqu ad litora torquent per conubia nostra, per\n");
      out.write("inceptos himenaeos.\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
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
