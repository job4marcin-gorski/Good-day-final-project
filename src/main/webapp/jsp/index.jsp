<%@page import="com.example.goodday.db.User"%>
<%@page import="java.util.List"%>
<%@page import="com.example.goodday.controller.MockUserController"%>
<html>

<head>

</head>

<body>

  Hello :)
  <br>
  <% for (int i=0;i<20;i++) { %>
  
  	<%=i%>  <%=i%2==0?"parzyste":""%><br>
  	
  <%} %>

<table>
   <tr><th> Name </th><th> Email </th></tr>
  <%  List<User> users=MockUserController.getAll();
      for (User u :users) {
    	  %> <tr><td><%=u.getName()%> </td><td> <%=u.getEmail() %></td></tr> <%
      }
  %>
</table>
</body>

</html>