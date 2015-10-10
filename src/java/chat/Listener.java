
package chat;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.ArrayList;
import  java.util.HashSet;
import chat.Controller;
import chat.ClassCheck;
import chat.MessageProcessing;
import javax.servlet.http.HttpSession;
@WebListener       
public class Listener  implements HttpSessionAttributeListener{
     HashSet<HttpSession > sess = new HashSet<HttpSession >(); 
    public  void attributeRemoved(HttpSessionBindingEvent ev){
    }
     public  void attributeAdded(HttpSessionBindingEvent ev) {
     }
   public  void   attributeReplaced(HttpSessionBindingEvent ev){
       
       
       HttpSession ses1=ev.getSession();
       System.out.println("ses1--"+ses1);
      
       System.out.println("test----"+ses1.getAttribute("test"));
    //   ClassCheck chek = new ClassCheck();
       
       
     //  sess =chek.ollSession;
        HashSet<HttpSession> ollSes=ClassCheck.ollSession;
        //ArrayList<HttpSession>sess=chek.ollSession;
       //  ArrayList<HttpSession>sess2=chek.getOllSession1();
        
       // MessageProcessing mp = new MessageProcessing();
      //  ArrayList<String> mess=mp.display;
      //  System.out.println("Lissten ");
       // System.out.println("sess.size()--"+sess.size());
       // System.out.println("sess2.size()--"+sess2.size());
           

        //for (HttpSession ses:ollSes){
         //   System.out.println(ses.getAttribute("nic"));
        //   ses.setAttribute("messege", sess);
           //}
        
        
     //  HttpServletRequest seesion = (HttpServletRequest)ev.getSession();
        //ev.getSession().;
        
  //seesion.getDispatcherType()
       //dispatcher.forward(request, response);
    //     System.out.println("Chang Condishin - "+ ev.getSession());
         }
   
}
