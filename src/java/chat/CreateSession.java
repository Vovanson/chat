/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CreateSession {
     
    public void create(HttpServletRequest request,String nic){
    HttpSession session = request.getSession(true);
    if(session.isNew()){System.out.println("NEW");}
    System.out.println("NOT NEW");
        session.setAttribute("nic", nic);
       
    }
    
}
