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
            int exampoints= Integer.parseInt(request.getParameter("exam_points"));

            String a=("A");
            String b=("B");
            String c=("C");
            String d=("D");
            String f=("F");



                if(exampoints>=90){
                    out.print("<h1>"+name+" "+a+" for exam "+"</h1>");
                }
                if(exampoints<=89 & exampoints>=75){
                    out.print("<h1>" +name+" "+b+" for exam "+"</h1>");
                }
                if(exampoints<=74 & exampoints>=60){
                out.print("<h1>"+name+" "+c+" for exam "+"</h1>");
                }
                if(exampoints<=59 & exampoints>=50){
                out.print("<h1>"+name+" "+d+" for exam "+"</h1>");
                }
                if(exampoints<=49 ){
                out.print("<h1>"+name+" "+f+" for exam "+"</h1>");
            }


        }


        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();


    }

}
