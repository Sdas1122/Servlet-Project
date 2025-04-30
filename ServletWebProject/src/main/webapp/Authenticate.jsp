<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name="f1" method="post" action="/ServletWebProject/LoginServlet">
   <table>
      <tr>
         <td>User Name</td>
         <td><input type="text" name="uname"></td>
       </tr>  
        <tr>
        <td>Password</td>
         <td><input type="text" name="password"></td>
       </tr>  
       
       
       <tr>
         <td><input type="submit" value="Login"></td>
         <td><input type="reset" value="Refresh"><a href="/ServletWebProject/GetDataServlet">Show all data</a>
         
         
          
         </td>
        
         
       </tr>  
       
       
       
   
   
   </table>



</form>

</body>
</html>