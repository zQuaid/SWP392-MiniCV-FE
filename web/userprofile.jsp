<%-- 
    Document   : userprofile
    Created on : Sep 17, 2022, 1:42:13 AM
    Author     : citih
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Profile</title>
        <link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
        <link href="styles/css/style.min.css" rel="stylesheet">
    </head>
    <body>
        <div id="main-wrapper" data-layout="vertical" data-navbarbg="skin5" data-sidebartype="full"
             data-sidebar-position="absolute" data-header-position="absolute" data-boxed-layout="full">
            <header class="topbar" data-navbarbg="skin5">
                <nav class="navbar top-navbar navbar-expand-md navbar-dark">
                    <div class="navbar-header" data-logobg="skin6">
                        <a class="navbar-brand" href="dashboard.jsp">
                            <b class="logo-icon">
                                <img src="images/logo-icon.jpg" alt="homepage" />
                            </b>
                            <span class="logo-text">
                                <img src="images/logo-text.jpg" alt="homepage" />
                            </span>
                        </a>
                        <a class="nav-toggler waves-effect waves-light text-dark d-block d-md-none"
                           href="javascript:void(0)"><i class="ti-menu ti-close"></i></a>
                    </div>
                    <div class="navbar-collapse collapse" id="navbarSupportedContent" data-navbarbg="skin5">
                        <ul class="navbar-nav ms-auto d-flex align-items-center">
                            <li>
                                <a class="profile-pic" href="#">
                                    <img src="images/logo_admin.png" alt="user-img" width="36"
                                         class="img-circle"><span class="text-white font-medium"></span></a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </header>
            <aside class="left-sidebar" data-sidebarbg="skin6">
                <div class="scroll-sidebar">
                    <nav class="sidebar-nav">
                        <c:choose>
                            <c:when test="${sessionScope.admin != null}">
                                <ul id="sidebarnav">
                                    <li class="sidebar-item pt-2">
                                        <a class="sidebar-link waves-effect waves-dark sidebar-link" href="dashboard.jsp"
                                           aria-expanded="false">
                                            <i class="fa fa-dashboard" aria-hidden="true"></i>
                                            <span class="hide-menu">Dashboard</span>
                                        </a>
                                    </li>

                                    <li class="sidebar-item">
                                        <a class="sidebar-link waves-effect waves-dark sidebar-link" href="adproducts"
                                           aria-expanded="false">
                                            <i class="fa fa-product-hunt" aria-hidden="true"></i>
                                            <span class="hide-menu">Products</span>
                                        </a>
                                    </li>
                                    <li class="sidebar-item">
                                        <a class="sidebar-link waves-effect waves-dark sidebar-link" href="adlogout"
                                           aria-expanded="false">
                                            <i class="fa fa-sign-out" aria-hidden="true"></i>   
                                            <span class="hide-menu">Logout</span>
                                        </a>
                                    </li>
                                </ul>
                            </c:when>
                        </c:choose>
                    </nav>
                </div>
            </aside>
            <div class="page-wrapper">
                <div class="page-breadcrumb bg-white">
                    <div class="row align-items-center">
                        <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                            <h4 class="page-title">Profile</h4>
                        </div>
                    </div>
                </div>
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-4 col-xlg-3 col-md-12">
                            <div class="white-box">
                                <div class="user-bg">
                                    <div class="overlay-box">
                                        <div class="user-content">
                                            <a href="javascript:void(0)"><img src="images/logo_admin.png"
                                                                              class="thumb-lg img-circle" alt="img"></a>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:set var="p" value="${requestScope.detail}"/>
                        <div class="col-lg-8 col-xlg-9 col-md-12">
                            <div class="card">
                                <div class="card-body">
                                    <form class="form-horizontal form-material">
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Full Name
                                                <input value="${sessionScope.account.getEmail()}" type="text" name="fullname" class="form-control validate" readonly required/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Phone Number
                                                <input value="${p.phone}" type="text" name="phone" class="form-control validate" readonly required/>
                                            </div>
                                        </div>
                                        <div>Gender
                                            
                                            <P>
                                                <c:if test="${p.gender == false}">Female</c:if>
                                                <c:if test="${p.gender == true}">Male</c:if>
                                                </P>
                                            </div>
                                            <br/>
                                            <div class="form-group mb-4">
                                                <div class="col-md-12 border-bottom p-0">Email
                                                    <input value="${p.email}" type="email" class="form-control p-0 border-0" name="email" readonly required>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-sm-12">
                                                <a href="account" class="btn btn-success">Back</a>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="plugins/bower_components/jquery/jquery.min.js"></script>
        <script src="styles/bootstrap4/bootstrap.bundle.min.js"></script>
        <script src="js/dashboards/custom.js"></script>
        <script src="js/dashboards/app-style-switcher.js"></script>
        <script src="js/dashboards/waves.js"></script>
        <script src="js/dashboards/sidebarmenu.js"></script>
    </body>
</html>
