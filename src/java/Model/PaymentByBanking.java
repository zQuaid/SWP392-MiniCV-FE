/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class PaymentByBanking {
    private String bankName;
    private String accountNumber;
    private String cardNumber;
    private String ownerName;

    public PaymentByBanking() {
    }

    public PaymentByBanking(String bankName, String accountNumber, String cardNumber, String ownerName) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    
    
    
    
}
