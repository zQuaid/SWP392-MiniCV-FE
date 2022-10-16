<%-- 
    Document   : myorder
    Created on : Oct 2, 2022, 1:40:02 AM
    Author     : citih
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <!--  This file has been downloaded from bootdey.com @bootdey on twitter -->
        <!--  All snippets are MIT license http://bootdey.com/license -->
        <title>bs4 past orders profile - Bootdey.com</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <link rel="stylesheet" href="https://allyoucan.cloud/cdn/icofont/1.0.1/icofont.css" integrity="sha384-jbCTJB16Q17718YM9U22iJkhuGbS0Gd2LjaWb4YJEZToOPmnKDjySVa323U+W7Fv" crossorigin="anonymous">

        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <div class="osahan-account-page-left shadow-sm bg-white h-100">
                        <div class="border-bottom p-4">
                            <div class="osahan-user text-center">
                                <div class="osahan-user-media">
                                    <img class="mb-3 rounded-pill shadow-sm mt-1" src="https://bootdey.com/img/Content/avatar/avatar1.png" alt="gurdeep singh osahan">
                                    <div class="osahan-user-media-body">
                                        <h6 class="mb-2">Gurdeep Singh</h6>
                                        <p class="mb-1">+91 85680-79956</p>
                                        <p>iamosahan@gmail.com</p>
                                        <p class="mb-0 text-black font-weight-bold"><a class="text-primary mr-3" data-toggle="modal" data-target="#edit-profile-modal" href="editprofile"><i class="icofont-ui-edit"></i> EDIT</a></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <ul class="nav nav-tabs flex-column border-0 pt-4 pl-4 pb-4" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link" id="orders-tab" data-toggle="tab" href="#orders" role="tab" aria-controls="orders" aria-selected="false"><i class="icofont-food-cart"></i> Orders</a>
                            </li>
                        </ul>
                    </div>
                </div>

                <div class="col-md-9">
                    <div class="osahan-account-page-right shadow-sm bg-white p-4 h-100">
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane  fade  active show" id="orders" role="tabpanel" aria-labelledby="orders-tab">
                                <h4 class="font-weight-bold mt-0 mb-4">Past Orders</h4>
                                <div class="bg-white card mb-4 order-list shadow-sm">
                                    <div class="gold-members p-4">
                                        <a href="#">
                                        </a>
                                        <div class="media">

                                            <div class="media-body">



                                                <form>
                                                    <input type="text" class="form-control" placeholder="Tìm kiếm tho ID đơn hàng hoặc Tên Sản phẩm"> 
                                                    <input type="submit" class="form-control" > 
                                                </form>



                                            </div>
                                        </div>

                                    </div>
                                </div>

                                <c:forEach items="${requestScope.listod}" var="od">


                                    <div class="bg-white card mb-4 order-list shadow-sm" >
                                        <div class="gold-members p-4">
                                            <a href="#">
                                            </a>
                                            <div class="media">

                                                <a href="#">
                                                    <img class="mr-4" src="https://bootdey.com/img/Content/avatar/avatar2.png" alt="Generic placeholder image">
                                                </a>
                                                <div class="media-body">
                                                    <a href="#">
                                                        <span class="float-right text-info"> <i class="icofont-check-circled text-success"></i></span>
                                                    </a>
                                                    <h6 class="mb-2">
                                                        <a href="#"></a>
                                                        <a href="#" class="text-black">Name : ${od.product.productName} </a>
                                                    </h6>
                                                    <p class="text-gray mb-1"><i class="icofont-location-arrow"></i> Shipping address:${od.orderInfo.shippingAddress}   </p>
                                                    <p class="text-gray mb-3"><i class="icofont-list"></i>OrderID: ${od.orderInfo.orderID}   <i class="icofont-clock-time ml-2"></i>Date:${od.orderInfo.date} </p>
                                                    <p class="text-dark">Quantity: ${od.getQuantity()}
                                                    </p>
                                                    <hr>
                                                    <div class="float-right">

                                                        <a class="btn btn-sm btn-outline-primary" href="oderdetail?userid=${od.orderInfo.userID}?productid=${od.product.productID}?date=${od.orderInfo.date}"><i class="icofont-headphone-alt"></i> VIEW DETAIL</a>

                                                        <a class="btn btn-sm btn-primary" href="#"><i class="icofont-refresh"></i> REORDER</a>
                                                    </div>
                                                    <p class="mb-0 text-black text-primary pt-2"><span class="text-black font-weight-bold"> Total Paid:</span> ${od.orderInfo.totalPrice}
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </c:forEach>


                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <style type="text/css">
            body{
                margin-top:20px;
                background:#eee;
            }
            /* My Account */
            .payments-item img.mr-3 {
                width: 47px;
            }
            .order-list .btn {
                border-radius: 2px;
                min-width: 121px;
                font-size: 13px;
                padding: 7px 0 7px 0;
            }
            .osahan-account-page-left .nav-link {
                padding: 18px 20px;
                border: none;
                font-weight: 600;
                color: #535665;
            }
            .osahan-account-page-left .nav-link i {
                width: 28px;
                height: 28px;
                background: #535665;
                display: inline-block;
                text-align: center;
                line-height: 29px;
                font-size: 15px;
                border-radius: 50px;
                margin: 0 7px 0 0px;
                color: #fff;
            }
            .osahan-account-page-left .nav-link.active {
                background: #f3f7f8;
                color: #282c3f !important;
            }
            .osahan-account-page-left .nav-link.active i {
                background: #282c3f !important;
            }
            .osahan-user-media img {
                width: 90px;
            }
            .card offer-card h5.card-title {
                border: 2px dotted #000;
            }
            .card.offer-card h5 {
                border: 1px dotted #daceb7;
                display: inline-table;
                color: #17a2b8;
                margin: 0 0 19px 0;
                font-size: 15px;
                padding: 6px 10px 6px 6px;
                border-radius: 2px;
                background: #fffae6;
                position: relative;
            }
            .card.offer-card h5 img {
                height: 22px;
                object-fit: cover;
                width: 22px;
                margin: 0 8px 0 0;
                border-radius: 2px;
            }
            .card.offer-card h5:after {
                border-left: 4px solid transparent;
                border-right: 4px solid transparent;
                border-bottom: 4px solid #daceb7;
                content: "";
                left: 30px;
                position: absolute;
                bottom: 0;
            }
            .card.offer-card h5:before {
                border-left: 4px solid transparent;
                border-right: 4px solid transparent;
                border-top: 4px solid #daceb7;
                content: "";
                left: 30px;
                position: absolute;
                top: 0;
            }
            .payments-item .media {
                align-items: center;
            }
            .payments-item .media img {
                margin: 0 40px 0 11px !important;
            }
            .reviews-members .media .mr-3 {
                width: 56px;
                height: 56px;
                object-fit: cover;
            }
            .order-list img.mr-4 {
                width: 70px;
                height: 70px;
                object-fit: cover;
                box-shadow: 0 .125rem .25rem rgba(0, 0, 0, .075)!important;
                border-radius: 2px;
            }
            .osahan-cart-item p.text-gray.float-right {
                margin: 3px 0 0 0;
                font-size: 12px;
            }
            .osahan-cart-item .food-item {
                vertical-align: bottom;
            }

            .h1, .h2, .h3, .h4, .h5, .h6, h1, h2, h3, h4, h5, h6 {
                color: #000000;
            }

            .shadow-sm {
                box-shadow: 0 .125rem .25rem rgba(0,0,0,.075)!important;
            }

            .rounded-pill {
                border-radius: 50rem!important;
            }
            a:hover{
                text-decoration:none;
            }
        </style>

        <script type="text/javascript">

        </script>
    </body>
</html>
