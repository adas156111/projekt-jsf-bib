<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%><%@taglib
	uri="http://java.sun.com/jsf/core" prefix="f"%><%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<f:view>
		<h:form style="height: 127px; ">		
			<h:panelGrid border="1" columns="2">
				<h:outputText value="Login"></h:outputText>
				<h:inputText value="#{userLoginBean.login}"></h:inputText>
				<h:outputText value="Password"></h:outputText>
				<h:inputSecret value="#{userLoginBean.password}">
				</h:inputSecret>
			</h:panelGrid><h:commandButton value="Login" action="#{userLoginBean.logowanie }"></h:commandButton>
		</h:form>
	</f:view></body>
</html>