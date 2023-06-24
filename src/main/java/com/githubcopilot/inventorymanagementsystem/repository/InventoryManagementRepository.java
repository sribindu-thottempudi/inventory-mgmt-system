package com.githubcopilot.inventorymanagementsystem.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.githubcopilot.inventorymanagementsystem.model.Product;
@Repository
public class InventoryManagementRepository {

    List<Product> productsList = new ArrayList<Product>();

    //create annotation @PostConstruct
    @PostConstruct
    //create method to initialize productList with sample data when application starts
    public void initializeProductsList(){
        // initialize productList with sample data such as 5 fruits, 5 electronics, 5 vegetables, 5 grains, 5 clothing witth various quantities and costs
        productsList.add(new Product(1,"Apple","Fruits",10,100.0));
        productsList.add(new Product(2,"Orange","Fruits",20,200.0));
        productsList.add(new Product(3,"Banana","Fruits",30,300.0));
        productsList.add(new Product(4,"Grapes","Fruits",40,400.0));
        productsList.add(new Product(5,"Mango","Fruits",50,500.0));
        productsList.add(new Product(6,"Television","Electronics",10,1000.0));
        productsList.add(new Product(7,"Mobile","Electronics",20,2000.0));
        productsList.add(new Product(8,"Laptop","Electronics",30,3000.0));
        productsList.add(new Product(9,"Refrigerator","Electronics",40,4000.0));
        productsList.add(new Product(10,"Washing Machine","Electronics",50,5000.0));
        productsList.add(new Product(11,"Potato","Vegetables",10,10000.0));
        productsList.add(new Product(12,"Tomato","Vegetables",20,20000.0));
        productsList.add(new Product(13,"Onion","Vegetables",30,30000.0));
        productsList.add(new Product(14,"Carrot","Vegetables",40,40000.0));
        productsList.add(new Product(15,"Cabbage","Vegetables",50,50000.0));
    }

    // method to get all products
    public List<Product> getProducts() {
       
        return productsList;
    }

    //method to create product
    public  Product createProduct(Product product){
        productsList.add(product);
        return product;
    }

    //method to update product
    public Product updateProduct(Product product){
        for(Product p: productsList){
            if(p.getId()==product.getId()){
                p.setProductName(product.getProductName());
                p.setProductCategory(product.getProductCategory());
                p.setProductQuantity(product.getProductQuantity());
                p.setProductCost(product.getProductCost());
                return p;
            }
        }
        return null;
    }
    
    //method to delete product
    public String deleteProduct(Integer productId){
        for(Product p: productsList){
            if(p.getId()==productId){
                productsList.remove(p);
                return "Product deleted successfully";
            }
        }
        return "Product not found";
    }

    //method to check stock availability
    //return product quantity with proper message including product name, otherwise return product is out of stock
    public String checkStockAvailability(Integer productId){
        for(Product p: productsList){
            if(p.getId()==productId){
                if(p.getProductQuantity()>0){
                    return "Product "+p.getProductName()+" is available with quantity "+p.getProductQuantity();
                }
                else{
                    return "Product "+p.getProductName()+" is out of stock";
                }
            }
        }
        return "Product not found";
    }
}

