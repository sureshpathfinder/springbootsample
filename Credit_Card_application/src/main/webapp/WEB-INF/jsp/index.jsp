<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CreditCard-Home Page</title>
<style>
#myHeader {
  background-color:cyan;
  color: black;
  padding: 40px;
}
</style>
</head>
<body>
<div id="myHeader">
<h1>Check for Credit Card Eligibility</h1>
 <form method = "POST" action="/Credit_Card_application/checkEligibility" >
 <table border="1">
 <tr>
 <td>Enter PAN Number : <input type="text" name ="panNo" pattern="[a-zA-Z0-9_-]{0,10}" autofocus required 
       title="10 charcter alpha numeric ">
 </tr>
 <tr><td>
 <input type="submit" value="Check">
 </tr>
 </table>
</form>
</div>
</body>
</html>