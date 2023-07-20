<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<body>
<h2>Welcome dear!</h2>
<br>
<br>
<br>
Your name is: ${employee.name}
<br><br>
Your surname is: ${employee.surname}
<br><br>
Your salary is: ${employee.salary}
<br><br>
Your department is: ${employee.department}
<br><br>
Your dream car is: ${employee.carModel}
<br><br>
Your phone number is: ${employee.phoneNumber}
<br><br>
Your email is: ${employee.email}
<br><br>
Your language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>

</body>

</html>