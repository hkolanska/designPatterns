
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

    <script src="../controllers/productList.controller.js"></script>

    <title>Product List</title>
</head>
    
<body ng-app="app" ng-controller="ProductListController">

    <div class="container">
        <div class="row">
            <div class="col-sm-8 center-block">
                <br>
                <div class="table-responsive">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th ng-repeat='header in ["Name", "Price"]'>
                                    {{header}}
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr ng-repeat="product in products">
                                <th>{{product.name}}<span class="sr-only"></span></th>
                                <th>{{product.price}}<span class="sr-only"></span></th>
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