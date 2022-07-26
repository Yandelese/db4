//package kz.bitlab;
//
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import java.util.ArrayList;
//
//@WebServlet(value = "/db")
//    public class DBmanager extends HttpServlet {
//
//       public static ArrayList<Task>taskArrayList=new ArrayList<>();
//
//       static {
//           taskArrayList.add(new Task(1L,"Create Web App","Create Web App","28/07/2022"));
//           taskArrayList.add(new Task(2L,"Order airline bill","Order airline bill","25/04/2021"));
//           taskArrayList.add(new Task(3L,"Call to my boss","Call to my boss","20/01/2023"));
//       }
//
//       public static void addtask(Task task){
//           taskArrayList.add(task);
//       }
//
//       public static ArrayList<Task> getalltasks(){
//           return taskArrayList;
//       }
//
//       public static Task gettaskbyid(Long id){
//           for (Task task:taskArrayList) {
//               if(id== task.getId()){
//                   return task;
//               }
//
//           }
//           return null;
//       }
//
//       public static void deletetaskbyid(Task task){
//           for (int i=0;i<taskArrayList.size();i++) {
//               if(task.id==taskArrayList.get(i).getId()){
//                   taskArrayList.remove(task);
//               }
//           }
//       }
//
//    }
