<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="org.yari.task1.*, javax.naming.* "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<%  
 		try {
 			Context context = new InitialContext();
	 		UserManagerRemote manager = null;
	 		manager = (UserManagerRemote) context.lookup("java:global/ear-1.0/ejbs-1.0/UserManager");
	 		manager.createUser("jsp");
 		} catch (Exception e) {
 			out.println(e.toString());
        }
 	%>
</body>
</html>
