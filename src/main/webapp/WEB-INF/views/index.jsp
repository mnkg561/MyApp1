
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
<title>Intranet Protected Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/resources/css/screen.css"/>" />
<style>
body {
	background-color: white;
}

div {
	margin-left: 125px;
	margin-top: 10px;
	margin-right: 200px;
}

a.button {
	-webkit-appearance: button;
	-moz-appearance: button;
	appearance: button;
	text-decoration: none;
	color: green;
	position: absolute;
	right: 10px;
	margin-top: 15px;
}

img {
	max-width: 100%;
	height: auto;
}

h4{
color: green;
}

h3{
color: blue;
}
</style>
</head>

<body>

	<a href="http://ssologin.naveen.com:8080/SSOLogin/logout"
		class="button">Logout</a>
	<div>

		<img src="/MyApp1/static/resources/gfx/marketing.jpg"
			alt="Marketing View" style="width: 1200; height: 480">
		<h4 align="right">Welcome <b>${userId}</b></h4>
		<span /> <span /> <span /> <span />
		<h3>This is Marketing page and accessed only by Marketing_Dept
			group</h3>
	</div>

</body>
</html>
