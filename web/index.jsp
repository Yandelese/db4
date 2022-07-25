<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.Task" %>
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
           <div><a href="/taskadding" class="btn btn-primary">Add-Task</a></div>

           <div>
               <table class="table">
                   <thead>
                   <tr>
                       <th scope="col">#</th>
                       <th scope="col">Name</th>
                       <th scope="col">Description</th>
                       <th scope="col">Deadline</th>
                       <th scope="col">Details</th>
                   </tr>
                   </thead>
                   <tbody>

                   <%
                       ArrayList<Task>taskArrayList= (ArrayList<Task>) request.getAttribute("spisokdel");
                       if(taskArrayList!=null){
                           for (Task task:taskArrayList) {
                   %>
                   <tr>
                       <th scope="row"><%=task.getId()%></th>
                       <td><%=task.getName()%>></td>
                       <td><%=task.getDescription()%></td>
                       <td><%=task.getDeadlineDate()%></td>
                       <td><a href="/details?id=<%=task.getId()%>" class="btn btn-primary">Details</a></td>
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
