<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Entrance to the chat</title>
        <link type="text/css" rel="stylesheet" href="login.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>

        <h4> Зайдите под своим логином или зарегистрируйтесь</h4>

        <div id="vhod">
            <form  action="registration.html" method="POST">
                <input id="reg" type="submit"  value="РЕГИСТРАЦИЯ" />  
                <br/>
                <br/>
            </form >
            <form  name ="LogForm" action="controler" method="POST">
                <input type = "hidden" name ="command" value ="login"/>
                <h4>                             
                    <label for="text">Логин:&nbsp  </label>
                    <input type="text" name="nic"/>
                    <br/>
                    <br/>
                    <label for="text">Пароль:</label>
                    <input type="text" name="password"/>
                    <br/>
                    <br/>
                    <input id="chat" type="submit"  value="Вход" /> 
                    <br/>
                </h4>
                <p> ${errorLog_Pas} </p>
            </form >
        </div>
    </body>
</html>
