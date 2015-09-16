/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageProcessing implements ActionComand {

    public final static String BR = "<br/> <hr/>";
    ArrayList<String> display = new ArrayList<String>();
    ArrayList<String> online = new ArrayList<String>();
    @Override
    public String execute(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM hh:mm");
        String nic = (String) session.getAttribute("nic");
        String messege = request.getParameter("textbox");
        display.add(nic + ": " + messege + " - " + format.format(d) + BR);
        request.setAttribute("messege", display);

        Counter counter = new Counter();
       counter.count(request);

        String page = "/chat.jsp";
        return page;
    }

}
