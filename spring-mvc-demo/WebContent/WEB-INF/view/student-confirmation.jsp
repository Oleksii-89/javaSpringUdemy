<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	
	<head>
		<title>Student registration form</title>
	</head>
	
	<body>
	
		The student is confirmed: ${student.firstName} ${student.lastName}
		
		<br><br>
		
		Country: ${student.country}
		
		<br><br>
		
		Favorite Language: ${student.favoriteLanguage}
		
		<br><br>
		
		Operations Systems: 
		
		<ul>
			<c:forEach var="temp" items="${student.operationSystems}">
			
				<li> ${temp} </li>
				
			</c:forEach>
		
		</ul>
	
	</body>

</html>