<%--
  Created by IntelliJ IDEA.
  User: Qaira
  Date: 21.07.2022
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page import="kz.bitlab.News" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Qaira
  Date: 21.07.2022
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
                <%ArrayList<News> cinemanews= (ArrayList<News>) request.getAttribute("cinemanews");
                    if(cinemanews!=null){
                        for (News news:cinemanews) {
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
</body>
</html>

</body>
</html>
