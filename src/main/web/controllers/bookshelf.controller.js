(function () {
    'use strict';

    angular.module("app", [])
    .controller("BookshelfController",['$scope', '$http', '$filter', function ($scope, $http, $filter) {
        var session = JSON.parse(sessionStorage.session);
        if(session.loggedIn == "true"){
            var cur_url = new URL(window.location.href);
            var shelf = cur_url.searchParams.get("shelf");
            var url = "http://192.168.192.54:8080/user/shelfs?nick="+session.username+"&shelf=own";
        
        $http.get(url).
            then(function(response) {
                $scope.testList = response.data.books;
            }, function(response) {
                console.log(response);
            });
        }else{
            window.location.href = './login.jsp?bookshelfDenied=true';
        }
    }]);

})();