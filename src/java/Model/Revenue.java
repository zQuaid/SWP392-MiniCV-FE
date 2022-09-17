/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Revenue {
    private int totalRevenue;
    private int orderID;
    private int targetRevenue;

    public Revenue() {
    }

    public Revenue(int totalRevenue, int orderID, int targetRevenue) {
        this.totalRevenue = totalRevenue;
        this.orderID = orderID;
        this.targetRevenue = targetRevenue;
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(int totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getTargetRevenue() {
        return targetRevenue;
    }

    public void setTargetRevenue(int targetRevenue) {
        this.targetRevenue = targetRevenue;
    }
    
    
}
