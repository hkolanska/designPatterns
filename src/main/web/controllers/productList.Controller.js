(function () {
    'use strict';

    angular.module("app", [])
    .controller("ProductListController",['$scope', '$http', function ($scope, $http, ) {

        var cur_url = new URL(window.location.href);
        var name = cur_url.searchParams.get("nick");
        var url = "http://192.168.192.54:8080/refresh?nick="+name;
        $scope.messagesPresent = true;

        $http.get(url).
            then(function(response) {
                $scope.messages = response.data.messages;
                $scope.products = response.data.products;
                if ($scope.messages[0] == null){
                    $scope.messagesPresent = false;
                }
                console.log(response);
            }, function(response) {
                console.log(response);
            });

        $scope.logout = logout;
        $scope.refresh = refresh;
        $scope.randomize = randomize;

        function logout() {
            
            var url = "http://192.168.192.54:8080/logout?nick="+name;

            $http.get(url)
            .then(function(response){
                console.log(response);
                window.location.href = './userList.jsp';

            }, function(response){
                console.log(response);

            })
        };


        function refresh() {
            var url = "http://192.168.192.54:8080/refresh?nick="+name;
            
            $http.get(url).
                then(function(response) {
                    $scope.messages = response.data.messages;
                    $scope.products = response.data.products;
                    if ($scope.messages[0] == null){
                        $scope.messagesPresent = false;
                    }
                    console.log(response);
                }, function(response) {
                    console.log(response);
                });
        };


        function randomize() {
            
            var url = "http://192.168.192.54:8080/setRandomRandom?nick="+name;

            $http.get(url)
            .then(function(response){
                console.log(response);

            }, function(response){
                console.log(response);

            })

            var url = "http://192.168.192.54:8080/refresh?nick="+name;
            
            $http.get(url).
                then(function(response) {
                    $scope.messages = response.data.messages;
                    $scope.products = response.data.products;
                    if ($scope.messages[0] == null){
                        $scope.messagesPresent = false;
                    }
                    console.log(response);
                }, function(response) {
                    console.log(response);
                });
        };

    }]);

})();