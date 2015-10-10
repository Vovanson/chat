
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <title>Chat</title>
        
        <%--<script type="text/javascript" src="assets/jQuery.js"></script>
  <script type="text/javascript" src="assets/jquery.timers-1.2.js"></script>--%>
    </head>

    <body>
        <jsp:useBean id="messegeChat" class = "chat.JSPChat"/>
         <jsp:useBean id="calendar" class = "java.util.GregorianCalendar"/>
          <h3> ${calendar.timeInMillis} </h3>
        <h1>Welcome to Chat (Добро пожаловать),${user}! </h1>
        <h3> ${nic} </h3>
        <h3> ${test} </h3>
        <br/>
        <p> Сounter ${counter} </p>
        <p> Online ${online} </p>
     
        <h3 id="tt"> ${messegeChat.b()} </h3>
<br/>
     <%-- <div id="data">No</div> --%>

       <p id="mm">  </p>          
 
        <form name ="text" action="controler" method="POST">
            <input type = "hidden" name ="command" value ="message"/>
            <textarea name = "textbox"  rows="5" cols="50" >   </textarea>
            <br/>
            <input type ="submit"  value="Отправить" />

        
        
        
        
        </form>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script>
            var i=1;
         
             function fn(){
             
             $.get('test', function (data) {
              //  var ollMessege = document.getElementById("data");
           // ollMessege.innerHTML=  data;
       
               ollMessege2 = data;
             //  $('#data').text(data);
            });
             
        //  $.get('Controller2',function (){});
          //-------------------------------------------
          
            var ollMessege = document.getElementById("mm");
            ollMessege.innerHTML= i+"  "+ ollMessege2;
            i++;
               }
         
            setInterval(fn, 3000);
           
             window.onload = fn;
          
   
            </script>
    </body>
</html>
