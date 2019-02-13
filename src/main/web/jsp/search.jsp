
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

    <script src="../controllers/search.controller.js"></script>
    <script> 
        $(function(){
            $("#navbar").load("navbar.jsp"); 
        });
    </script> 

        


    <title>My Bookshelf</title>
</head>
    
<body ng-app="app" ng-controller="SearchController">

    <div id="navbar"></div>
    <div class="container">
        <div class="row">
            <div class="col-sm-8 center-block">
            <br>
                <div class="input-group">
                    <span class="input-group-text">Szukaj:</span>
                    <input type="text" class="form-control" placeholder="Czego szukasz?" ng-model="query">
                </div>
                <br>

                <div class="table-responsive">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th ng-repeat='header in ["Tytuł", "Autor"]'>
                                    {{header}}
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr ng-repeat="book in testList | filter : query">
                                <th><a class="nav-link" href="./book.jsp?id={{book.bookId}}">{{book.title}}<span class="sr-only"></span></a></th>
                                <th ng-repeat = "author in book.author"><a class="nav-link" href="./author.jsp?id={{author.authorId}}">{{author.name}} {{author.surname}},<span class="sr-only"></span></a></th>
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