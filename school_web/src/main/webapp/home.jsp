 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <!DOCTYPE HTML>
<html>
<body>

<%="Hello Spring World 2" %>
<br>
<br>
<br>

Welcome Ya ${username}

 <table border="1" cellpadding="0" cellspacing="0">
		<thead style="background-color:gray;">
			<td>Student ID</td>
			<td>Student Name</td>
			<td>Birth Date</td>
		</thead>
		<c:forEach var="student" items="${students}" > 
			<tr>	
				<td>${student.studentId}</td>
				<td>${student.studentName}</td>
				<td>${student.birthDate}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>