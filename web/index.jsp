<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.Items" %><%--
  Created by IntelliJ IDEA.
  User: Qaira
  Date: 20.07.2022
  Time: 11:15
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
    <title>Title</title>
</head>
<body>
        <div>
            <nav class="navbar navbar-expand-sm bg-dark">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="/allitems">BITLAB SHOP</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/allitems">ALL ITEMS</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/additems">ADD ITEMS</a>
                    </li>
                </ul>
            </nav>
        </div>


            <div>
            <table class="table">
               <thead>
               <tr>
                   <th scope="col">ID</th>
                   <th scope="col">NAME</th>
                   <th scope="col">PRICE</th>
                   <th scope="col">AMOUNT</th>
                   <th scope="col">DETAILS</th>
               </tr>
               </thead>
               <tbody>

               <%ArrayList<Items> itemsArrayList= (ArrayList<Items>) request.getAttribute("tovary");
               if(itemsArrayList!=null){
                   for (Items item:itemsArrayList) {
               %>

               <tr>
                   <th scope="row"><%=item.getId()%></th>
                   <td><%=item.getName()%></td>
                   <td><%=item.getPrice()%></td>
                   <td><%=item.getAmount()%></td>
                   <td><a href="/Details?itemsid=<%=item.getId()%>">DETAILS</a> </td>
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
