'use strict';

/**
 * @ngdoc function
 * @name compraAppApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the compraAppApp
 */
angular.module('compraApp')
  .controller('MainCtrl', ['$scope', '$http', function ($scope, $http) {
  	var url = 'http://localhost:8080/v1/queroVender/';
  	$scope.query = '';
  	$scope.resposta = '';

    $scope.pesquisar = function(query) {$http.get(url + query).then(function(response){
    			$scope.resposta = response.data;
          console.log(response);
		    }, function(response) {
            console.log(response);
		    });
		};
  }]);
