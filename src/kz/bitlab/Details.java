package kz.bitlab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/Details")


        public class Details extends HomeServlet{


        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }


        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                int id= Integer.parseInt((request.getParameter("itemsid")));
                Items item=DBManager.getitembyid(id);
                request.setAttribute("details",item);
                request.getRequestDispatcher("/Details.jsp").forward(request,response);


        }
        }
