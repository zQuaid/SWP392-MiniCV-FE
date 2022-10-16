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
}
