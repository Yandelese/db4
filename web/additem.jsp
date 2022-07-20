<%--
  Created by IntelliJ IDEA.
  User: Qaira
  Date: 20.07.2022
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
                        <div class="alert alert-success" role="alert">
                            <form action="/DBManager" method="post">
                                Name:<br>
                                <input type="text" name="name">
                                <br>
                                Price:<br>
                                <input type="text" name="price">
                                <br>
                                Amount:<br>
                                <input type="text" name="amount">
                                <br><br>
                                <button type="submit" class="btn btn-primary">Add Item</button>
                            </form>
                        </div>

</body>
</html>
