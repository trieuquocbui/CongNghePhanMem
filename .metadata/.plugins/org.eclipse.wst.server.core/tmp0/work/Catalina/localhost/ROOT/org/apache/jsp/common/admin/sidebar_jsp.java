/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2023-03-01 07:27:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.common.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1677483340571L));
    _jspx_dependants.put("jar:file:/D:/java/CongNghePhanMem/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shopsport/WEB-INF/lib/spring-webmvc-4.3.13.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1511752906000L));
    _jspx_dependants.put("jar:file:/D:/java/CongNghePhanMem/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shopsport/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1662952889998L));
    _jspx_dependants.put("jar:file:/D:/java/CongNghePhanMem/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shopsport/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.13.RELEASE.jar", Long.valueOf(1662952888970L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1662998118876L));
    _jspx_dependants.put("jar:file:/D:/java/CongNghePhanMem/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shopsport/WEB-INF/lib/spring-webmvc-4.3.13.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1511752906000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("<aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\r\n");
      out.write("\t<!-- Brand Logo -->\r\n");
      out.write("\t<a href=\"/admin/home\" class=\"brand-link\"> <img\r\n");
      out.write("\t\tsrc='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'\r\n");
      out.write("\t\talt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\"\r\n");
      out.write("\t\tstyle=\"opacity: .8\"> <span class=\"brand-text font-weight-light\">Shop</span>\r\n");
      out.write("\t</a>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Sidebar -->\r\n");
      out.write("\t<div class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- SidebarSearch Form -->\r\n");
      out.write("\t\t<div class=\"form-inline\">\r\n");
      out.write("\t\t\t<div class=\"input-group\" data-widget=\"sidebar-search\">\r\n");
      out.write("\t\t\t\t<input class=\"form-control form-control-sidebar\" type=\"search\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("\t\t\t\t<div class=\"input-group-append\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-sidebar\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-search fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Sidebar Menu -->\r\n");
      out.write("\t\t<nav class=\"mt-2\">\r\n");
      out.write("\t\t\t<ul class=\"nav nav-pills nav-sidebar flex-column\"\r\n");
      out.write("\t\t\t\tdata-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"> <i class=\"fas fa-users-cog\"></i>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tQuản lí nhân viên<i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-treeview\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i class=\"fas fa-address-book\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Danh sách nhân viên</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i class=\"fas fa-registered\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Đăng kí tài khoản</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"> <i class=\"fas fa-users\"></i>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tQuản lí khách hàng<i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-treeview\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i class=\"fas fa-address-book\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Danh sách khách hàng</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"> <i class=\"fas fa-bars\"></i>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tQuản lí danh mục<i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-treeview\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i class=\"fas fa-list-ul\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Danh sách danh muc</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i class=\"fas fa-list-ul\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Tạo danh muc</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"> <i class=\"fas fa-users\"></i>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tQuản lí sản phẩm<i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-treeview\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Danh sách sản phẩm</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f7(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Thêm sản phẩm</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"> <i class=\"fas fa-users\"></i>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tQuản lí đơn hàng<i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-treeview\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f8(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Danh sách dơn hàng</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"> <i class=\"fas fa-users\"></i>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tQuản lí nhập hàng<i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-treeview\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f9(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Danh sách nhập hàng</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"> <i class=\"fas fa-users\"></i>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tQuản lí nhà cung cấp<i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-treeview\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f10(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Danh sách nhà cung cấp</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f11(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Thêm nhà cung cấp</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a href=\"#\" class=\"nav-link\"> <i class=\"fas fa-users\"></i>\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\tThống kê<i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-treeview\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f12(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Thống kê doanh thu</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-item\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref='");
      if (_jspx_meth_c_005furl_005f13(_jspx_page_context))
        return;
      out.write("' class=\"nav-link\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Thống kê sản phẩm tồn kho</p>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<!-- /.sidebar-menu -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.sidebar -->\r\n");
      out.write("</aside>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("\t<!-- Control sidebar content goes here -->\r\n");
      out.write("</aside>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /common/admin/sidebar.jsp(7,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/templates/admin/dist/img/AdminLTELogo.png");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /common/admin/sidebar.jsp(40,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/admin/management/staff/list");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /common/admin/sidebar.jsp(45,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("/admin/management/staff/add");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f3_reused = false;
    try {
      _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f3.setParent(null);
      // /common/admin/sidebar.jsp(59,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f3.setValue("/admin/management/customer/list");
      int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
      if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      _jspx_th_c_005furl_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f4_reused = false;
    try {
      _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f4.setParent(null);
      // /common/admin/sidebar.jsp(73,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f4.setValue("/admin/management/category/list");
      int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
      if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      _jspx_th_c_005furl_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f4, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f5_reused = false;
    try {
      _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f5.setParent(null);
      // /common/admin/sidebar.jsp(77,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f5.setValue("/admin/management/category/add");
      int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
      if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      _jspx_th_c_005furl_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f5, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f6_reused = false;
    try {
      _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f6.setParent(null);
      // /common/admin/sidebar.jsp(91,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f6.setValue("/admin/management/product/list");
      int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
      if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      _jspx_th_c_005furl_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f6, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f7_reused = false;
    try {
      _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f7.setParent(null);
      // /common/admin/sidebar.jsp(96,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f7.setValue("/admin/management/product/add");
      int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
      if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      _jspx_th_c_005furl_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f7, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f8_reused = false;
    try {
      _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f8.setParent(null);
      // /common/admin/sidebar.jsp(111,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f8.setValue("/admin/list-staff");
      int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
      if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      _jspx_th_c_005furl_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f8, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f9_reused = false;
    try {
      _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f9.setParent(null);
      // /common/admin/sidebar.jsp(126,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f9.setValue("/admin/list-staff");
      int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
      if (_jspx_th_c_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      _jspx_th_c_005furl_005f9_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f9, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f9_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f10(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f10_reused = false;
    try {
      _jspx_th_c_005furl_005f10.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f10.setParent(null);
      // /common/admin/sidebar.jsp(141,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f10.setValue("/admin/management/supplier/list");
      int _jspx_eval_c_005furl_005f10 = _jspx_th_c_005furl_005f10.doStartTag();
      if (_jspx_th_c_005furl_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
      _jspx_th_c_005furl_005f10_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f10, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f10_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f11(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f11_reused = false;
    try {
      _jspx_th_c_005furl_005f11.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f11.setParent(null);
      // /common/admin/sidebar.jsp(147,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f11.setValue("/admin/management/supplier/add");
      int _jspx_eval_c_005furl_005f11 = _jspx_th_c_005furl_005f11.doStartTag();
      if (_jspx_th_c_005furl_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f11);
      _jspx_th_c_005furl_005f11_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f11, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f11_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f12(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f12_reused = false;
    try {
      _jspx_th_c_005furl_005f12.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f12.setParent(null);
      // /common/admin/sidebar.jsp(161,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f12.setValue("/admin/list-staff");
      int _jspx_eval_c_005furl_005f12 = _jspx_th_c_005furl_005f12.doStartTag();
      if (_jspx_th_c_005furl_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f12);
      _jspx_th_c_005furl_005f12_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f12, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f12_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f13(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f13_reused = false;
    try {
      _jspx_th_c_005furl_005f13.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f13.setParent(null);
      // /common/admin/sidebar.jsp(166,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f13.setValue("/admin/list-staff");
      int _jspx_eval_c_005furl_005f13 = _jspx_th_c_005furl_005f13.doStartTag();
      if (_jspx_th_c_005furl_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f13);
      _jspx_th_c_005furl_005f13_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f13, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f13_reused);
    }
    return false;
  }
}
