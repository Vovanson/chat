/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

import chat.ChatMessege;
import java.util.Enumeration;
import chat.ClassCheck;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author вов
 */
@WebServlet(name = "chat", urlPatterns = {"/chat"})
public class Chat extends HttpServlet {

    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //Integer data=(Integer)request.getAttribute("reg");
        //System.out.println("Vxod chat");
        
      // data++;
        
        ArrayList<String> messege=ChatMessege.getMessege();
       HashSet<String> online =ClassCheck.online;
   
    
     ////   if (counter == null) {
    //  request.setAttribute("counter", 1);
     //   } 
     // else {
     //    counter++;
       //   request.setAttribute("counter", "1111");
  //  }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
    
     String param=request.getParameter("param");
       // System.out.println("param ="+param);
        
        if(param.equals("3")){
           Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM hh:mm");
         
            String nic =  request.getParameter("nic");
            
         String param2=request.getParameter("param2");  
        String paramNic=request.getParameter("paramNic");  
        // System.out.println("vxod ="+param); 
          //out.println(param2+" "+paramNic);
          ChatMessege.setMessege(format.format(d)+" "+paramNic+": "+param2+"<br/>");
          for(String s:messege){
            out.println(s);
        }
          
        }
        
        if(param.equals("online")){
       // System.out.println("vxod2 ="+param); 
       for(String s:online){
            out.println(s);
              out.println(',');
        }
        }
        
       if(param.equals("messege")){
        //   System.out.println("vxod1 ="+param);  
        for(String s:messege){
            out.println(s);
        }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
