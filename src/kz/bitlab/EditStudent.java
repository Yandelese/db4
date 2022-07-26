package kz.bitlab;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/edit")

        public class EditStudent extends HttpServlet {

    Student student=null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id= Long.valueOf(request.getParameter("id"));
        student=DBmanager2.getstudentbyid(id);
        request.setAttribute("student",student);
        request.getRequestDispatcher("/edit.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name=request.getParameter("name");
        String surname=request.getParameter("surname");
        String birthdate=request.getParameter("birthday");
        String city=request.getParameter("city");

        student.setName(name);
        student.setSurname(surname);
        student.setBirthdate(birthdate);
        student.setCity(city);

        DBmanager2.updatestudent(student);

        response.sendRedirect("/home");
    }
}
