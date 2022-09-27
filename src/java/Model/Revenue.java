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
    private int targetRevenue;
    private int month;
    private int year;

    public Revenue() {
    }

    public Revenue(int totalRevenue, int targetRevenue, int month, int year) {
        this.totalRevenue = totalRevenue;
        this.targetRevenue = targetRevenue;
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(int totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public int getTargetRevenue() {
        return targetRevenue;
    }

    public void setTargetRevenue(int targetRevenue) {
        this.targetRevenue = targetRevenue;
    }
    
    
}
