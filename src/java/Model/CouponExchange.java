/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class CouponExchange {
    private String couponExchangeID;
    private String couponName;
    private int pointNeeded;
    private String duration;
    private int quantity;

    public CouponExchange() {
    }

    public CouponExchange(String couponExchangeID, String couponName, int pointNeeded, String duration, int quantity) {
        this.couponExchangeID = couponExchangeID;
        this.couponName = couponName;
        this.pointNeeded = pointNeeded;
        this.duration = duration;
        this.quantity = quantity;
    }

    public String getCouponExchangeID() {
        return couponExchangeID;
    }

    public void setCouponExchangeID(String couponExchangeID) {
        this.couponExchangeID = couponExchangeID;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public int getPointNeeded() {
        return pointNeeded;
    }

    public void setPointNeeded(int pointNeeded) {
        this.pointNeeded = pointNeeded;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
