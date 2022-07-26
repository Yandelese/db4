<%--
  Created by IntelliJ IDEA.
  User: Qaira
  Date: 22.07.2022
  Time: 13:53
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
            <form action="/addstudent" method="post">
                <div class="form-group">
                    <label for="exampleInputEmail1">Name</label>
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Name" name="name">
                </div>

                <div class="form-group">
                    <label for="exampleInputEmail2">Surname</label>
                    <input type="text" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp" placeholder="Surname" name="surname">
                </div>

                <div class="form-group">
                    <label for="exampleInputPassword1">Birthday</label>
                    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="Birthday" name="birthday">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword2">City</label>
                    <input type="text" class="form-control" id="exampleInputPassword2" placeholder="City" name="city">
                </div>
                <br>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
</body>
</html>
