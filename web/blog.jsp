<%-- 
    Document   : Blog
    Created on : Sep 16, 2022, 12:44:11 PM
    Author     : citih
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Let's Café</title>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
            <link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
            <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
            <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
            <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
            <link rel="stylesheet" type="text/css" href="styles/main_styles.css">
            <link rel="stylesheet" type="text/css" href="styles/responsive.css">
        </head>
        <body>
            <div class="super_container">
                <header class="header trans_300">
                    <div class="top_nav">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12 text-right">
                                    <div class="top_nav_right">
                                        <ul class="top_nav_menu">
                                            <li class="account">
                                                <a href="#">
                                                    My Account
                                                    <i class="fa fa-angle-down"></i>
                                                </a>
                                                <ul class="account_selection">
                                                    <c:choose>

                                                        <li><a href="logout"><i class="fa fa-sign-out" aria-hidden="true"></i>Logout</a></li>

                                                        <li><a href="login"><i class="fa fa-sign-in" aria-hidden="true"></i>Sign In</a></li>
                                                        <li><a href="register"><i class="fa fa-user-plus" aria-hidden="true"></i>Register</a></li>

                                                    </c:choose>
                                                </ul>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="main_nav_container">
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-12 text-right">
                                    <div class="logo_container">
                                        <a href="home">Let's<span>Café</span></a>
                                    </div>
                                    <nav class="navbar">
                                        <ul class="navbar_menu">
                                            <li><a href="home">home</a></li>
                                            <li><a href="products">shop</a></li>
                                        </ul>
                                        <ul class="navbar_user">
                                            <li class="navbar-brand">
                                                <form action="search" class="app-search d-none d-md-block me-3">
                                                    <div class="input-group input-group-sm">
                                                        <input name="txtSearch" type="text" placeholder="Search..." class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm">
                                                        <div class="input-group-append">
                                                            <button type="submit" class="btn btn-secondary">
                                                                <i class="fa fa-search"></i>
                                                            </button>
                                                        </div>
                                                    </div>
                                                </form>
                                            </li>
                                            <li class="checkout">
                                                <a href="show">
                                                    <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                                                </a>
                                            </li>
                                            <div class="hamburger_container">
                                                <i class="fa fa-bars" aria-hidden="true"></i>
                                            </div>
                                        </ul>&nbsp;&nbsp;&nbsp;
                                        <a style="color: #000" class="nav-item" href="#">
                                            <i class="fa fa-user" aria-hidden="true"></i>
                                            
                                        </a>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                </header>
                <!-- end header section -->
            </div>

            <!-- about section -->
            <section class="about_section layout_padding">
                <div class="container">
                    <div class="custom_heading-container ">
                        <h2>
                            CÀ PHÊ VÀ SẮC ĐẸP
                        </h2>
                    </div>

                    <div class="img-box">
                        <img src="images" alt="">
                    </div>
                    <div class="detail-box">
                        <p>
                            Cà phê và sắc đẹp Trong mỗi gói cà phê Passiona đều được bổ sung một lượng collagen vừa đủ giúp bạn gái làm chậm tiến trình lão hóa của làn da. Với tâm huyết...
                        </p>
                        <div class="d-flex justify-content-center">
                            <a href="">
                                Read More
                            </a>
                        </div>
                    </div>
                </div>
            </section>

            <!-- end about section -->





            <div class="layout_padding-bottom">
                <!-- discount section -->

                <section class="discount_section">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-3 col-md-5 offset-md-2">
                                <div class="detail-box">
                                    <h2>
                                        You get <br>
                                        any coffee <br>
                                        on
                                        <span>
                                            10% discount
                                        </span>

                                    </h2>
                                    <p>
                                        It is a long established fact that a reader will be distracted by
                                    </p>
                                    <div>
                                        <a href="">
                                            Buy Now
                                        </a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-7 col-md-5">
                                <div class="img-box">
                                    <img src="images/" alt="">
                                </div>
                            </div>
                        </div>
                    </div>
                </section>

                <!-- end discount section -->
            </div>





            <!-- end info section -->

            <!-- footer section -->
            <footer class="footer">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="footer_nav_container d-flex flex-sm-row flex-column align-items-center justify-content-lg-start justify-content-center text-center">
                                <ul class="footer_nav">
                                    <li><a href="#">Blog</a></li>
                                    <li><a href="#">FAQs</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="footer_social d-flex flex-row align-items-center justify-content-lg-end justify-content-center">
                                <ul>
                                    <li><a href="#"><i class="fa fa-facebook" 
                                                       aria-hidden="true"></i> Facebook</a></li><br/>
                                    <li><a href="#"><i class="fa fa-instagram" 
                                                       aria-hidden="true"></i> Instagram</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="footer_nav_container">
                                <div class="cr">©2022 Coffee Shop. All Rights Reserved.</div>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>
            <!-- footer section -->

            <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
            <script type="text/javascript" src="js/bootstrap.js"></script>
            <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/owl.carousel.min.js">
            </script>
            <script type="text/javascript">
                $(".owl-carousel").owlCarousel({
                    loop: true,
                    margin: 10,
                    nav: true,
                    navText: [],
                    autoplay: true,
                    responsive: {
                        0: {
                            items: 1
                        },
                        600: {
                            items: 2
                        },
                        1000: {
                            items: 4
                        }
                    }
                });
            </script>
            <script type="text/javascript">
                $(".owl-2").owlCarousel({
                    loop: true,
                    margin: 10,
                    nav: true,
                    navText: [],
                    autoplay: true,

                    responsive: {
                        0: {
                            items: 1
                        },
                        600: {
                            items: 2
                        },
                        1000: {
                            items: 4
                        }
                    }
                });
            </script>
        </body>

    </html>