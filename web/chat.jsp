
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Chat</title>
    </head>
    <body>
        <h1>Welcome to Chat (Добро пожаловать),${user}! </h1>
        <br/>
        <p> Сounter ${counter} </p>
        <br/>
        <p>  ${messege} </p>
        <form name ="text" action="controler" method="POST">
             <input type = "hidden" name ="command" value ="message"/>
            <textarea name = "textbox"  rows="5" cols="50" >   </textarea>
            <br/>
            <input type ="submit"  value="Отправить" />
            
        </form>
    </body>
</html>
