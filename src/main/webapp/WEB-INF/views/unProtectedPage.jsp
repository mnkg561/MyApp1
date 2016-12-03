<%--
    JBoss, Home of Professional Open Source
    Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
    contributors by the @authors tag. See the copyright.txt in the
    distribution for a full listing of individual contributors.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
<title>Intranet Landing Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/resources/css/screen.css"/>" />
</head>

<body>
	<div class="main">
		<div class="one">
			<div class="register">

				<h1>This is Unprotected page</h1>
				<br /> <br /> <br />
				<h3>This page can be accessed by all the employees without any
					login</h3>

				<a
					href="http://myapp1.naveen.com:8080/MyApp1/sample/protected/page1"
					target="_blank">All Employees Application!</a>

				<p>All Employess Application is an application which is
					protected by SSO and can be accessed by any employee</p>

				<a
					href="http://myapp1.naveen.com:8080/MyApp1/sample/protected/page1"
					target="_blank">HR Application!</a>

				<p>All Employess Application is an application which is
					protected by SSO and can be accessed by only HR Dept employees</p>

				<a
					href="http://myapp1.naveen.com:8080/MyApp1/sample/protected/page1"
					target="_blank">Payroll Application!</a>

				<p>All Employess Application is an application which is
					protected by SSO and can be accessed by only Payroll Dept employees</p>

				<a
					href="http://myapp1.naveen.com:8080/MyApp1/sample/mfa/page"
					target="_blank">MFA Application!</a>

				<p>MFA Application is an application which is
					protected by SSO and MFA and can be accessed by only after one time password</p>

				
			</div>
		</div>
	</div>
</body>
</html>
