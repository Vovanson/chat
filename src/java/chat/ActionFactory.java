/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import javax.servlet.http.HttpServletRequest;
import chat.ActionComand;

public class ActionFactory {
    public ActionComand defineComand(HttpServletRequest request){
     String action = request.getParameter("command");
     

        System.out.println("action - "+action);  
       
   CommandEnum currentEnum = CommandEnum.valueOf(action);
   System.out.println("currentEnum - "+currentEnum);  
   ActionComand current = currentEnum.getCurrentComand();
    return current;
    }

}
