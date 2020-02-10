app.controller('loginController', function($scope, $http, $rootScope) {
	
	console.log("in js");
	$scope.login = function(){
		$scope.param={
				loginId: $scope.loginId,
				pass: $scope.pass
		};
		
		if($rootScope.noReturn == 0){
			setTimeout("preventBack()", 0);
		}else{
			$rootScope.noReturn = 1;
		}
		
		function preventBack(){ 
			window.history.forward(); 
		}
		
		$http.post("/doLogin",$scope.param).then(function mySuccess(response){
			console.log(response.data);
			if(response.data.data == 'SUCCESS'){
				$scope.loggedin = false;
				window.location = "#!dashboard"
			}else{
				$scope.loggedin = true;
			}
		}, function myError(data){
			console.log("some internal error");
			console.log(data);
		});
	};	
	
	
});

app.controller('dashboardController', function($scope, $http, $rootScope) {
	
	$rootScope.noReturn = 0;
	console.log('inside dashboard controller')
});