<%--
  Created by IntelliJ IDEA.
  User: edicson
  Date: 4/2/17
  Time: 6:57 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/taglibs.jsp" %>
<%@ page session="false" %>
<html lang="en">
<head>
    <title><s:message code="spittr.title" /></title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <link rel="icon" href="public/favicon.ico">

    <!--<link href="public/favicon.ico" rel="icon" type="image/x-icon" />-->
    <!-- Bootstrap -->
    <link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/bootstrap-theme.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/jumbotron-narrow.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/appStyle.css"/>">
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css"> <!-- load fontawesome -->
    <!--<link href="public/stylesheets/sticky-footer.css" rel="stylesheet">-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <div class="container">
        <t:insertAttribute name="header" />
        <t:insertAttribute name="body" />
        <t:insertAttribute name="footer" />
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <%--<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>--%>
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <%--<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>--%>

</body>
</html>
