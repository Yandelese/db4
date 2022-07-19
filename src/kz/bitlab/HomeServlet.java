package kz.bitlab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/home")

    public class HomeServlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }


        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.print("<form action='/DB' method='POST'>");
            out.print("Name: <input name='name'> <br> <br> <br>");
            out.print("Surname: <input name='surname'> <br> <br> <br>");
            out.print("Age: <input name='age'> <br> <br> <br>");

            out.print(" Male: <input name='gender' type='radio' value='male'>");
            out.print(" Female: <input name='gender' type='radio' value='female'>");

            out.print("<button>Send</button>");
            out.print("</form>");


        }

    }

