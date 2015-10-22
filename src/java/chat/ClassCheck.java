/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import  java.util.HashSet;
import java.util.ArrayList;


import chat.CreateSession;
public class ClassCheck implements ActionComand {
    
   
   public static HashSet<HttpSession > ollSession = new HashSet<HttpSession >(); 
    private static String login = "Vovan";
    private static String password = "qwe123";
    
   static HashSet<String> online=new HashSet<String>();
    @Override
    public String execute(HttpServletRequest request,HttpServletResponse response) {
        String page = null;
      
        String actionNic = request.getParameter("nic");
        
        String actionPas = request.getParameter("password");
        //if (login.equals(actionNic) && password.equals(actionPas)) 
        if (true)
        {
            request.setAttribute("user", actionNic);
            page = "/chat.jsp";
            online.add(actionNic);
           
            CreateSession session = new CreateSession();
           HttpSession sess =  session.create(request,actionNic);
           sess.setAttribute("online", online);
            sess.setAttribute("test", ollSession);
           ollSession.add(sess);
          sess.getServletContext().getRequestDispatcher("/chat.jsp");
          
          
          
            System.out.println("ollSession size-- "+ollSession.size());
              //for(HttpSession ses:ollSession){
            
           // System.out.println(ses.getAttribute("nic"));
     // }
            
            
        } else {
            page = "/login.jsp";
            request.setAttribute("errorLog_Pas", "Not login and passvord");
        }

        return page;
    }


}
