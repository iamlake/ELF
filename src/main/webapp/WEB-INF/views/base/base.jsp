<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!-- layui -->
<link rel="stylesheet" href="<%=basePath%>/assets/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="<%=basePath%>/assets/css/common.css" media="all" />
<script type="text/javascript" src="<%=basePath%>/assets/layui/layui.js"></script>
<!-- TODO 页面公共资源 -->
<script type="text/javascript">
	var basePath = '<%=basePath%>'
</script>