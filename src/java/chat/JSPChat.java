/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;
import java.util.ArrayList;
import chat.ChatMessege;
/**
 *
 * @author вов
 */
public class JSPChat {
  ArrayList<String> messege = new ArrayList<String>();
public void metod(){
   
this.messege.add("111111");
this.messege.add("222222");
}
  public String a = "Hello";
  public ArrayList<String> b() {ArrayList<String> c = ChatMessege.getMessege();
           return c;
           }
    
}
