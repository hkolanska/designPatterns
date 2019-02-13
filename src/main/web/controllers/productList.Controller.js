(function () {
    'use strict';

    angular.module("app", [])
    .controller("ProductListController",['$scope', '$http', function ($scope, $http, ) {

        var url = "http://192.168.192.54:8080/getUsers";
        
        $http.get(url).
            then(function(response) {
                $scope.messages = response.messages;
                $scope.products = response.products;
            }, function(response) {
                console.log(response);
            });

    }]);

})();