<%-- 
    Document   : cart
    Created on : Jul 19, 2022, 1:09:10 AM
    Author     : trung
--%>

<%@page  contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<%@page import="Context.DBContext"%>
<%@page import="Model.*"%>
<%@page import="DAO.ProductDAO"%>


<%
    ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
    List<Cart> cartProduct = null;
    if(cart_list != null){
        ProductDAO pDAO = new ProductDAO();
        cartProduct = pDAO.getCartProducts(cart_list);
        double total = pDAO.getTotalCartPrice(cart_list);
        request.setAttribute("cart_list", cart_list);
        request.setAttribute("total", total);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Shopping Cart</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
        <link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
        <link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
        <link rel="stylesheet" type="text/css" href="plugins/jquery-ui-1.12.1.custom/jquery-ui.css">
        <link rel="stylesheet" type="text/css" href="styles/css/all.min.css.css">
        <link rel="stylesheet" type="text/css" href="styles/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="styles/detail_styles.css">
        <link rel="stylesheet" type="text/css" href="styles/detail_responsive.css">

    </head>
    <body>
        <section class="pt-5 pb-5">
            <div class="container">
                <div class="row w-100">
                    <div class="col-lg-12 col-md-12 col-12">
                        <h3 class="display-5 mb-2 text-center">Shopping Cart</h3>
                        <p class="mb-5 text-center">
                            <i class="text-info font-weight-bold">${requestScope.size}</i> items in your cart</p>
                        <table id="shoppingCart" class="table table-condensed table-responsive">
                            <tr>
                                <th style="width:50%">Product</th>
                                <th style="width:12%">Price</th>
                                <th style="width:10%">Quantity</th>
                                <th style="width:10%"></th>
                            </tr>
                            <%
                                if(cart_list!=null){
                                    for(Cart c: cartProduct){%>
                            <tr>
                                <td data-th="Product">
                                    <div class="row">
                                        <div class="col-md-3 text-left">
                                            <img src="${i.image}" class="img-fluid d-none d-md-block rounded mb-2 shadow ">
                                        </div>
                                        <div class="col-md-9 text-left mt-sm-2">

                                            <h4><%= c.getProductName()%></h4>
                                        </div>
                                    </div>
                                </td>
                                <td data-th="Price"><%= c.getPrice()%></td>
                                <td  <div class="container single_product_container">

                                    <div class="row">

                                        <div class="col-lg-5">
                                            <div class="product_details">
                                                <div class="quantity d-flex flex-column flex-sm-row align-items-sm-center">

                                                    <div class="quantity_selector">
                                                        <a class="minus" href="quantityaddtocart?action=dec&id=<%= c.getProductID()%>"><i class="fa fa-minus" aria-hidden="true"></i></a>
                                                        <!--                                                        <span class="minus"><i class="fa fa-minus" aria-hidden="true"><a href="quantityaddtocart"></a></i></span>-->
                                                        <!--                                                        <span id="quantity_value" name ="quantity" value=""></span>-->
                                                        <input id="quantity_value" type="text" name ="quantity" value="<%= c.getQuantityAdd()%>">
                                                        <a class="plus" href="quantityaddtocart?action=inc&id=<%= c.getProductID()%>"><i class="fa fa-plus" aria-hidden="true"></i></a>
                                                        <!--                                                        <span class="plus"><i class="fa fa-plus" aria-hidden="true"><a href="quantityaddtocart"></a></i></span>-->
                                                    </div>
                                                </div>

                                            </div>
                                        </div>

                                    </div>
                                    </div></td>
                                <td class="actions" data-th="">
                                    <div class="text-right">
                                        <button class="btn btn-white border-secondary bg-white btn-md mb-2">
                                            <a href="remove-from-cart?id=<%= c.getProductID()%>">
                                                <i class="fa fa-trash"></i>
                                            </a>
                                        </button>
                                    </div>
                                </td>
                            </tr>
                            <%}
                            }
                            %>

                        </table>
                        <div class="float-right text-right">
                            <h4>Subtotal:</h4>
                            <h1>₫ ${(total>0)?total:0}</h1>
                        </div>
                    </div>
                </div>
                <div class="row mt-4 d-flex align-items-center">
                    <div class="col-sm-6 order-md-2 text-right">
                        <a href="#" class="btn btn-primary mb-4 btn-lg pl-5 pr-5">Checkout</a>
                    </div>
                    <div class="col-sm-6 mb-3 mb-m-1 order-md-1 text-md-left">
                        <a href="product">
                            <i class="fa fa-arrow-left mr-2"></i>Continue Shopping</a>
                    </div>
                </div>
            </div>
        </section>
        <script src="js/cart/jquery-3.3.1.slim.min.js"></script>
        <script src="js/cart/popper.min.js"></script>
        <script src="js/cart/bootstrap.min.js"></script>
    </body>
</html>
