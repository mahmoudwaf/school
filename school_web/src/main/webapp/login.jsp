 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <!DOCTYPE HTML>
<html>
<head>
	<script src="<c:url value="/resources/js/angular.min.js" />"></script>
	<script src="<c:url value="/resources/js/test.js" />"></script>
	<script type="text/javascript">
		alert('Inside script');
	    alert(add(2,3));
		angular.module("myapp",[]).controller("mycontroller",function($scope){
			$scope.title="Title Value";
		});
	</script>
</head>
<body ng-app="myapp">
<h2>v1.1</h2>
<h2>What is your name ?</h2>
 <br>
<form action="login">
	<input type="text" name="username" /> 
	<input type="submit" value="Send">
</form>

<div ng-controller="mycontroller">
	<h2>{{title}}</h2>
</div>
</body>
</html>
