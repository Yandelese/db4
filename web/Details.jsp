<%@ page import="kz.bitlab.Items" %><%--
  Created by IntelliJ IDEA.
  User: Qaira
  Date: 21.07.2022
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
            <%
                Items item= (Items) request.getAttribute("details");

            %>
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title"><%=item.getId()%></h5>
                    <h5 class="card-title"><%=item.getName()%></h5>
                    <h5 class="card-title"><%=item.getPrice()%></h5>
                    <h5 class="card-title"><%=item.getAmount()%></h5>
                </div>
            </div>

</body>
</html>
