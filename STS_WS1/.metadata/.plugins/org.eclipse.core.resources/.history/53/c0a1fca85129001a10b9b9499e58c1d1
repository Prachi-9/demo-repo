var app = angular.module('myApp', []);
app.controller('loginController', function($scope, $http) {
	
	console.log("in js");
	$scope.login = function(){
		$http.get("doLogin").then(function(data){
			console.log(data);
		});
	};	
	
	
});