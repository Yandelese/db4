<%@ page import="kz.bitlab.Student" %><%--
  Created by IntelliJ IDEA.
  User: Qaira
  Date: 26.07.2022
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
                    <%
                        Student student= (Student) request.getAttribute("details");
                    %>
                    <div class="card" style="width: 18rem;">
                        <div class="card-body">
                            <h5 class="card-title"><%=student.getId()%></h5>
                            <p class="card-text"><%=student.getName()%></p>
                            <p class="card-text"><%=student.getSurname()%></p>
                            <p class="card-text"><%=student.getBirthdate()%></p>
                            <p class="card-text"><%=student.getCity()%></p>

                        </div>
                    </div>
</body>
</html>
