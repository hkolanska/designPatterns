
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

    <script src="../controllers/book.controller.js"></script>
    
    <script> 
        $(function(){
            $("#navbar").load("navbar.jsp"); 
        });
    </script> 

        


    <title>Book</title>
</head>
    
<body ng-app="app" ng-controller="BookController">
    <div id="navbar"></div>

    <div class="container">
        <h2>{{tekst}}</h2>
        <div class="row">
            <div class="col-sm-8 center-block">
                    <h2>Title:</h2>
                    <p1>{{book.title}}</p1>
                    <h2>Series:</h2>
                    <p1>{{book.seriesName}}</p1>
                    <h2>Authors:</h2>
                    <p1 ng-repeat="author in book.author">{{author.name}} {{author.surname}}</p1>
                    <h2>ISBN number:</h2>
                    <p1>{{book.ISBN}}</p1>
                    <h2>Genre:</h2>
                    <p1>{{book.genre}}</p1>
                    <h2>Publisher:</h2>
                    <p1>{{book.publisherName}}</p1>
                
            </div>
        </div>
    </div>


</body>



<script src="../lib/bootstrap.min.js"></script>
<script src="../lib/jquery-3.3.1.min.js"></script>

<link rel="stylesheet" href="../css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/app/app.css"/>

</html>