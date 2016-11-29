<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
    <link rel="shortcut icon" href="<c:url value='/resources/assets/ico/favicon.png'/>" />
    

    <title> Collaborative e-Site</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value='/resources/assets/css/bootstrap.css'/>" rel="stylesheet"/>

    <!-- Custom styles for this template -->
    <link href="<c:url value='/resources/assets/css/main.css'/>" rel="stylesheet" />
    <link rel="stylesheet" href="<c:url value='/resources/assets/css/icomoon.css'/>" />
    <link href="<c:url value='/resources/assets/css/animate-custom.css'/>" rel="stylesheet" />


    
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,700' rel='stylesheet' type='text/css'>
    
    <script src="<c:url value='/resources/assets/js/jquery.min.js'/>" ></script>
	<script type="text/javascript" src="<c:url value='/resources/assets/js/modernizr.custom.js'/>" ></script>
    
    <script type="text/javascript" src="<c:url value='/resources/assets/js/bootstrap.min.js'/>" ></script>
	<script type="text/javascript" src="<c:url value='/resources/assets/js/retina.js'/>" ></script>
	<script type="text/javascript" src="<c:url value='/resources/assets/js/jquery.easing.1.3.js'/>" ></script>
    <script type="text/javascript" src="<c:url value='/resources/assets/js/smoothscroll.js'/>" ></script>
	<script type="text/javascript" src="<c:url value='/resources/assets/js/jquery-func.js'/>" ></script>
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="assets/js/html5shiv.js"></script>
      <script src="assets/js/respond.min.js"></script>
    <![endif]-->
  </head>
<body>
<%@include file="header.jsp" %>
<div class="container">
  <h3>Tooltip Options</h3>
  <p>The <strong>html</strong> option specifies whether to accept HTML tags in the tooltip.</p>
  <button class="btn btn-success btn-md">Hover over me</button>
</div>

<script>
$(document).ready(function(){
    $('.btn').tooltip({title: "<h1><strong>HTML</strong> inside <code>the</code> <em>tooltip</em></h1>", html: true, placement: "top"});
});
</script>

<div class="container">
  <h3>Tooltip Options</h3>
  <p>The <strong>placement</strong> option specifies the tooltip position.</p>
  <div>
    <button class="btn btn-warning btn-md">Top</button>
    <button class="btn btn-success btn-md">Bottom</button>
    <button class="btn btn-danger btn-md">Left</button>
    <button class="btn btn-default btn-md">Right</button>
  </div>
</div>

<script>
$(document).ready(function(){
    $('.btn-warning').tooltip({title: "Hooray", placement: "top"});
    $('.btn-success').tooltip({title: "Hooray", placement: "bottom"});
    $('.btn-danger').tooltip({title: "Hooray", placement: "left"});
    $('.btn-default').tooltip({title: "Hooray", placement: "right"});
});
</script>

<div class="container">
  <h2>Alerts</h2>
  <div class="alert alert-success">
    <strong>Success!</strong> This alert box could indicate a successful or positive action.
  </div>
  <div class="alert alert-info">
    <strong>Info!</strong> This alert box could indicate a neutral informative change or action.
  </div>
  <div class="alert alert-warning">
    <strong>Warning!</strong> This alert box could indicate a warning that might need attention.
  </div>
  <div class="alert alert-danger">
    <strong>Danger!</strong> This alert box could indicate a dangerous or potentially negative action.
  </div>
</div>

<%@include file="footer.jsp" %>
</body>
</html>

