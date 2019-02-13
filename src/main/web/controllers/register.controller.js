(function () {
    'use strict';


    angular.module("app", [])
    .controller("RegisterController",['$scope', '$http', function ($scope, $http) {
        var cur_url = new URL(window.location.href);
        var fail = cur_url.searchParams.get("fail");

        if (fail){
            $scope.incorrectPassInfo = "Something went wrong, try again";
        }

        $scope.tekst = JSON.parse(sessionStorage.session).username;
        
        $scope.register = register;
        
        function register() {
         
            var req = {
                method: 'POST',
                url: 'http://192.168.192.54:8080/register',
                headers: {
                  'Content-Type': "application/json"
                },
                data: { 'nick': $scope.username, 'password': $scope.password, 'email': $scope.email, 'atype': 'normal'}
               }

            $http(req)
            .then(function(response){
                console.log(response);

                if(response.data['Operation completed'] == "true"){
                    //window.location.href = './login.jsp?registered=true';
                }else{
                    //window.location.href = './register.jsp?fail=true';
                }
            }, function(response){
                console.log(response);

            })

        };
        

    }]);

})();
