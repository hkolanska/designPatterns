
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container" ng-app="app" ng-controller="NavbarController">
        <a class="navbar-brand" href="./login.jsp">
            Home
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="{{ __('Toggle navigation') }}">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent"  ng-app="app" ng-controller="NavbarController">
            <!-- Left Side Of Navbar -->
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="./search.jsp">Search for a book<span class="sr-only"></span></a>
                </li>
                <li class="nav-item dropdown" ng-show="loggedInFlag">
                    <a class="nav-link dropdown-toggle" href="#" id="dropdown03" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">My bookshelfs</a>
                    <div class="dropdown-menu" aria-labelledby="dropdown03">
                        <a class="dropdown-item" href="./bookshelf.jsp?shelf=own">My books</a>
                        <a class="dropdown-item" href="./bookshelf.jsp?shelf=read">Read</a>
                        <a class="dropdown-item" href="./bookshelf.jsp?shelf=to_read">To read</a>
                        <a class="dropdown-item" href="./bookshelf.jsp?shelf=wish">Wish</a>
                    </div>
                </li>


            </ul>

            <!-- Right Side Of Navbar -->
            <ul class="navbar-nav ml-auto">
                <!-- Authentication Links -->
                    <li class="nav-item" ng-hide="loggedInFlag">
                        <a class="nav-link" href="./login.jsp">Login</a>
                    </li>
                    <li class="nav-item" ng-show="loggedInFlag">
                        <a class="nav-link" href="./login.jsp?logout=true">Logout</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./register.jsp">Register</a>
                    </li>
            </ul>
        </div>
    </div>
</nav>
