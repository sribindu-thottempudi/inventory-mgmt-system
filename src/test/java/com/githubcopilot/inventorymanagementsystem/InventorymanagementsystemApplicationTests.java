package com.githubcopilot.inventorymanagementsystem;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.githubcopilot.inventorymanagementsystem.controller.InventoryManagementController;
import com.githubcopilot.inventorymanagementsystem.model.Product;
import com.githubcopilot.inventorymanagementsystem.repository.InventoryManagementRepository;
import com.githubcopilot.inventorymanagementsystem.service.IInventoryManagementService;

@SpringBootTest
class InventorymanagementsystemApplicationTests {

	//create a mock bean for the repository
	//create a mock bean for the service
	//create a mock bean for the controller
	@MockBean
	private InventoryManagementRepository inventoryManagementRepository;
	@MockBean
	private IInventoryManagementService inventoryManagementService;
	@MockBean
	private InventoryManagementController inventoryManagementController;
	

	@Test
	void contextLoads() {
	}



	// test method for getProducts
	@Test
	public void testGetProducts() {
		//create a list of products
		inventoryManagementService.getProducts();
	}


	// test method for createProduct
	@Test
	public void testCreateProduct() {
		//create a product
		Product product = new Product(1, "product1", "Category1",10, (double) 100);
		inventoryManagementService.createProduct(product);
		//print the product if created
		System.out.println(product);
		
	}

	// test method for updateProduct
	@Test
	public void testUpdateProduct() {
		//update a product
		Product product = new Product(1, "product1", "Category1",10, (double) 100);
		inventoryManagementService.updateProduct(product);
		//print the product if updated
		System.out.println(product);
	}

	// test method for deleteProduct
	@Test
	public void testDeleteProduct() {
		//delete a product
		Product product = new Product(1, "product1", "Category1",10, (double) 100);
		inventoryManagementService.deleteProduct(product.getId());
		//print the product if deleted
		System.out.println(product);
	}

	// test method for checkStockAvailability
	@Test
	public void testCheckStockAvailability() {
		//check stock availability
		Product product = new Product(1, "product1", "Category1",10, (double) 100);
		String productAvailability = inventoryManagementService.checkStockAvailability(product.getId());
		//print the product if available
		System.out.println(productAvailability);
	}

	


}
