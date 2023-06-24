package com.githubcopilot.inventorymanagementsystem.service;

import java.util.List;

import com.githubcopilot.inventorymanagementsystem.model.Product;

public interface IInventoryManagementService{
    
    // create method to get all products
    List<Product> getProducts();

    // create method to create product
    Product createProduct(Product product);

    // create method to update product
    Product updateProduct(Product product);

    // create method to delete product
    String deleteProduct(Integer productId);

    // create method to checkStockAvailability
    String checkStockAvailability(Integer productId);
}
