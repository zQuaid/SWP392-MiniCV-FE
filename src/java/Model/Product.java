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
<<<<<<< HEAD
    private int price;
    int discount;
    private int quantity;
    private String description;
    private String image;
    int categoryID,warehouseID;
=======
    private String price;
    private int discount;
    private int quantity;
    private String description;
    private String image;
    private Warehouse warehouse;
    private Category category;
>>>>>>> 9a91acbe35befbf50e8957d5bc9ad72036479e8a

    public Product() {
    }

<<<<<<< HEAD
    public Product(int productID, String productName, int price, int discount, int quantity, String description, String image, int categoryID, int warehouseID) {
=======
    public Product(int productID, String productName, String price, int discount, int quantity, String description, String image, Warehouse warehouse, Category category) {
>>>>>>> 9a91acbe35befbf50e8957d5bc9ad72036479e8a
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.description = description;
        this.image = image;
<<<<<<< HEAD
        this.categoryID = categoryID;
        this.warehouseID = warehouseID;
=======
        this.warehouse = warehouse;
        this.category = category;
>>>>>>> 9a91acbe35befbf50e8957d5bc9ad72036479e8a
    }

    

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
<<<<<<< HEAD
=======
    
>>>>>>> 9a91acbe35befbf50e8957d5bc9ad72036479e8a

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

<<<<<<< HEAD
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

   
=======
    public Category getCategory() {
        return category;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    

>>>>>>> 9a91acbe35befbf50e8957d5bc9ad72036479e8a
    
    
    
    
    
    
    
    
}