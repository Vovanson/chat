/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.util.HashSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
public class CreateSession {
    HashSet<HttpSession > ollSession = new HashSet<HttpSession >(); 
    public HttpSession create(HttpServletRequest request,String nic){
      
        
    HttpSession session = request.getSession();
     
    
    
         System.out.println("ID --"+session.getId());
         
          
      
   
        session.setAttribute("nic", nic);
       // ollSession.add(session);
       // System.out.println("new session -size"+ollSession.size());
         //System.out.println(session.getAttribute("nic"));
        
       // for(HttpSession ses:ollSession){
            
          //  System.out.println(ses.getAttribute("nic"));
     // }
        
        return session;
       
    }
    
}
