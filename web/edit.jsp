<%@ page import="kz.bitlab.Student" %><%--
  Created by IntelliJ IDEA.
  User: Qaira
  Date: 26.07.2022
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

            <%
                Student student= (Student) request.getAttribute("student");

            %>
<form action="/edit" method="post">
    <div class="form-group">
        <label for="exampleInputEmail1">Name</label>
        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Name" name="name" value="<%=student.getName()%>">
    </div>

    <div class="form-group">
        <label for="exampleInputEmail2">Surname</label>
        <input type="text" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp" placeholder="Surname" name="surname" value="<%=student.getSurname()%>">
    </div>

    <div class="form-group">
        <label for="exampleInputPassword1">Birthday</label>
        <input type="text" class="form-control" id="exampleInputPassword1" placeholder="Birthday" name="birthday" value="<%=student.getBirthdate()%>">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword2">City</label>
        <input type="text" class="form-control" id="exampleInputPassword2" placeholder="City" name="city" value="<%=student.getCity()%>">
    </div>
    <br>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
