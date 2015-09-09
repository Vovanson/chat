/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.RequestDispatcher;

public class ClassCheck {

    private static String login = "Vovan";
    private static String password = "qwe123";

    static String check(HttpServletRequest request) {
        String page = null;
        String actionNic = request.getParameter("nic");
        String actionPas = request.getParameter("password");
        if (login.equals(actionNic) && password.equals(actionPas)) {
            request.setAttribute("user",actionNic );
            page = "/chat.jsp";
        } else {
            page = "/login.jsp";
            request.setAttribute("errorLog_Pas", "Not login and passvord");
        }
        
        return page;
    }

}
