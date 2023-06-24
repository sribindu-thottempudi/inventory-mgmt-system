package com.githubcopilot.inventorymanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Product {

    // create properties product name 
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name="product_name")
    private String productName;
    @Column(name="product_category")
    private String productCategory;
    @Column(name="product_quantity")
    private Integer productQuantity;
    @Column(name="product_cost")
    private Double productCost;

    // constructor with all properties
    public Product(Integer id, String productName, String productCategory, Integer productQuantity,
            Double productCost) {
        this.id = id;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productQuantity = productQuantity;
        this.productCost = productCost;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    //getter and setter for product category
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public Integer getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }
    public Double getProductCost() {
        return productCost;
    }
    public void setProductCost(Double productCost) {
        this.productCost = productCost;
    }

    


}
