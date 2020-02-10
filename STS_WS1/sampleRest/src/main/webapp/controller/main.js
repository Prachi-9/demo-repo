var app = angular.module('myApp', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/login',{
            templateUrl: '/login.html',
            controller: 'loginController'
        })
        .when('/dashboard',{
            templateUrl: '/dashboard.html',
            controller: 'dashboardController'
        });
});