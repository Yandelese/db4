<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.Items" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <%@include file="header.jsp"%>
</head>

<body>
           <br>
<%--           <div><a href="/addstudent" class="btn btn-primary">Add-Student</a></div>--%>

           <div>
               <table class="table">
                   <thead>
                   <tr>
                       <th scope="col">ID</th>
                       <th scope="col">Name</th>
                       <th scope="col">Description</th>
                       <th scope="col">Price</th>
                   </tr>
                   </thead>
                   <tbody>

                   <%
                       ArrayList<Items>itemsArrayList= (ArrayList<Items>) request.getAttribute("items");
                       if(itemsArrayList!=null){
                           for (Items items:itemsArrayList) {
                   %>
                   <tr>
                       <th scope="row"><%=items.getId()%></th>
                       <td><%=items.getName()%></td>
                       <td><%=items.getDescription()%></td>
                       <td><%=items.getPrice()%></td>
                   </tr>

                   <%
                           }
                       }
                   %>
                   </tbody>
               </table>
           </div>
</body>
</html>
