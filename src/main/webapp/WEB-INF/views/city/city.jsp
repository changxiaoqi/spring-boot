<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
    <link href="/static/css/table.css"
          rel="stylesheet"/>
</head>
<body>
<div class="table-c">
    <table id="table" border="0" cellspacing="0" cellpadding="0"></table>
</div>
    <script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
    <script src="/static/js/city/city.js"></script>
    <script>
        page.init();
    </script>
</body>
</html>
