(function () {
    'use strict';

    angular.module("app", [])
    .controller("SearchController",['$scope', '$http', '$filter', function ($scope, $http, $filter) {
        var session = JSON.parse(sessionStorage.session);

        var url = 'http://192.168.192.54:8080/book/find?title=&seriesName=&publisherName=&genre=&publicationYear=0';
        
        $http.get(url).
            then(function(response) {
                $scope.testList = response.data.books;
            }, function(response) {
                console.log(response);
            });

    }]);

})();