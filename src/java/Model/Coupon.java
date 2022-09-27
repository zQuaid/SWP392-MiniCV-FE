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
public class Coupon {
    private int couponId;
    private String couponCode;
    private Date dateExpried;
    private int userID;

    public Coupon() {
    }

    public Coupon(int couponId, String couponCode, Date dateExpried, int userID) {
        this.couponId = couponId;
        this.couponCode = couponCode;
        this.dateExpried = dateExpried;
        this.userID = userID;
    }

    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Date getDateExpried() {
        return dateExpried;
    }

    public void setDateExpried(Date dateExpried) {
        this.dateExpried = dateExpried;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
}
