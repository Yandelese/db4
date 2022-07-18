package kz.bitlab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/DB")

        public class DB extends HttpServlet  {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String name=request.getParameter("name");
            String surname=request.getParameter("surname");
            String food=request.getParameter("selectedvariant");

            out.print("<h1>"+name+"</h1>");
            out.print("<h1>"+surname+"</h1>");
            out.print("<h1>"+food+"</h1>");



            System.out.println(name+surname);
        }


        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();


    }

}
