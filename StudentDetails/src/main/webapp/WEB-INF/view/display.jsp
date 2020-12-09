<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<style type="text/css">
    body{
        background-color:deepskyblue;

    }

</style>
<head><title>Student Details</title>
</head>

<body>
<a href="/"> display</a>
<form>
    <table border="1" cellpadding="10">
        <tr><th>studentId</th>
            <th>First Name</th>
            <th>Second Name</th>
            <th>Class</th>
            <th>School</th></tr>
        <c:forEach var="studentDetails" items="${allStudents}">
            <tr>
                <td>${studentDetails.studentID}</td>
                <td>${studentDetails.firstName}</td>
                <td>${studentDetails.lastName}</td>
                <td>${studentDetails.studentClass}</td>
                <td>${studentDetails.school}</td>

            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>