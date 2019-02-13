(function () {
    'use strict';

    angular.module("app", [])
    .controller("AuthorController",['$scope', '$http', function ($scope, $http) {
        
        var cur_url = new URL(window.location.href);
        var id = cur_url.searchParams.get("id");

        var url = "http://192.168.192.54:8080/author/info?authorid="+id;

        $http.get(url).
            then(function(response) {
                $scope.tekst = "sukces";
                $scope.author = response.data;
                console.log(response);
            }, function(response) {
                $scope.tekst = "not rly sukces";
                console.log(response);
            });

            var url = "http://192.168.192.54:8080/author/books?authorid="+id;

            $http.get(url).
                then(function(response) {
                    $scope.tekst = "sukces";
                    $scope.books = response.data.books;
                    console.log(response);
                }, function(response) {
                    $scope.tekst = "not rly sukces";
                    console.log(response);
                });
            
    }]);

})();