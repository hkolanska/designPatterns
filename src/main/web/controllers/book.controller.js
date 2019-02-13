(function () {
    'use strict';

    angular.module("app", [])
    .controller("BookController",['$scope', '$http', function ($scope, $http) {
        
        $scope.tekst = JSON.parse(sessionStorage.session).username;
        var cur_url = new URL(window.location.href);
        var id = cur_url.searchParams.get("id");

        var url = "http://192.168.192.54:8080/user/book?bookid="+id;

        $http.get(url).
            then(function(response) {
                $scope.book = response.data;
            }, function(response) {
                console.log(response);
            });
    }]);

})();