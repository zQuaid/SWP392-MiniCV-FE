<%-- 
    Document   : userlist
    Created on : Sep 19, 2022, 7:07:26 AM
    Author     : Admin
--%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link href="styles/css/addstaff.css" rel="stylesheet">

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
                                    <span class="hide-menu">Summary</span>
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
                            <h4 class="page-title">Add New Staff</h4>
                        </div>
                    </div>
                </div>
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-8 col-xlg-9 col-md-12">
                            <div class="card">
                                <div class="card-body">
                                    <form class="form-horizontal form-material" method="POST">
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">First Name
                                                <input type="text" name="firstname" id="firstname" class="form-control"/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Last Name
                                                <input type="text" name="lastname" id=lastname class="form-control"/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Username
                                                <input type="text" name="username" id="username" class="form-control"/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Password
                                                <input type="password" name="password" id="password" class="form-control"/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Email
                                                <input type="text" name="email" class="form-control" id="email"/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Giôi Tính </div>
                                            <input type="radio" name="gender" id="gender" value="1" checked=""> Male
                                            <input type="radio" name="gender" id="gender" value="0"> Female
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Ðia Chi
                                                <input type="text" class="form-control" name="address" id="address">
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">CMT/CCCD
                                                <input type="text" class="form-control" name="citizenid" id="citizenid">
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">SÐT     
                                                <input type="text" name="phone" id="phone" class="form-control"/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Ngày tháng nam sinh
                                                <input type="date" name="dob" id="dob" class="form-control"/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Ca lam viec
                                                <select class="custom-select" style="width:200px;" name="workingshift" id="workingshift">
                                                    <option value="Sang">Sáng</option>
                                                    <option value="Chieu">Chiêu</option>
                                                    <option value="Toi">Tôi</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Luong
                                                <input  type="text" name="salary" id="salary" class="form-control"/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-sm-12">
                                                <a href="stafflist" class="btn btn-success">Back</a>
                                                <button type="submit" class="btn btn-success" id="btnadd">Add</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4 col-xlg-3 col-md-12">
                            <div class="white-box">
                                <div class="user-bg">
                                    <div class="overlay-box">
                                        <div class="user-content"><img src="${user.accImage}" width="150" height="150" alt="${user.id}">
                                        </div>
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
    <script src="js/addstaff.js"></script>
</html>
