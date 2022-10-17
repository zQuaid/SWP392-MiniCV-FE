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
        private OrderInfo order;
        private Product product;
        private int price;

    public Bill() {
    }

    public Bill(OrderInfo order, Product product, int price) {
        this.order = order;
        this.product = product;
        this.price = price;
    }

    public OrderInfo getOrder() {
        return order;
    }

    public int getPrice() {
        return price;
    }

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

    
        
        
}
