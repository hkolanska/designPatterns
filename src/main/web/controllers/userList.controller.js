(function () {
    'use strict';

    angular.module("app", [])
    .controller("UserListController",['$scope', '$http', function ($scope, $http, ) {

        var url = "http://192.168.192.54:8080/getUsers";
        
        $http.get(url).
            then(function(response) {
                $scope.users = response.users;
            }, function(response) {
                console.log(response);
            });

    }]);

})();