package com.githubcopilot.inventorymanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.githubcopilot.inventorymanagementsystem.model.Product;
import com.githubcopilot.inventorymanagementsystem.service.IInventoryManagementService;

@RestController
public class InventoryManagementController{

    //create annotation         

    @Autowired
    IInventoryManagementService inventoryManagementService;

    
    @GetMapping("/products")
    public List<Product> getProducts(){    
        return inventoryManagementService.getProducts();
    }

    @PostMapping("/product")
    // to create product    
    public Product createProduct(@RequestBody Product product){
        return inventoryManagementService.createProduct(product);
    }  
    
    // to update product using product object with PutMapping annotation
    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product product){
        return inventoryManagementService.updateProduct(product);
    }

    // to delete product using id with DeleteMapping annotation
    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable("id")Integer productId){
        return inventoryManagementService.deleteProduct(productId);
    }   

    //to checkStockAvailability using id with GetMapping annotation and return Json response
    @GetMapping("/product/{id}")
    public String checkStockAvailability(@PathVariable("id")Integer productId){
        return inventoryManagementService.checkStockAvailability(productId);
    }
    
}
