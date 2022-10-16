/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author Admin
 */
public class Bill {
<<<<<<< HEAD
        private OrderInfo orderInfo;
        private Product product;
        private int quantity;
=======
        private OrderInfo order;
        private Product product;
        private int price;
>>>>>>> 9a91acbe35befbf50e8957d5bc9ad72036479e8a

    public Bill() {
    }

<<<<<<< HEAD
    public Bill(OrderInfo orderInfo, Product product, int quantity) {
        this.orderInfo = orderInfo;
        this.product = product;
        this.quantity = quantity;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
=======
    public Bill(OrderInfo order, Product product, int price) {
        this.order = order;
        this.product = product;
        this.price = price;
    }

    public OrderInfo getOrder() {
        return order;
>>>>>>> 9a91acbe35befbf50e8957d5bc9ad72036479e8a
    }

    public int getQuantity() {
        return quantity;
    }

<<<<<<< HEAD
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

 

  

  
=======
    public Product getProduct() {
        return product;
    }

    public void setOrder(OrderInfo order) {
        this.order = order;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    
        
>>>>>>> 9a91acbe35befbf50e8957d5bc9ad72036479e8a
        
}
