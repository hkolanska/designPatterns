
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

    <script src="../controllers/register.controller.js"></script>
    <script> 
        $(function(){
            $("#navbar").load("navbar.jsp"); 
        });
    </script> 


    <title>Register</title>
</head>

<body ng-app='app' ng-controller='RegisterController'>
    <div id="navbar"></div>


    <div class="container">
        <div class="col-md-6 col-md-offset-3">
            <h2>Register</h2>
            <form name="form" ng-submit="register()" role="form">
                <div class="form-group" ng-class="{ 'has-error': form.username.$dirty && form.username.$error.required }">
                    <label for="username">Email</label>
                    <input type="email" name="email" id="email" class="form-control" ng-model="email" required />
                </div>
                <div class="form-group" ng-class="{ 'has-error': form.username.$dirty && form.username.$error.required }">
                    <label for="username">Username</label>
                    <input type="text" name="username" id="username" class="form-control" ng-model="username" required />
                </div>
                <div class="form-group" ng-class="{ 'has-error': form.password.$dirty && form.password.$error.required }">
                    <label for="password">Password</label>
                    <input type="password" name="password" id="password" class="form-control" ng-model="password" required />
                </div>
                <div class="form-actions">
                    <button type="submit" ng-disabled="form.$invalid" class="btn btn-primary">Register</button>
                    <a href="./login.jsp" class="btn btn-link">Cancel</a>
                </div>
            </form>
        </div>
    </div>
</body>



<link rel="stylesheet" href="css/lib/bootstrap.min.css"/>
<link rel="stylesheet" href="css/app/app.css"/>

</html>