
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

    <script src="../controllers/author.controller.js"></script>
    
    <script> 
        $(function(){
            $("#navbar").load("navbar.jsp"); 
        });
    </script> 

    <title>Author</title>
</head>
    
<body ng-app="app" ng-controller="AuthorController">
    <div id="navbar"></div>

    <div class="container">
        <div class="row">
            <div class="col-sm-8 center-block">
                    <h2>Name:</h2>
                    <p1>{{author.name}} {{author.surname}}</p1>
                    <h2>Alias:</h2>
                    <p1>{{author.alias}}</p1>
                    <h2>Books:</h2>

                    <table class="table table-hover">
                    <tr ng-repeat="book in books">
                        <th style="list-style-type:square"><a class="nav-link" href="./book.jsp?id={{book.bookId}}">{{book.title}}<span class="sr-only"></span></a></th>
                    </tr>
                    </table>

            </div>
        </div>
    </div>


</body>



<script src="../lib/bootstrap.min.js"></script>
<script src="../lib/jquery-3.3.1.min.js"></script>

<link rel="stylesheet" href="../css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/app/app.css"/>

</html>