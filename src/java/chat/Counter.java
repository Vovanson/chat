/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Counter {

    public void count(HttpServletRequest request)  {
        HttpSession session = request.getSession(true);
        Integer counter = (Integer) session.getAttribute("counter");
       if (counter == null) {
      session.setAttribute("counter", 1);
        } 
      else {
         counter++;
          session.setAttribute("counter", counter);
    }
   }

}
