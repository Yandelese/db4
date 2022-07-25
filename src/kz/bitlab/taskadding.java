package kz.bitlab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/taskadding")

        public class taskadding extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                String task=request.getParameter("task");
                String description=request.getParameter("description");
                String deadline=request.getParameter("deadline");
                Task task1=new Task(null,task,description,deadline);
                DBmanager.addtask(task1);
                response.sendRedirect("/home");
        }

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                request.getRequestDispatcher("/taskadding.jsp").forward(request,response);
        }
}
