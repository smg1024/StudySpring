/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2022-12-20 06:30:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/include/top.jspf", Long.valueOf(1671088965000L));
    _jspx_dependants.put("/include/bottom.jspf", Long.valueOf(1670490642000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1670464208072L));
    _jspx_dependants.put("jar:file:/Users/poby/StudySpring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/webSpringTest/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/js_css/style.css\" type=\"text/css\">\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<div class=\"topMenu\">\n");
      out.write("		<ul>\n");
      out.write("			<li><a href=\"/myapp/\">???</a></li>\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("			<li><a href=\"/myapp/board/boardList\">?????????</a></li>\n");
      out.write("			<li><a href=\"/myapp/data/dataList\">?????????</a></li>\n");
      out.write("		</ul>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- attribute : vo -->\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ vo.subject }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</title>\n");
      out.write("<style>\n");
      out.write("	#content{\n");
      out.write("		width:400px;\n");
      out.write("		height:60px;\n");
      out.write("	}\n");
      out.write("	#commentList>li{\n");
      out.write("		border-bottom:1px solid gray;\n");
      out.write("		padding:5px 0px;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("	function delCheck(){\n");
      out.write("		location.href = \"/myapp/board/boardDel?postno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.postno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	// Ajax ?????? ????????????\n");
      out.write("	$(function(){\n");
      out.write("		// ?????? ?????? ????????????\n");
      out.write("		function commentList(){\n");
      out.write("			var params = {postno:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.postno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("};\n");
      out.write("			var url = \"/myapp/commentList\"\n");
      out.write("			$.ajax({\n");
      out.write("				url:url,\n");
      out.write("				data:params,\n");
      out.write("				type:\"GET\",\n");
      out.write("				success:function(result){\n");
      out.write("					// console.log(result);\n");
      out.write("					$result = $(result);\n");
      out.write("					var tag = \"\";\n");
      out.write("					\n");
      out.write("					$result.each(function(idx, commentVO){\n");
      out.write("						tag += \"<li>\";\n");
      out.write("						tag += \"<div><b>\"+commentVO.username+\"</b>(\"+commentVO.regdate+\")\";\n");
      out.write("						if(commentVO.username == '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logUsername}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'){	// ?????? ???????????? ??????/?????? ?????? ??????\n");
      out.write("							tag += \"<input type='button' value='??????'>\";\n");
      out.write("							tag += \"<input type='button' value='??????'>\";\n");
      out.write("						}\n");
      out.write("						tag += \"</div>\";\n");
      out.write("						tag += \"<div>\"+commentVO.content+\"</div>\";\n");
      out.write("						if(commentVO.username == '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logUsername}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'){	// ????????? ??? ????????? ?????? form\n");
      out.write("							tag += \"<div style='display:none'>\";\n");
      out.write("							tag += \"<form method='post'>\"\n");
      out.write("							tag += \"<textarea name='content' rows='3' cols='50'>\"+commentVO.content+\"</textarea>\";\n");
      out.write("							tag += \"<input type='hidden' name='replyno' value='\"+commentVO.replyno+\"'>\";\n");
      out.write("							tag += \"<input type='submit' value='????????????'>\";\n");
      out.write("							tag += \"</form>\";\n");
      out.write("							tag += \"</div>\";\n");
      out.write("						}\n");
      out.write("						tag += \"</li>\";\n");
      out.write("					});\n");
      out.write("					console.log(tag);\n");
      out.write("					// html() : ?????? ????????? ????????? ??????(html??????) ????????????\n");
      out.write("					// text() : ?????? ????????? ????????? ??????(text) ????????????\n");
      out.write("					$(\"#commentList\").html(tag);\n");
      out.write("					\n");
      out.write("				},error:function(e){\n");
      out.write("					console.log(e.responseText);\n");
      out.write("				}\n");
      out.write("			});\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		// ?????? form?????? submit??? ????????????\n");
      out.write("		$(\"#commentBtn\").click(function(){\n");
      out.write("			// $(this).preventDefault();	// form????????? ?????? action????????? ????????????\n");
      out.write("			\n");
      out.write("			if($(\"#content\").val()==\"\"){	// comment??????\n");
      out.write("				alert(\"????????? ???????????????.\");\n");
      out.write("				return false;\n");
      out.write("			}\n");
      out.write("			\n");
      out.write("			var params = $(\"#commentForm\").serialize();	// form??? ???????????? ????????? ??????????????? ??????\n");
      out.write("			var url = \"/myapp/commentPost\";\n");
      out.write("			\n");
      out.write("			$.ajax({\n");
      out.write("				url:url,\n");
      out.write("				data:params,\n");
      out.write("				type:\"POST\",\n");
      out.write("				success:function(result){\n");
      out.write("					// console.log(result);\n");
      out.write("					$(\"#content\").val(\"\");	// ???????????? ????????????,\n");
      out.write("					// ??? ?????? ????????? ?????? ????????????\n");
      out.write("					commentList();\n");
      out.write("				},error:function(e){\n");
      out.write("					console.log(e.responseText);\n");
      out.write("				}\n");
      out.write("			});\n");
      out.write("		});\n");
      out.write("		\n");
      out.write("		// ?????? ?????? form ????????????\n");
      out.write("		// $(document).on('???????????????','?????????',function(){});\n");
      out.write("		$(document).on('click','#commentList input[value=??????]',function(){\n");
      out.write("			$(this).parent().next().css(\"display\",\"none\");	// ?????? ??????\n");
      out.write("			$(this).parent().next().next().css(\"display\",\"block\");	// ?????? ?????? form ??????\n");
      out.write("		});\n");
      out.write("		\n");
      out.write("		// ?????? ????????????(DB????????????)\n");
      out.write("		$(document).on('submit','#commentList form',function(){\n");
      out.write("			var params = $(this).serialize();\n");
      out.write("			var url = \"/myapp/commentEdit\";\n");
      out.write("			\n");
      out.write("			$.ajax({\n");
      out.write("				url:url,\n");
      out.write("				data:params,\n");
      out.write("				type:\"POST\",\n");
      out.write("				success:function(result){\n");
      out.write("					commentList();	// ?????? ?????? ?????? ????????????\n");
      out.write("				},error:function(e){\n");
      out.write("					console.log(e.responseText);\n");
      out.write("				}\n");
      out.write("			});\n");
      out.write("			return false;\n");
      out.write("		});\n");
      out.write("		\n");
      out.write("		\n");
      out.write("		// ?????? ??? ?????? ????????? ???????????? ????????? ?????????????????? ????????????\n");
      out.write("		commentList();\n");
      out.write("	});\n");
      out.write("</script>\n");
      out.write("<div class=\"container\">\n");
      out.write("	<h1>??? ?????? ??????</h1>\n");
      out.write("	<ul>\n");
      out.write("		<li>??? ??????</li>\n");
      out.write("		<li>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ vo.postno }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("		<li>?????????</li>\n");
      out.write("		<li>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ vo.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("		<li>?????????</li>\n");
      out.write("		<li>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ vo.regdate }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("		<li>?????????</li>\n");
      out.write("		<li>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ vo.hitcount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("		<li>??????</li>\n");
      out.write("		<li>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ vo.subject }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("		<li>??????</li>\n");
      out.write("		<li>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ vo.content }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("	</ul>\n");
      out.write("	<div>\n");
      out.write("		<a href=\"/myapp/board/boardEdit?postno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ vo.postno }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">??????</a>\n");
      out.write("		<a href=\"javascript:delCheck()\">??????</a>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<!-- ?????? ?????? form -->\n");
      out.write("	<form id=\"commentForm\">\n");
      out.write("		<!-- ?????? ???????????? -->\n");
      out.write("		<input type=\"hidden\" name=\"postno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ vo.postno }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("		<textarea name=\"content\" id=\"content\"></textarea>\n");
      out.write("		<input type=\"button\" value=\"?????? ??????\" id=\"commentBtn\">\n");
      out.write("	</form>\n");
      out.write("	\n");
      out.write("	<!-- ?????? ?????? ?????? -->\n");
      out.write("	<ul id=\"commentList\">\n");
      out.write("		\n");
      out.write("	</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("	<div class=\"bottomMenu\">\n");
      out.write("		@copyright Poby.\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /include/top.jspf(15,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ logStatus!='Y' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("				<li><a href=\"/myapp/member/login\">?????????</a></li>\n");
          out.write("				<li><a href=\"/myapp/member/signup\">????????????</a></li>\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /include/top.jspf(19,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ logStatus=='Y' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("				<li><a href=\"/myapp/member/logout\">????????????</a></li>\n");
          out.write("				<li><a href=\"/myapp/member/myAccount?username=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ logUsername }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("&name=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ logName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">??????????????????</a></li>\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
