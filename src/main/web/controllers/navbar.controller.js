(function () {
    'use strict';


    angular.module("app", [])
    .controller("NavbarController",['$scope', function ($scope) {
        //var session = JSON.parse(sessionStorage.session);
        //$scope.tekst = JSON.parse(sessionStorage.session).username;
        $scope.loggedInFlag = false;
//        if (session.loggedIn == "false"){
//            $scope.loggedInFlag = false;
//        }else{
//            $scope.loggedInFlag = true;
//        }

        $scope.loggedInFlag = false;
        $scope.tekst = "navbar tekst";
        console.log($scope.loggedInFlag);
    }]);

})();
