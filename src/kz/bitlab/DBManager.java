package kz.bitlab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

@WebServlet(value = "/DBManager")

        public class DBManager extends HttpServlet {
        static ArrayList<News>newsArrayList=new ArrayList<>();

        private static Long x = 6L;

        static {
           newsArrayList.add(new News(1L,"Culture","The University of Texas at San Antonio will launch a new film and media studies program in the fall, in part to bolster the city as a location for film and movie production.","Mark Entony","Culture"));
           newsArrayList.add(new News(2L,"Sport","A star is born (in Pakistan cricket) today,” said Javed Miandad emphatically. “Now expectations will be higher and Shafique will have to live up to them.","Yan Delease","Sport"));
           newsArrayList.add(new News(3L,"Cinema","Eddie Murphy is feeling the Christmas spirit. Or at least the Christmas-first-film-under-his-Amazon deal spirit.","Tony Stark","Cinema"));
            newsArrayList.add(new News(4L,"Culture"," Culture.","111111","Culture"));
            newsArrayList.add(new News(5L,"Sport","Sport","Mark Entony","Sport"));
            newsArrayList.add(new News(6L,"Cinema","Cinema","Mark Entony","Cinema"));
        }

//
//        public static void additems(Items items){
//        items.setId(x);
//        itemsArrayList.add(items);
//        x++;
//        }

//
        public static ArrayList<News> getallnews(){
                    return newsArrayList;
        }

        public static ArrayList<News>getculturenews() {
            ArrayList<News>culturenews=new ArrayList<>();

            for (News news:newsArrayList) {
                String a="Culture";
               if(a.equalsIgnoreCase(news.category)){
                   culturenews.add(news);
               }
            }
          return culturenews;
        }

    public static ArrayList<News>getsportsnews() {
        ArrayList<News>sportsnews=new ArrayList<>();
        String a="sport";
        for (News news:newsArrayList) {
            if(a.equalsIgnoreCase(news.category)){
                sportsnews.add(news);
            }
        }
        return sportsnews;
    }

    public static ArrayList<News>getcinemanews() {
        ArrayList<News>cinemanews=new ArrayList<>();
        String a="Cinema";
        for (News news:newsArrayList) {
            if(a.equalsIgnoreCase(news.category)){
                cinemanews.add(news);
            }
        }
        return cinemanews;
    }













    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//            String name=request.getParameter("name");
//            double price= Double.parseDouble(request.getParameter("price"));
//            int amount= Integer.parseInt(request.getParameter("amount"));
//            Items item=new Items(null,name,price,amount);
//            DBManager.additems(item);
//            response.sendRedirect("/allitems");
//
    }
//
//            public static Items getitembyid(int id) {
//                ArrayList<Items> itemsArrayList = DBManager.getItemsArrayList();
//                for (Items item : itemsArrayList) {
//                    if (item.getId()==id)
//                        return item;
//                    }
//                return null;
//                }
//


//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        request.getRequestDispatcher("/index.jsp").forward(request,response);
//
//
//    }
        }
//
//
