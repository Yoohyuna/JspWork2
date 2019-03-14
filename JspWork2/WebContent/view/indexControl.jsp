<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    //  /view/indexControl.jsp?CONTROL,PAGENUM
    String CONTROL=null; //전달할 페이지명
    String PAGENUM=null;//페이지번호
    
    try{
    	CONTROL=request.getParameter("CONTROL");
    	PAGENUM=request.getParameter("PAGENUM");
    	System.out.println("CONTROL=>"+CONTROL+",PAGENUM=>"+PAGENUM);
    	//만약에 중간에 전달 못받는 상태가 발생->기본적인 파일을 불러오게 하기위해서
    	//intro_01.jsp
    	if(CONTROL.equals(null)){
    		CONTROL="intro";
    	}
    	
    	if(PAGENUM.equals(null)){
    		PAGENUM="01";
    	}
    }catch(Exception e){
    	e.printStackTrace();
    }

%>
     <jsp:forward page="/template/template.jsp">
     <jsp:param name="CONTROL"  value="<%=CONTROL %>" />
     <jsp:param name="PAGENUM"  value="<%=PAGENUM %>" />
  </jsp:forward>
  
  
  
  
  
  