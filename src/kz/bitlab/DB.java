package kz.bitlab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/DB")

        public class DB extends HttpServlet  {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String name=request.getParameter("name");
            String surname=request.getParameter("surname");
            int salary= Integer.parseInt(request.getParameter("salary"));
            String club=request.getParameter("selectedvariant");
            int transferprice= Integer.parseInt(request.getParameter("transfer_price"));

            Footballer footballer=new Footballer(null,name,surname,salary,club,transferprice);
            footballer.addFootballer(footballer);
            ArrayList<Footballer>footballerArrayList=new ArrayList<>();
            footballerArrayList.add(footballer);



            for (Footballer footballer1:footballerArrayList) {
                out.print("Name: <h1>"+footballer1.name+"</h1> <br> ");
                out.print("Surname: <h1>"+footballer1.surname+"</h1> <br> ");
                out.print("Club: <h1>"+footballer1.club+"</h1> <br> ");
                out.print("Salary: <h1>"+footballer1.salary+"</h1> <br> ");
                out.print("Transfer Price: <h1>"+footballer1.transferPrice+"</h1> <br>");

            }

           footballer.getAllFootballers(footballerArrayList);
            }



        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();


    }

}
