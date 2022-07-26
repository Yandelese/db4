package kz.bitlab;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addstudent")
public class AddStudent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/studentadding.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name=request.getParameter("name");
        String surname=request.getParameter("surname");
        String birthdate=request.getParameter("birthday");
        String city=request.getParameter("city");
        Student student=new Student(null,name,surname,birthdate,city);
        DBmanager2.addstudent(student);
        response.sendRedirect("/home");
    }
}
