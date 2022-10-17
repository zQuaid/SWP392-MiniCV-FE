/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Context.DBContext;
import Model.Warehouse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class WarehouseDAO extends DBContext{
    public List<Warehouse> getAllWarehouse(){
        List<Warehouse> list = new ArrayList<>();
        String sql = "SELECT * FROM Warehouse";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Warehouse w = new Warehouse();
                w.setWarehouseID(rs.getInt("WarehouseID"));
                w.setWarehouseName(rs.getString("WarehouseName"));
                list.add(w);
            }
            
        }catch(SQLException e){
            
        }return list;
    }
    
    
}
