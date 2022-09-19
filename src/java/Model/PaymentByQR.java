/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class PaymentByQR {
    private int qrID;
    private String qrImage;

    public PaymentByQR() {
    }

    public PaymentByQR(int qrID, String qrImage) {
        this.qrID = qrID;
        this.qrImage = qrImage;
    }

    public int getQrID() {
        return qrID;
    }

    public void setQrID(int qrID) {
        this.qrID = qrID;
    }

    public String getQrImage() {
        return qrImage;
    }

    public void setQrImage(String qrImage) {
        this.qrImage = qrImage;
    }
    
    
}
