/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import chat.ClassCheck;
import chat.ChatMessege;
import java.io.IOException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;





public class MessageProcessing implements ActionComand {

    public final static String BR = "<br/> <hr/>";
    ArrayList<String> display = new ArrayList<String>();
   
    @Override
    public String execute(HttpServletRequest request,HttpServletResponse response) {
        HttpSession session = request.getSession(true);
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM hh:mm");
        String nic = (String) session.getAttribute("nic");
        String messege = request.getParameter("textbox");
        ChatMessege.setMessege(nic + ": " + messege + " - " + format.format(d) + BR);
        
        
        display.add(nic + ": " + messege + " - " + format.format(d) + BR);
       
        session.setAttribute("nic", nic);

        Counter counter = new Counter();
       counter.count(request);
        System.out.println("messege -- "+display);
        String page = "/chat.jsp";
        
        ClassCheck chek = new ClassCheck();
        System.out.println("chek.ollSession.size()--"+chek.ollSession.size()); 
       
        ArrayList<String> ollMessege=ChatMessege.getMessege();
        System.out.println("chatMessege.getMessege()"+ChatMessege.getMessege());
        HashSet<HttpSession> ollSes=ClassCheck.ollSession;
     
        
       for (HttpSession ses:ollSes){
          System.out.println(ses.getAttribute("nic"));
           ses.setAttribute("messege", ollMessege);
            //request.setAttribute("messege", ollMessege);
           }
       
         
        
        return page;
    }

}
