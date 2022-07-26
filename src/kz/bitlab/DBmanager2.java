package kz.bitlab;

import java.sql.*;
import java.util.ArrayList;

public class DBmanager2  {

                private static Connection connection;

    static{

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/firsteeproject?useUnicode=true&serverTimezone=UTC","root", "");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

                public static ArrayList<Student>getallstudents()  {
                    ArrayList<Student>studentArrayList=new ArrayList<>();

        try{

                    PreparedStatement statement= connection.prepareStatement("SELECT * FROM student");
                     ResultSet resultSet=statement.executeQuery();
                     while (resultSet.next()){
                         Long id=resultSet.getLong("id");
                         String name=resultSet.getString("name");
                         String surname=resultSet.getString("surname");
                         String birthdate=resultSet.getString("birthday");
                         String city=resultSet.getString("city");

                         Student student=new Student(id,name,surname,birthdate,city);
                         studentArrayList.add(student);
                     }
                }catch (Exception e){
                e.printStackTrace();}

                    return studentArrayList;
                }

                public static void addstudent(Student student){

                try{

                    PreparedStatement statement= connection.prepareStatement("INSERT INTO student (name,surname,birthday,city) values (?,?,?,?)");
                    statement.setString(1,student.name);
                    statement.setString(2,student.surname);
                    statement.setString(3,student.birthdate);
                    statement.setString(4,student.city);
                    statement.executeUpdate();
                    statement.close();


                }catch (Exception e)
                {e.printStackTrace();}
                }


            }
