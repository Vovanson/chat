
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Chat</title>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script>

            //add messege
            $(document).ready(function () {
                var button = $("button");
                button.click(function () {
                    var text = $("textarea").val();
                    var nic = document.getElementById("nic").innerHTML;
                    $.post('chat', {param: 3, param2: text, paramNic: nic}, function () {
                        $('#outmess').val("");
                    });
                });
            }
            );
           function fn() {
                // xmlHttp.open("GET","test",param=2);
                //  xmlHttp.onreadystatechange=function (data){
                //  if (xmlHttp.readyState === 4 && xmlHttp.status === 200) { 
                //    online=data;
                // }
                //}
                //  $.get('Chat3', function (data1, data2) {
                // alert(data);
                // testData1 = data1;
                //  testData2 = data2;
                //   $('#test1').val(testData1);
                // $('#test2').val("testData2");
                //  });

                $.get('chat', {param: "online"}, function (data) {
                    online = data;
                });

                $.get('chat', {param: "messege"}, function (data) {
                    //  var ollMessege = document.getElementById("data");
                    // ollMessege.innerHTML=  data;
                    ollMessege2 = data;
                    //  $('#data').text(data);
                });

                //  $.get('Controller2',function (){});
                //-------------------------------------------
                var now = new Date();

                var test1 = document.getElementById("test1");
                test1.innerHTML = "test1: " + testData1;
                var test2 = document.getElementById("test2");
                test2.innerHTML = "test2: " + testData2;

                var line = document.getElementById("online");
                line.innerHTML = "Online: " + online;

                var ollMessege = document.getElementById("mm");
                ollMessege.innerHTML = now.toLocaleString() + " <br/> " + ollMessege2;

            }

            setInterval(fn, 1000);

            window.onload = fn;


        </script>

    </head>

    <body>
        <jsp:useBean id="messegeChat" class = "chat.JSPChat"/>
        <jsp:useBean id="calendar" class = "java.util.GregorianCalendar"/>
        <%--  <h3> ${calendar.timeInMillis} </h3> --%>
        <h1>Welcome to Chat (Добро пожаловать),${user}! </h1>
        <h3 id="nic"> ${nic} </h3>
        <h2 id="test1"> Test1 </h2>
        <h2 id="test2"> Test2 </h2>

        <%--<h3> ${test} </h3>--%>
        <br/>
        <%--<p> Сounter ${counter} </p>--%>
        <p id="online">  Online:  ${nic} </p>

        <%-- <p id="tt"> ${messegeChat.b()} </p>--%>
        <br/>
        <%-- <div id="data">No</div> --%>

        <h5 id="mm">  </h5>      
        <div>
            <textarea id="outmess" style="width: 400px">   </textarea>
            <br/>
            <button> Отправить </button>
        </div>
        <br/>

        <%--
         <form name ="text" action="chat" method="POST">
             <input type = "hidden" name ="command" value ="message"/>
             <textarea name = "textbox"  rows="5" cols="50" >   </textarea>
             <br/>
             <input type ="submit"  value="Отправить" />
  
         </form>
        --%>
    </body>
</html>
