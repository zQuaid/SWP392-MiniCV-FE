/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import Model.PaymentByBanking;
import Model.PaymentByQR;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PaymentDAO extends DBContext{
    public List<PaymentByBanking> getListBanking(){
        List<PaymentByBanking> listpmb = new ArrayList<>();
        String sql = "SELECT * From PaymentByBanking";
        try{
        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
            while(rs.next()){
                PaymentByBanking pmb = new PaymentByBanking();
                pmb.setBankName(rs.getString("BankName"));
                pmb.setAccountNumber(rs.getString("AccountNumber"));
                pmb.setCardNumber(rs.getString("CardNumber"));
                pmb.setOwnerName(rs.getString("OwnerName"));
                listpmb.add(pmb);
            }
        }catch(SQLException e){
        }return listpmb;
    }
    
    public PaymentByBanking getPaymentByBanking(String accountNumber){
        PaymentByBanking pmb = new PaymentByBanking();
        String sql = "SELECT * From PaymentByBanking WHERE AccountNumber = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, accountNumber);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
            pmb.setBankName(rs.getString("BankName"));
            pmb.setAccountNumber(rs.getString("AccountNumber"));
            pmb.setCardNumber(rs.getString("CardNumber"));
            pmb.setOwnerName(rs.getString("OwnerName"));
            }
        }catch(SQLException e){
        }return pmb;
    }
    
    public void addPaymentByBanking(PaymentByBanking pmb){
        String sql = "INSERT INTO PaymentByBanking(BankName, AccountNumber, CardNumber, OwnerName) VALUES(?,?,?,?)";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, pmb.getBankName());
            st.setString(2, pmb.getAccountNumber());
            st.setString(3, pmb.getCardNumber());
            st.setString(4, pmb.getOwnerName());
            st.executeUpdate();
        }catch(SQLException e){
            
        }
    }
    
    public void updatePaymentByBanking(PaymentByBanking pmb, String accnum){
        String sql = "UPDATE PaymentByBanking SET BankName =?, AccountNumber = ?, CardNumber = ?, OwnerName = ? WHERE AccountNumber = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, pmb.getBankName());
            st.setString(2, pmb.getAccountNumber());
            st.setString(3, pmb.getCardNumber());
            st.setString(4, pmb.getOwnerName());
            st.setString(5, accnum);
            st.executeUpdate();
        }catch(SQLException e){
            
        }
    }
    
    public void deletePaymentByBanking(String accountNumber){
        String sql = "DELETE FROM PaymentByBanking WHERE accountNumber = ?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, accountNumber);
            st.executeUpdate();
        }catch(SQLException e){
            
        }
    }
    
    public List<PaymentByQR> getPaymentByQR(){
        List<PaymentByQR> listpbq = new ArrayList<>();
        String sql = "SELECT * From PaymentByQR";
        try{
        PreparedStatement st = connection.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
            while(rs.next()){
                PaymentByQR pbq = new PaymentByQR();
                pbq.setQrID(rs.getInt("QRId"));
                pbq.setQrImage(rs.getString("QRLink"));
                listpbq.add(pbq);
            }
        }catch(SQLException e){
        }return listpbq;
    }
    
    public void deletePaymentQR(int qrid){
        String sql = "DELETE FROM PaymentByQR WHERE QRId = ?";
        try{
            PreparedStatement st = connection.prepareCall(sql);
            st.setInt(1, qrid);
            st.executeUpdate();
        }catch(SQLException e){
            
        }
    }
}
