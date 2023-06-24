package com.githubcopilot.inventorymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.githubcopilot.inventorymanagementsystem.model.Product;
import com.githubcopilot.inventorymanagementsystem.repository.InventoryManagementRepository;

@Service
public class InventoryManagementServiceImpl implements IInventoryManagementService{

    // create annotation @Autowired for InventoryManagementRepository
    @Autowired
    InventoryManagementRepository inventoryManagementRepository;

    // implement method to get all products
    @Override
    public List<Product> getProducts() {
        return inventoryManagementRepository.getProducts();
    }

    // implement method to create product
    @Override
    public Product createProduct(Product product) {
        return inventoryManagementRepository.createProduct(product);
    }

    // implement method to update product
    @Override
    public Product updateProduct(Product product) {
        return inventoryManagementRepository.updateProduct(product);
    }

    // implement method to delete product
    @Override
    public String deleteProduct(Integer productId) {
        return inventoryManagementRepository.deleteProduct(productId);
    }

    // implement method to checkStockAvailability
    @Override
    public String checkStockAvailability(Integer productId) {
        return inventoryManagementRepository.checkStockAvailability(productId);
    }

}
