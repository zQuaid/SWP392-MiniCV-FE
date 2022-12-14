<%-- 
    Document   : staff
    Created on : Oct 16, 2022, 8:59:56 PM
    Author     : citih
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <link href="styles/css/userlist.css" rel="stylesheet">

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
                            <li class="sidebar-item pt">
                                <a class="sidebar-link waves-effect waves-dark sidebar-link active" href="#"
                                   aria-expanded="false">
                                    <span class="hide-menu">Update Profile</span>
                                </a>
                            </li>
                            <li class="sidebar-item">
                                <a class="sidebar-link waves-effect waves-dark sidebar-link active" href="#"
                                   aria-expanded="false">
                                    <span class="hide-menu">Add Service List</span>
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
                            <h4 class="page-title">User Profile</h4>
                        </div>
                    </div>
                </div>
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-8 col-xlg-9 col-md-12">
                            <div class="card">
                                <div class="card-body">
                                    <form class="form-horizontal form-material">
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">T??n
                                                <input value="${user.firstName} ${user.lastName}" type="text" name="fullname" class="form-control" readonly required/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Username
                                                <input value="${user.username}" type="text" name="username" class="form-control" readonly required/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Email
                                                <input value="${user.email}" type="text" name="email" class="form-control" readonly required/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Gi??i T??nh </div>
                                            <c:choose>
                                                <c:when test="${user.gender==true}"><input value="Male" type="text" name="gender" class="form-control" readonly required/></c:when>
                                                <c:otherwise><input value="Female" type="text" name="gender" class="form-control" readonly required/></c:otherwise>
                                            </c:choose>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">??ia Chi
                                                <input value="${user.address}" type="text" class="form-control" name="address" readonly required>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">S??T     
                                                <input value="${user.phone}" type="text" name="phone" class="form-control" readonly required/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Ng??y th??ng nam sinh
                                                <input value="${user.dob}" type="text" name="phone" class="form-control" readonly required/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">Diem t??ch luy
                                                <input value="${user.bonusPoint}" type="text" name="bonuspoint" class="form-control" readonly required/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">???? uy t??n
                                                <input value="${user.trust}" type="text" name="trust" class="form-control" readonly required/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">S?? don d?? order th??nh c??ng
                                                <input value="${requestScope.success}" type="text" name="success" class="form-control" readonly required/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">S?? don d?? huy
                                                <input value="${requestScope.canceled}" type="text" name="canceled" class="form-control" readonly required/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-md-12 border-bottom p-0">S?? don dang cho
                                                <input value="${requestScope.pending}" type="text" name="pending" class="form-control" readonly required/>
                                            </div>
                                        </div>
                                        <div class="form-group mb-4">
                                            <div class="col-sm-12">
                                                <a href="userlist" class="btn btn-success">Back</a>
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
</html>