/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Product {
    private int productID;
    private String productName;
    private int quantity;
    private String description;
    private String image;
    int categoryID,warehouseID;
    private String price;
    private int discount;
    private Warehouse warehouse;
    private Category category;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(int warehouseID) {
        this.warehouseID = warehouseID;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product(int productID, String productName, int quantity, String description, String image, int categoryID, int warehouseID, String price, int discount, Warehouse warehouse, Category category) {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.description = description;
        this.image = image;
        this.categoryID = categoryID;
        this.warehouseID = warehouseID;
        this.price = price;
        this.discount = discount;
        this.warehouse = warehouse;
        this.category = category;
    }

    public Product() {
    }

    

    

    
    
    
    
    
    
    
    
}