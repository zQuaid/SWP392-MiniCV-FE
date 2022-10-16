<%-- 
    Document   : home
    Created on : Jun 12, 2022, 7:32:35 PM
    Author     : trung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                                                    <c:when test="${sessionScope.account != null}">
                                                        <li><a href="logout"><i class="fa fa-sign-out" aria-hidden="true"></i>Logout</a></li>
                                                        </c:when>
                                                        <c:otherwise>
                                                        <li><a href="login"><i class="fa fa-sign-in" aria-hidden="true"></i>Sign In</a></li>
                                                        <li><a href="register"><i class="fa fa-user-plus" aria-hidden="true"></i>Register</a></li>
                                                        </c:otherwise>
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
                                        <li><a href="product">shop</a></li>
                                        <li><a href="blog">blog</a></li>
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
                                    <a style="color: #000" class="nav-item" href="profile">
                                        <i class="fa fa-user" aria-hidden="true"></i>
                                        <span>${sessionScope.account.username}</span>
                                    </a>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <div class="main_slider" style="background-image:url(images/cafelogo.png)">
                <div class="container fill_height">
                    <div class="row align-items-center fill_height">
                        <div class="col">
                            <div class="main_slider_content">
                                <h6>New Events</h6>
                                <h1>Get up to 30% Off New Arrivals</h1>
                                <div class="red_button"><a href="products">shop now</a></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="new_arrivals">
                <div class="container">
                    <div class="row">
                        <div class="col text-center">
                            <div class="section_title new_arrivals_title">
                                <div class="fa fa-fire" style="color: red">
                                    <h2>Best Seller</h2>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col">
                            <div class="product-grid" data-isotope='{ "itemSelector": ".product-item", "layoutMode": "fitRows" }'>
                                <c:forEach items="${topProduct}" var="product">
                                    <div class="product-item">
                                        <div class="product discount product_filter">
                                            <div class="product_image">
                                                <img src="${product.image}"/>
                                            </div>
                                            <div class="favorite favorite_left"></div>
                                            <div class="product_bubble product_bubble_left product_bubble_green d-flex flex-column align-items-center"><span>new</span></div>
                                            <div class="product_info">
                                                <h6 class="product_name"><a href="product">${product.productName}</a></h6>
                                                <div class="product_price">₫ ${product.price}</div>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="deal_ofthe_week">
                <div class="container">
                    <div class="row align-items-center">
                        <div class="col-lg-6">
                            <div class="deal_ofthe_week_img">
                                <img src="blog2.jpg" alt="">
                            </div>
                        </div>
                        <div class="col-lg-6 text-right deal_ofthe_week_col">
                            <div class="deal_ofthe_week_content d-flex flex-column align-items-center float-right">
                                <div class="section_title">
                                    <h2>Blog</h2>
                                    <h3>Cà phê rang xay là gì</h3>
                                </div>

                                <div class="red_button deal_ofthe_week_button"><a href="">Read more</a></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="newsletter">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="newsletter_text d-flex flex-column justify-content-center align-items-lg-start align-items-md-center text-center">
                                <h4>Newsletter</h4>
                                <p>Subscribe to our newsletter and get 20% off your first purchase</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
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
                                <div class="cr">©2022 Levents Shop. All Rights Reserved.</div>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>
        </div>
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="styles/bootstrap4/popper.js"></script>
        <script src="styles/bootstrap4/bootstrap.min.js"></script>
        <script src="plugins/Isotope/isotope.pkgd.min.js"></script>
        <script src="plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
        <script src="plugins/easing/easing.js"></script>
        <script src="js/custom.js"></script>
    </body>
</html>