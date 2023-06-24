# Inventory Management System - Architecture Diagram
![image](https://github.com/sribindu-thottempudi/inventory-mgmt-system/assets/137598786/4c39626a-4f59-4299-99c9-8240eca1c220)


# Inventory Management System - InventoryManagementSystem_API_and_OutputDetails

Inventory Management System 

The application Inventory Management System is created using spring boot, rest api.
It has the following API’s.
1)	To view the list of products available in the system
2)	To create a product
3)	To update the product
4)	To delete the product from the system
5)	To get the stock / quantity information of the product

IDE used: Visual studio code
Extension added : GitHub copilot

Copilot has made the task easy to write required API implementation, test cases.
Without manually writing the logic, copilot has implemented the required logic based on the method names.


Output:
1)	To view the list of products available in the system

 ![image](https://github.com/sribindu-thottempudi/inventory-mgmt-system/assets/137598786/ea0893e3-99bb-4b4c-a899-833713036d3c)
2)	To create a product

 ![image](https://github.com/sribindu-thottempudi/inventory-mgmt-system/assets/137598786/f682ca01-234f-4a1a-bb4e-dc08c404e206)


Product with id – 16 has been added successfully, the same is shown in the list of products retrieved below
 
![image](https://github.com/sribindu-thottempudi/inventory-mgmt-system/assets/137598786/4696b12f-2d5b-4ee0-8530-8880701cd42e)

3)	To update the product

The product quantity for product id :6 is updated to zero.

![image](https://github.com/sribindu-thottempudi/inventory-mgmt-system/assets/137598786/d35dd905-1428-4b3d-a330-b7749685da5a)

 
4)	To delete the product from the system
Currently in the System Product id:9, Refrigerator is available.

![image](https://github.com/sribindu-thottempudi/inventory-mgmt-system/assets/137598786/43be8f23-5856-4f9d-9684-a305bfca6ac8)


 

Delete the product id:9, Refrigerator.
After hitting the API, the product has been deleted.

 ![image](https://github.com/sribindu-thottempudi/inventory-mgmt-system/assets/137598786/1508ef03-c713-4e50-af35-606db8a1fc84)



5)	To get the stock / quantity information of the product
Stock / inventory information for product : 5, Mangoes
Response: Product Mango is available with quantity 50

![image](https://github.com/sribindu-thottempudi/inventory-mgmt-system/assets/137598786/eb878aee-816a-48a0-aac3-603332a24840)

 

Stock / inventory information for product : 16

Response: Product ABC cookies is out of stock

 ![image](https://github.com/sribindu-thottempudi/inventory-mgmt-system/assets/137598786/0bcdd955-8e5e-4997-a734-61aaa47b56b1)


#Inventory Management System -Use Case
#Use Case: Develop Inventory Management System in Java
Utilizing Copilot for Code Generation 

Introduction:
In this use case, we explore how GitHub Copilot, an AI-powered code generation tool, assisted in developing the code for an Inventory Management System built using Spring Boot and REST API. With Copilot integrated into Visual Studio Code, the process of writing API implementations and test cases was simplified, eliminating the need for manual logic implementation.

Problem Statement:
create an Inventory Management System with the following APIs:

1)View the list of products available in the system.
2)Create a product
3)Update a product
4)Delete a product from the system.
5)Retrieve stock/quantity information for a product.

Solution using GitHub Copilot:
To streamline the development process and leverage the capabilities of GitHub Copilot, the following steps were taken:

Step 1: Setting up the Development Environment

The development environment consisted of Visual Studio Code, a popular code editor.
The GitHub Copilot extension was installed and configured within Visual Studio Code.

Initially I've added the dependencies required for spring boot web project and created inventory-mgmt-system project.


Added required files : Rest Controller: InventoryManagementController, Service:Interface: IInventoryManagementService, Implementation: InventoryManagementServiceImpl, Repository: InventoryManagementRepository, Model : Product

Step 2: Creating the API Skeleton

Using the Spring Boot framework, the necessary REST API endpoints were defined within the application.
For each API, the corresponding method names were implemented, such as getProducts(), createProduct(), updateProduct(), deleteProduct(), and checkStockAvailability().

Step 3: Leveraging GitHub Copilot

With the method names defined, Copilot provided valuable assistance by generating the initial code logic for each API.
For example, when implementing the viewProductList() API, Copilot suggested code snippets that fetched the list of products from the system and returned them to the client.
Similarly, for the createProduct() API, Copilot generated code snippets that handled the creation of a new product, including database operations and error handling.
This pattern continued for the remaining APIs, where Copilot consistently provided accurate and context-aware code suggestions based on the method names.

Step 4: Refining and Customizing Generated Code

Although Copilot generated the initial code, it was further refined and customized as per specific requirements.


Step 5: Testing the API Implementations

Copilot's assistance extended to generating test cases for the implemented APIs as well.
It has suggested to create required mock beans, test aces.
Test case skeletons were automatically suggested based on the API names, covering different scenarios such as successful execution, error handling, and edge cases.

Benefits and Outcomes:
By integrating GitHub Copilot into the development process of the Inventory Management System, the following benefits were realized:
Time-saving: Copilot significantly reduced the time required to write the initial code logic for the APIs by generating accurate and relevant suggestions.
Code quality: The AI-powered suggestions assisted in reducing common coding errors, enhancing code quality, and improving maintainability.
Faster testing: Copilot's generation of test case skeletons accelerated the testing process, enabling thorough validation of the implemented APIs.


In conclusion, GitHub Copilot proved to be an invaluable tool for code generation during the development of the Inventory Management System. By automating the initial code logic and test case generation, Copilot expedited the development process, improved code quality, and increased overall productivity.

