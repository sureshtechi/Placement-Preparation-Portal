<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.UUID" %>
<!DOCTYPE html>
<HTML>
<HEAD> 
<TITLE> OUT IMPLICIT OBJECT EXAMPLE </TITLE>
</HEAD>
<BODY>
<%
String uniqueID = UUID.randomUUID().toString();
out.print( uniqueID );
out.println( "println" );
out.print("Another print statement");
%>
</BODY>
</HTML>