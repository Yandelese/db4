package kz.bitlab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/signin")
            public class SignIn extends HttpServlet {

            @Override
            protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("/signin.jsp").forward(request,response);
            }

            @Override
            protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                String email=request.getParameter("email");
                String password=request.getParameter("password");
                ArrayList<Users>usersArrayList=DBmanager2.getallusers();

                for (Users user:usersArrayList) {
                    if(email.equals(user.getEmail()) & password.equals(user.getPassword())){
                        Long id=user.getId();
                        String emaill= user.getEmail();
                        String passwordd= user.getPassword();
                        String fullname= user.getFullName();

                        Users users=new Users(id,emaill,passwordd,fullname);


                        request.setAttribute("user",users);
                        request.getRequestDispatcher("/profile.jsp").forward(request,response);
                    }

                }

            }

            }
