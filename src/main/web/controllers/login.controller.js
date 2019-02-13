(function () {
    'use strict';


    angular.module("app", [])
    .controller("LoginController",['$scope', '$http', function ($scope, $http) {
        var cur_url = new URL(window.location.href);
        var fail = cur_url.searchParams.get("fail");
        var logout = cur_url.searchParams.get("logout");
        var registered = cur_url.searchParams.get("registered");
        $scope.info;
        $scope.incorrectPassInfo;
        if (!sessionStorage.session){
            sessionStorage.session = JSON.stringify({"loggedIn": "false", "username": null});
        }
        $scope.tekst = JSON.parse(sessionStorage.session).username;
        if (registered){
            $scope.info = "Registered";
        }
        
        if (fail){
            $scope.incorrectPassInfo = "Wrong username or password";
        }

        if (logout){
            sessionStorage.session = JSON.stringify({"loggedIn": "false", "username": null});
        }
        $scope.login = login;
        

        function login() {
           
            var req = {
                method: 'POST',
                url: 'http://192.168.192.54:8080/login',
                headers: {
                  'Content-Type': "application/json"
                },
                data: { 'nick': $scope.username, 'password': $scope.password }
               }

            $scope.tekst="login function called";
            $http(req)
            .then(function(response){
                console.log(response);

                if(response.data['Operation completed'] == "false"){
                    window.location.href = './login.jsp?fail=true';
                }else{
                    sessionStorage.session = JSON.stringify({"loggedIn": "true", "username": response.data.nick});
                }
            }, function(response){
                console.log(response);

            })

        };
        

    }]);

})();
