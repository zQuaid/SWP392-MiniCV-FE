/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mihxdat
 */
public class Cart extends Product{
    private int quantityAdd;
    
    public Cart(){
        
    }

    public int getQuantityAdd() {
        return quantityAdd;
    }

    public void setQuantityAdd(int quantityAdd) {
        this.quantityAdd = quantityAdd;
    }
    
    
//    private List<Item> items;
//
//    public Cart() {
//        items = new ArrayList<>();
//    }
//
//    public List<Item> getItems() {
//        return items;
//    }
//    
//    public int getQuantityByID(int id){
//        return getItemByID(id).getQuantity();
//    }
//    
//    private Item getItemByID(int id){
//        for(Item i : items){
//            if(i.getProduct().getProductID()==id){
//                return i;
//            }
//        }
//        return null;
//    }
//    
//    public void addItem(Item t){
//        if(getItemByID(t.getProduct().getProductID()) != null){
//            Item m = getItemByID(t.getProduct().getProductID());
//            m.setQuantity(m.getQuantity()+t.getQuantity());
//        }else{
//            items.add(t);
//        }
//    }
//    
//    public void removeItem(int id){
//        if(getItemByID(id)!=null ){
//            items.remove(getItemByID(id));
//        }
//    }
//    
//    public double getTotalMoney(){
//        double total = 0;
//        for(Item i: items){
//            total+=(i.getQuantity()*i.getPrice());
//        }
//        return total;
//    }
//    private  Product getProductByID(int id, List<Product> list){
//        for(Product i:list){
//            if(i.getProductID()==id)
//                return i;
//        }
//        return null;
//        
//    }
//    public Cart(String txt, List<Product> list){
//        items = new ArrayList<>();
//        try {
//          if(txt!=null && txt.length()!=0){
//            String[] s = txt.split(",");
//            for(String i:s){
//                String[] n = i.split(":");
//                int id = Integer.parseInt(n[0]);
//                int quantity=Integer.parseInt(n[1]);
//                Product p = getProductByID(id, list);
//                Item t = new Item(p, quantity, p.getPrice());
//                addItem(t);
//            }
//        }  
//        } catch (Exception e) {
//        }
//        
//    }

    
    
}
