/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2022-11-17 04:02:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import modelo.*;

public final class PagPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("modelo");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\"/>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    \r\n");
      out.write("    ");

      Vendedor v1= new Vendedor(1,"Caleb","Dress");  
      Vendedor v2= new Vendedor(2,"Cristian","Fort");  
      Vendedor v3= new Vendedor(3,"Dylan","Seltzer");  
      
      Cliente c1= new Cliente("Gonzalo","Gimenez","Villa del Parque",1526152,"Gonza123@");
        
      Pc pc1= new Pc("HP Atlon One",5000,v1); 
      Pc pc2= new Pc("HP All In One",5000,v1); 
      Pc pc3= new Pc("Gaming InPlus",15000,v2); 
      Pc pc4= new Pc("Gaming AMD",20000,v3); 
      
      
      Ram ram1 = new Ram("Fury","USA",8000,8);
      Ram ram2 = new Ram("LXR","Arg",13000,16);
      Ram ram3 = new Ram("Fury","USA",5500,4);
      Ram ram4 = new Ram("HP","USA",7000,8);
      
      
      Procesador p1 = new Procesador("Intel I5","USA",30000,3500);
      Procesador p2 = new Procesador("Intel I7","USA",45000,4800);
      Procesador p3 = new Procesador("AMD Rayzen 5","Arg",40000,3900);
      Procesador p4 = new Procesador("AMD Rayzen 7","USA",50000,5100);
      
      
      Gabinete gab1= new Gabinete("HP","USA",10000,"Negro/Led");
      Gabinete gab2= new Gabinete("HP","Arg",8000,"Negro Mate");
      Gabinete gab3= new Gabinete("TzLight","Arg",10000,"Negro/Led");
      Gabinete gab4= new Gabinete("Velor","Arg",10000,"Negro/Led");
      
      pc1.agregarComp(ram1);
      pc1.agregarComp(p1);
      pc1.agregarComp(gab1);
      
      pc2.agregarComp(ram2);
      pc2.agregarComp(p2);
      pc2.agregarComp(gab2);
      
      pc3.agregarComp(ram3);
      pc3.agregarComp(p3);
      pc3.agregarComp(gab3);
      
      pc4.agregarComp(ram4);
      pc4.agregarComp(ram4);
      pc4.agregarComp(p4);
      pc4.agregarComp(gab4);
      
      Factura f1= new Factura(c1,pc1,v1);
      Factura f2= new Factura(c1,pc2,v1);
      
      
   
    
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"logo__container\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <img src=\"img/logo_pag.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"links\">\r\n");
      out.write("            <a href=\"#\">Inicio</a>\r\n");
      out.write("            <a href=\"#\">About us</a>\r\n");
      out.write("            <a href=\"estadisticas.jsp\">Estadisticas</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    <div class=\"Main\">\r\n");
      out.write("\r\n");
      out.write("        <h1>Bienvenidos a TecnoWorld</h1>\r\n");
      out.write("       <form action=\"Compra\">\r\n");
      out.write("            <div class=\"economicas__container\">\r\n");
      out.write("                <div class=\"pcs__container\">\r\n");
      out.write("                    <h2>Computadoras HP</h2>\r\n");
      out.write("                    <div class=\"pc\">\r\n");
      out.write("                        <h3> ");
      out.print( pc1.getNombre());
      out.write(" </h3>\r\n");
      out.write("                        <div class=\"pc__img__container\">\r\n");
      out.write("                            <img src=\"img/epc1.png\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>");
      out.print( ram1.toString());
      out.write("</p>\r\n");
      out.write("                        <p>");
      out.print( p1.toString());
      out.write("</p>\r\n");
      out.write("                        <p>");
      out.print( gab1.toString());
      out.write("</p>\r\n");
      out.write("                        <h3>Publicado por ");
      out.print(pc1.toString());
      out.write("</h3>\r\n");
      out.write("                        <h2 class=\"precio\">$");
      out.print( pc1.calcularTotalPc());
      out.write("</h2>\r\n");
      out.write("                        <input type=\"submit\" value=\"Comprar\" name=\"pc1\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"pc\">\r\n");
      out.write("                        <h3>");
      out.print( pc2.getNombre());
      out.write("</h3>\r\n");
      out.write("                        <div class=\"pc__img__container\">\r\n");
      out.write("                            <img src=\"img/epc2.png\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                       <p>");
      out.print( ram2.toString());
      out.write("</p>\r\n");
      out.write("                        <p>");
      out.print( p2.toString());
      out.write("</p>\r\n");
      out.write("                        <p>");
      out.print( gab2.toString());
      out.write("</p>\r\n");
      out.write("                        <h3>Publicado por ");
      out.print(pc2.toString());
      out.write("</h3>\r\n");
      out.write("                        <h2 class=\"precio\">$");
      out.print( pc2.calcularTotalPc());
      out.write("</h2>\r\n");
      out.write("                        <input type=\"submit\" value=\"Comprar\" name=\"pc2\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"pcs__container\">\r\n");
      out.write("                    <h2>Computadoras Armadas</h2>\r\n");
      out.write("                    <div class=\"pc\">\r\n");
      out.write("                        <h3>");
      out.print( pc3.getNombre());
      out.write("</h3>\r\n");
      out.write("                        <div class=\"pc__img__container\">\r\n");
      out.write("                            <img src=\"img/eg1.png\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>");
      out.print( ram3.toString());
      out.write("</p>\r\n");
      out.write("                        <p>");
      out.print( p3.toString());
      out.write("</p>\r\n");
      out.write("                        <p>");
      out.print( gab3.toString());
      out.write("</p>\r\n");
      out.write("                        <h3>Publicado por ");
      out.print(pc3.toString());
      out.write("</h3>\r\n");
      out.write("                        <h2 class=\"precio\">$");
      out.print( pc3.calcularTotalPc());
      out.write("</h2>\r\n");
      out.write("                        <input type=\"submit\" value=\"Comprar\" name=\"pc3\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"pc\">\r\n");
      out.write("                        <h3>");
      out.print( pc4.getNombre());
      out.write("</h3>\r\n");
      out.write("                        <div class=\"pc__img__container\">\r\n");
      out.write("                            <img src=\"img/eg2.png\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p>");
      out.print( ram4.toString());
      out.write("</p>\r\n");
      out.write("                        <p>");
      out.print( p4.toString());
      out.write("</p>\r\n");
      out.write("                        <p>");
      out.print( gab4.toString());
      out.write("</p>\r\n");
      out.write("                        <h3>Publicado por ");
      out.print(pc4.toString());
      out.write("</h3>\r\n");
      out.write("                        <h2 class=\"precio\">$");
      out.print( pc4.calcularTotalPc());
      out.write("</h2>\r\n");
      out.write("                        <input type=\"submit\" value=\"Comprar\" name=\"pc4\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("            </div>\r\n");
      out.write("              \r\n");
      out.write("        </form>\r\n");
      out.write("                        \r\n");
      out.write("                  \r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
