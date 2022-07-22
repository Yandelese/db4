package kz.bitlab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/culture")
            public class Culturenews extends HttpServlet {

            @Override
            protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            }
            @Override
            protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              ArrayList<News>culturenews=DBManager.getculturenews();
              request.setAttribute("culturenews",culturenews);
                System.out.println("sfsdfsdfsdfdf");
              request.getRequestDispatcher("/CultureNews.jsp").forward(request,response);

            }
            }
