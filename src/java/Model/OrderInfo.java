/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class OrderInfo {
    private int orderID;
    private int productID;
    private Date date;
    private String coupon;
    private int userID;
    private String shippingAddress;
    private String shippingUnit;
    private int bonusPoint;
    private int totalPrice;
    private String status;
    private String paymentMethod;
    public OrderInfo() {
    }

    public OrderInfo(int orderID, int productID, Date date, String coupon, int userID, String shippingAddress, String shippingUnit, int bonusPoint, int totalPrice, String status, String paymentMethod) {
        this.orderID = orderID;
        this.productID = productID;
        this.date = date;
        this.coupon = coupon;
        this.userID = userID;
        this.shippingAddress = shippingAddress;
        this.shippingUnit = shippingUnit;
        this.bonusPoint = bonusPoint;
        this.totalPrice = totalPrice;
        this.status = status;
        this.paymentMethod = paymentMethod;
    }
    
    public OrderInfo(int orderID, int productID, Date date, String coupon, int userID, String shippingAddress, String shippingUnit, int bonusPoint, int totalPrice, String status) {
        this.orderID = orderID;
        this.productID = productID;
        this.date = date;
        this.coupon = coupon;
        this.userID = userID;
        this.shippingAddress = shippingAddress;
        this.shippingUnit = shippingUnit;
        this.bonusPoint = bonusPoint;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShippingUnit() {
        return shippingUnit;
    }

    public void setShippingUnit(String shippingUnit) {
        this.shippingUnit = shippingUnit;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
