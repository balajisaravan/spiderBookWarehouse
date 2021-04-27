<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>
        .navbar-brand{
            font-weight: bolder;
        }

        .nav-item{
            padding-left: 1rem;
        }

        .navbar{
            background-color: rgb(224, 169, 169) ;
        }

        .footer{
            background-color: rgb(221, 187, 187) ;
        }

        .form-control{
            background-color: rgb(224, 186, 186) ;
            border: 1px solid rgba(255, 255, 255, .5);;
            border-radius: 0;
            opacity: 1;
        }

        .form-control .form-inline{
            width: 220px;
        }


        .form-control:focus{
            color:black;
            background-color: #fff;
            border-color:#a75470;
            box-shadow:none;
        }

        .form-control::placeholder{
            color: rgba(255, 255, 255, .5);
        }

        .btn {
            color: #fff;
            background-color: #a56177;
            border-color:rgb(224, 186, 186);
            border-radius: 0;
            height: 38px;
        }

        .btn:hover,.btn:focus  {
            color: #fff;
            box-shadow: 0 0 0 0.2rem #a56177;
        }

        .dropdown-menu{
            padding: 0;
            border-radius: 0;
            background-color: rgb(223, 197, 197);

        }

        .dropdown-item{
            color: rgba(255, 255, 255, .5);
        }

        .dropdown-item:hover{
            background-color: rgb(224, 186, 186);
            color:white;
        }

        .carousel-caption,h3{
            font-weight: lighter;
        }

        .footer{
            font-size: x-small;
        }
    </style>

    <html lang="en">
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <!--Custom CSS-->
    <link rel="stylesheet" href="space.css">

    <title>.Space for Interior.</title>
    </html>

    <!--Top navigation bar-->

<body>
<nav class="navbar navbar-expand-sm navbar-dark" data-id="web_navigation_bar">
    <a class="navbar-brand brand-name" href>BookWareHouse</a>
    <div class="collapse navbar-collapse" id="web_navigation_bar_collapse">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="addBook">ADD BOOK</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="getAllBooks">ALL BOOKS</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="convertAllBookWarehouseDtoToJson">JSON FILE</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="convertAllBookWarehouseDtoToXml">XML FILE</a>
            </li>
        </ul>

</nav>

<!--Slideshow-->
<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
        <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="https://miro.medium.com/max/2698/1*YAaAjBYEDVI7ynN588t8fg.jpeg"
                 class=" w-100 " alt="Error loading image">

        </div>
        <div class="carousel-item">
            <img src="https://assets.entrepreneur.com/content/3x2/2000/20191219170611-GettyImages-1152794789.jpeg"
                 class="d-block w-100" alt="Error loading image">
        </div>
        <div class="carousel-item">
            <img src="https://images.unsplash.com/photo-1507842217343-583bb7270b66?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8Mnx8fGVufDB8fHw%3D&w=1000&q=80"
                 class="d-block w-100" alt="Error loading image">
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
</body>
</html>


