/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import chat.ActionComand;

public class ActionFactory {
    public ActionComand defineComand(HttpServletRequest request,HttpServletResponse response){
    String action = request.getParameter("command");
    CommandEnum currentEnum = CommandEnum.valueOf(action);
    ActionComand current = currentEnum.getCurrentComand();
    return current;
    }

}
