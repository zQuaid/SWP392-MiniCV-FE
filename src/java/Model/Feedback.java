/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Feedback {
    private int feedbackID;
    private int userID;
    private int Q1;
    private int Q2;
    private int Q3;
    private String customerOpinion;

    public Feedback() {
    }

    public Feedback(int feedbackID, int userID, int Q1, int Q2, int Q3, String customerOpinion) {
        this.feedbackID = feedbackID;
        this.userID = userID;
        this.Q1 = Q1;
        this.Q2 = Q2;
        this.Q3 = Q3;
        this.customerOpinion = customerOpinion;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getQ1() {
        return Q1;
    }

    public void setQ1(int Q1) {
        this.Q1 = Q1;
    }

    public int getQ2() {
        return Q2;
    }

    public void setQ2(int Q2) {
        this.Q2 = Q2;
    }

    public int getQ3() {
        return Q3;
    }

    public void setQ3(int Q3) {
        this.Q3 = Q3;
    }

    public String getCustomerOpinion() {
        return customerOpinion;
    }

    public void setCustomerOpinion(String customerOpinion) {
        this.customerOpinion = customerOpinion;
    }
    
    
}
