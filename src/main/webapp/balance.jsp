<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Global Banking ..</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	function ctck() {
		var sds = document.getElementById("dum");

	}
</script>
</head>
<body>
	<div id="top_links">

		<div id="top_links">


			<div id="header">
				<h1>
					APANA - BANK<span class="style1"></span>
				</h1>
				<h2>ExtraOrdinary Service</h2>
				<A href="index.jsp"><IMG SRC="images/home1.gif"></IMG></A>
			</div>


			<div align="right">
				<p style="color: white; font-style: italic; font: bold;">Welcome
					To APANA - BANK ${succes.username}</p>
			</div>

			<div id="navigation">
				<ul>
					<li><a href="create.jsp">NEW ACCOUNT</a></li>
					<li><a href="balance1.jsp">BALANCE</a></li>
					<li><a href="deposit1.jsp">DEPOSIT</a></li>
					<li><a href="withdraw1.jsp">WITHDRAW</a></li>
					<li><a href="transfer1.jsp">TRANSFER</a></li>
					<li><a href="closeac1.jsp">CLOSE A/C</a></li>
					<li><a href="about.jsp">Contact Us</a></li>
				</ul>
			</div>



			<table style="width: 897px; background: #FFFFFF; margin: 0 auto;">
				<tr>
					<td width="300" valign="top"
						style="border-right: #666666 1px dotted;">
						<div id="services">
							<h1>Services</h1>
							<br>
							<ul>
								<li><a href="#">www.javatpoint.com</a></li>
								<li><a href="#">www.javacstpoint.com </a></li>
								<li><a href="#">www.javatpoint.com/forum.jsp</a></li>
							</ul>

						</div>
					<td width="1200" valign="top">
						<table border="1">
							<tr>								
								<th>USERNAME</th>
								<th>AMOUNT</th>
								<th>ADDRESS</th>
								<th>PHONE</th>
							</tr>

							<tr>								
								<td>${succes.username}</td>
								<td>${succes.amount}</td>
								<td>${succes.address}</td>
								<td>${succes.phone}</td>
							</tr>

						</table>
					</td>
				</tr>
			</table>
</body>
</html>