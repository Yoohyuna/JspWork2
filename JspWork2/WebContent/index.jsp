<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지 전달용</title>
</head><!-- intro_01.jsp -->
<body><!--index.jsp?매개변수명(CONTROL)=전달할값&매개변수2=전달할값2&,,,  -->
  <jsp:forward page="/view/indexControl.jsp">
     <jsp:param name="CONTROL"  value="intro" />
     <jsp:param name="PAGENUM"  value="01" />
  </jsp:forward>
</body>
</html>