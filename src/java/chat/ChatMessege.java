/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.util.ArrayList;


public class ChatMessege {
  
  
 private static   ArrayList<String> messege= new ArrayList<>();
  
    public ArrayList<String> mess() { 
     ArrayList<String> s= this.messege;
    return s;
    }

    /**
     * @return the messege
     */
    public static ArrayList<String> getMessege() {
        return messege;
    }
private  ChatMessege() {}
    /**
     * @param messege the messege to set
     */
    public static void setMessege(String messege) {
        
        
        ChatMessege.messege.add(messege);
  System.out.println("this.messege"+getMessege());
    }
    
    
    
}
