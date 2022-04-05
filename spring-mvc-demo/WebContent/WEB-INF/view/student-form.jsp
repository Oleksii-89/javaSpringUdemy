<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	
	<head>
		<title>Student registration form</title>
	</head>
	
	<body>
		
		<form:form action="processForm" modelAttribute="student">
				
				First name: <form:input path="firstName"/>
				
				<br><br>
				
				Last name: <form:input path="lastName"/>
				
				<br><br>
				
				Country:
				<form:select path="country">
				
					<form:options items="${theCountryOptions}"/>
					
				</form:select>
				
				<br><br>
				
				Favorite language:
				
				C <form:radiobutton path="favoriteLanguage" value="C"/>
				JS <form:radiobutton path="favoriteLanguage" value="JS"/>
				JAVA <form:radiobutton path="favoriteLanguage" value="JAVA"/>
				Kotlin <form:radiobutton path="favoriteLanguage" value="Kotlin"/>
				
				<br><br>
				
				Operation systems:
				Windows <form:checkbox path="operationSystems" value="Windows"/>
				Mac OS <form:checkbox path="operationSystems" value="Mac Os"/>
				Linux <form:checkbox path="operationSystems" value="Linux"/>
				
				<br><br>
				
				<input type="submit" value="Submit">
		</form:form>
		
	</body>


</html>