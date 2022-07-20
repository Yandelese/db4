package kz.bitlab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/DBManager")

        public class DBManager extends HttpServlet {
        static ArrayList<Items>itemsArrayList=new ArrayList<>();

        private static Long x = 6L;

        static {
            itemsArrayList.add(new Items(1L,"IPHONE-13 PRO-MAX",450000,10));
            itemsArrayList.add(new Items(2L,"XIOMI REDMI NOTE 8",82000,20));
            itemsArrayList.add(new Items(3L,"OPPO 3 MODEL X",350000,15));
            itemsArrayList.add(new Items(4L,"IPHONE-13 PRO-MAX",450000,30));
            itemsArrayList.add(new Items(5L,"IPHONE-13 PRO-MAX",450000,40));
        }


        public static void additems(Items items){
        items.setId(x);
        itemsArrayList.add(items);
        x++;
        }


        public static ArrayList<Items> getItemsArrayList(){
        return itemsArrayList;
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String name=request.getParameter("name");
            double price= Double.parseDouble(request.getParameter("price"));
            int amount= Integer.parseInt(request.getParameter("amount"));
            Items item=new Items(null,name,price,amount);
            DBManager.additems(item);
            response.sendRedirect("/allitems");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/index.jsp").forward(request,response);


    }
        }


