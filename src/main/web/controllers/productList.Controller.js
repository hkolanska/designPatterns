(function () {
    'use strict';

    angular.module("app", [])
    .controller("ProductListController",['$scope', '$http', function ($scope, $http, ) {

        var cur_url = new URL(window.location.href);
        var name = cur_url.searchParams.get("name");
        var url = "http://192.168.192.54:8080/refresh?nick="+name;
        
        $http.get(url).
            then(function(response) {
                $scope.messages = response.data.messages;
                $scope.products = response.data.products;
            }, function(response) {
                console.log(response);
            });

    }]);

})();