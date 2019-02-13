
<!DOCTYPE html>
<html>
<head>

    <link rel="dns-prefetch" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet" type="text/css">

    <!-- Styles -->
    <link href="../css/bootstrap.css" rel="stylesheet">
    <meta charset="UTF-8">

    <script src="../lib/angular.min.js"></script>
    <script src="../lib/jquery-3.3.1.min.js"></script>

    <script src="../controllers/userList.controller.js"></script>

    <title>User List</title>
</head>
    
<body ng-app="app" ng-controller="UserListController">

    <div class="container">
        <div class="row">
            <div class="col-sm-8 center-block">
                <br>
                <div class="table-responsive">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>
                                    User
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr ng-repeat="user in users">
                                <th><a class="nav-link" href="./login?nick={{user.name}}">{{user.name}}<span class="sr-only"></span></a></th>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>

    


</body>




<script src="../lib/bootstrap.min.js"></script>
<script src="../lib/jquery-3.3.1.min.js"></script>

<link rel="stylesheet" href="../css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/app/app.css"/>

</html>