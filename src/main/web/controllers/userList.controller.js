(function () {
    'use strict';

    angular.module("app", [])
    .controller("UserListController",['$scope', '$http', function ($scope, $http    ) {

        var url = "http://192.168.192.54:8080/getUsers";
        
        $http.get(url).
            then(function(response) {
                $scope.users = response.data.users;
                console.log(response);
            }, function(response) {
                console.log(response);
            });


        $scope.login = login;
    

        function login(username) {
            
            var url = "http://192.168.192.54:8080/login?nick="+username;

            $http.get(url)
            .then(function(response){
                console.log(response);
                window.location.href = './productList.jsp?nick='+username;

            }, function(response){
                console.log(response);

            })
        };

    }]);

})();