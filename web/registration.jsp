
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP Page</title>


    </head>
    <body>
        <h1> Р Е Г И С Т Р А Ц И Я</h1>
      
        <div id="data">No</div>
  
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script>
            $.get('test', function (data) {
              //  var ollMessege = document.getElementById("data");
           // ollMessege.innerHTML=  data;
               $('#data').text(data);
            });
        </script>
    </body>
</html>
