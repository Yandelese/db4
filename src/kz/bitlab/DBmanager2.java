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

                public static ArrayList<Items>getallitems()  {
                    ArrayList<Items>itemsArrayList=new ArrayList<>();

                try{

                    PreparedStatement statement= connection.prepareStatement("SELECT * FROM items");
                     ResultSet resultSet=statement.executeQuery();
                     while (resultSet.next()){
                         Long id=resultSet.getLong("id");
                         String name=resultSet.getString("name");
                         String description=resultSet.getString("description");
                         double price=resultSet.getDouble("price");

                         Items items=new Items(id,name,description,price);
                         itemsArrayList.add(items);
                     }
                }catch (Exception e){
                e.printStackTrace();}

                    return itemsArrayList;
                }

    public static ArrayList<Users>getallusers()  {
        ArrayList<Users>usersArrayList=new ArrayList<>();

        try{

            PreparedStatement statement= connection.prepareStatement("SELECT * FROM users");
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                Long id=resultSet.getLong("id");
                String email=resultSet.getString("email");
                String password=resultSet.getString("password");
                String fullname=resultSet.getString("fullname");

                Users users=new Users(id,email,password,fullname);
                usersArrayList.add(users);
            }
        }catch (Exception e){
            e.printStackTrace();}

        return usersArrayList;
    }


//                public static void addstudent(Items student){
//
//                try{
//
//                    PreparedStatement statement= connection.prepareStatement("INSERT INTO student (name,surname,birthday,city) values (?,?,?,?)");
//                    statement.setString(1,student.name);
//                    statement.setString(2,student.surname);
//                    statement.setString(3,student.birthdate);
//                    statement.setString(4,student.city);
//                    statement.executeUpdate();
//                    statement.close();
//
//
//                }catch (Exception e)
//                {e.printStackTrace();}
//                }
//
//                public static Items getstudentbyid(Long id){
//                    Items student = null;
//                try {
//                    PreparedStatement statement= connection.prepareStatement("SELECT * FROM student WHERE id=?");
//                    statement.setLong(1,id);
//                    ResultSet resultSet= statement.executeQuery();
//
//                    if(resultSet.next()){
//                        Long idd=resultSet.getLong("id");
//                        String name= resultSet.getString("name");
//                        String surname=resultSet.getString("surname");
//                        String birthdate=resultSet.getString("birthday");
//                        String city=resultSet.getString("city");
//                        student=new Items(idd,name,surname,birthdate,city);
//                    }
//
//
//                    statement.close();
//                }catch (Exception e){
//                e.printStackTrace();
//                }
//                    return student;
//                }
//
//                public static void updatestudent(Items student) {
//                    try {
//                    PreparedStatement statement= connection.prepareStatement("UPDATE student SET name=?,surname=?,birthday=?,city=? WHERE id=?");
//
//                        statement.setString(1,student.getName());
//                        statement.setString(2,student.getSurname());
//                        statement.setString(3,student.getBirthdate());
//                        statement.setString(4,student.getCity());
//                        statement.setLong(5,student.getId());
//
//                        statement.executeUpdate();
//                        statement.close();
//
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
//
//                }
//
//                public static void deletestudentbyid(Long id){
//                    try {
//                        PreparedStatement statement= connection.prepareStatement("DELETE FROM student WHERE id=?");
//                        statement.setLong(1,id);
//                        statement.executeUpdate();
//                        statement.close();
//
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }

                }



