<!--
    Document   : admindashboard
    Created on : Sep 16, 2022, 10:09:40 AM
    Author     : Admin
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Dashboard</title>
        <link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
        <link href="plugins/bower_components/chartist/chartist.min.css" rel="stylesheet">
        <link rel="stylesheet" href="plugins/bower_components/chartist-plugin-tooltips/chartist-plugin-tooltip.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link href="styles/css/style.min.css" rel="stylesheet">
        <link href="styles/css/admindashboard.css" rel="stylesheet">
    </head>
    <body>
        <div id="main-wrapper" data-layout="vertical" data-navbarbg="skin5" data-sidebartype="full"
             data-sidebar-position="absolute" data-header-position="absolute" data-boxed-layout="full">
            <header class="topbar" data-navbarbg="skin5">
                <nav class="navbar top-navbar navbar-expand-md navbar-dark">
                    <div class="navbar-header" data-logobg="skin6">
                        <a class="navbar-brand">
                            <b class="logo-icon">
                                <img src="images/cafelogo.png" width="230px" height="100px"/>
                            </b>
                        </a>
                    </div>
                </nav>
            </header>
            <aside class="left-sidebar" data-sidebarbg="skin6">
                <div class="scroll-sidebar">
                    <nav class="sidebar-nav">
                        <ul id="sidebarnav">
                            <li class="sidebar-item pt-2">
                                <a class="sidebar-link active" aria-expanded="false">
                                    <img src="images/AdminProfileImage.jpg" style="width: 186px;height: 232px">
                                </a>
                            </li>
                            <li class="sidebar-item pt">
                                <a class="sidebar-link waves-effect waves-dark sidebar-link active" href="#"
                                   aria-expanded="false">
                                    <span class="hide-menu">Profile</span>
                                </a>
                            </li>
                            <li class="sidebar-item">
                                <a class="sidebar-link waves-effect waves-dark sidebar-link active" href="#"
                                   aria-expanded="false">
                                    <span class="hide-menu">Staff List</span>
                                </a>
                            </li>
                            <li class="sidebar-item">
                                <a class="sidebar-link waves-effect waves-dark sidebar-link" href="#"
                                   aria-expanded="false">
                                    <span class="hide-menu">User List</span>
                                </a>
                            </li>
                            <li class="sidebar-item">
                                <a class="sidebar-link waves-effect waves-dark sidebar-link" href="#"
                                   aria-expanded="false">
                                    <span class="hide-menu">Product List</span>
                                </a>
                            </li>
                            <li class="sidebar-item">
                                <a class="sidebar-link waves-effect waves-dark sidebar-link" href="#"
                                   aria-expanded="false">
                                    <span class="hide-menu">Warehouse</span>
                                </a>
                            </li>
                            <li class="sidebar-item">
                                <a class="sidebar-link waves-effect waves-dark sidebar-link" href="#"
                                   aria-expanded="false">
                                    <span class="hide-menu">Point Exchange</span>
                                </a>
                            </li>
                            <li class="sidebar-item">
                                <a class="sidebar-link waves-effect waves-dark sidebar-link" href="#"
                                   aria-expanded="false">
                                    <span class="hide-menu">Payment</span>
                                </a>
                            </li>
                            <li class="sidebar-item">
                                <a class="sidebar-link waves-effect waves-dark sidebar-link" href="#"
                                   aria-expanded="false">
                                    <i class="fa fa-sign-out" aria-hidden="true"></i>   
                                    <span class="hide-menu">Logout</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </aside>
            <div class="page-wrapper">
                <div class="page-breadcrumb bg-white">
                    <div class="row align-items-center">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Dashboard</h4>
                        </div>
                    </div>
                </div>
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12 col-lg-12 col-sm-12 col-xs-12">
                            <div class="white-box">
                                <h3 class="box-title">Summary</h3>
                                <div id="ct-visits" style="height: 405px;">
                                    <div class="a">Total Revenue: ${requestScope.totalRevenue} VND</div>
                                    <c:choose>
                                        <c:when test="${requestScope.checkTargetRevenue == false}">
                                        <div class="a">Target Revenue: ${requestScope.targetRevenue} VND</div>
                                        </c:when>
                                        <c:otherwise>
                                            <div class="a">You don't have any target in this month</div>
                                            <button>Add</button>
                                        </c:otherwise>
                                    </c:choose>
                                    <div class="a">Process</label>
                                        <div class="w3-light-grey w3-large">
                                            <div class="w3-container w3-green" style="width:${requestScope.checkpercent}%">${requestScope.percent}%</div>
                                        </div>
                                    </div>                               
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <script src="plugins/bower_components/jquery/jquery.min.js"></script>
            <script src="plugins/bower_components/jquery-sparkline/jquery.sparkline.min.js"></script>
            <script src="styles/bootstrap4/bootstrap.bundle.min.js"></script>
            <script src="plugins/bower_components/chartist/chartist.min.js"></script>
            <script src="plugins/bower_components/chartist-plugin-tooltips/chartist-plugin-tooltip.min.js"></script>
    </body>
</html>
