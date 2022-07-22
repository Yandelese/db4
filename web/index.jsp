<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.News" %><%--
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
<%@include file="header.jsp"%>



            <%ArrayList<News> newsArrayList= (ArrayList<News>) request.getAttribute("newslist");
                if(newsArrayList!=null){
                    for (News news:newsArrayList) {
            %>




               <div class="card">
                   <div class="card-header">
                       <%=news.getCategory()%>
                   </div>
                   <div class="card-body">
                       <h6 class="card-title"><%=news.getTitle()%></h6>
                       <h6 class="card-title"><%=news.getContent()%></h6>
                       <h6 class="card-title"><%=news.getAuthor()%></h6>
                   </div>
               </div>

               <%
                   }
                   }
               %>

       </div>

</body>
</html>
