<<<<<<< HEAD

Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change. 


C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

    - mainscreen.html
        - line #: 14 - updated head title
        - line #: 16 - added background color
        - line #: 18 - centered container
        - line #: 19 - added shop name as header
        - line #: 20 - added image of terrarium
        - line #: 31,32,47,48,68,83,84 - changed button colors
   

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

    - mainscreen.html
        - line # 90,91 - added link to about html
    - created about.html
        - added info about the company
    - AboutController.java  
        - added a controller to handle get requests to /about


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

    - BootStrapData.java
        - lines: 34-90 - preloads 5 plant inventory items if none already
        - lines: 92-140 - preloads 5 material inventory items if none already
        - lines: 143-158 - preloads 5 product items if none already

    - Renamed endpoint mappings, methods, and variables to match my company
        - PlantForm.html, MaterialForm.html, AddMaterialController.java, AddPlantController.java


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
  •  The “Buy Now” button must be next to the buttons that update and delete products.
  •  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
  •  Display a message that indicates the success or failure of a purchase.

    - mainscreen.html
        - line #: 83 - added Buy Now button
    - AddProductController.java
        - lines: 177-199 - added /buyProduct mapping with logic to decrement product's inventory
    - Failure.html
        - added page to render if trying to buy product with 0 inventory
    - Success.html
        - added page to render when product purchase is successful


G.  Modify the parts to track maximum and minimum inventory by doing the following:
    •  Add additional fields to the part entity for maximum and minimum inventory.
    •  Modify the sample inventory to include the maximum and minimum fields.
    •  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
    •  Rename the file the persistent storage is saved to.
    •  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

    - Part.java
        - lines: 32-35 - added minInv and maxInv variables
        - lines: 98-112 - added getters/setters for minInv and maxInv
    - mainscreen.html
        - lines: 39-40, 49-50 - added minInv and maxInv to parts table
    - BootStrapData.java
        - lines: 35-185 - added preloaded minInv and maxInv values for parts
    - application.properties
        - line 6: renamed datasource file
    - PlantForm.html
        - lines: 25-29 - added min/max inventory fields to input forms
        - lines: 32-36 - added error message
    - MaterialForm.html
        - lines: 25-29 - added min/max inventory fields to input forms
        - lines: 31-35 - added error message
    - InventoryValidator.java, ValidInventory.java
        - added constraint validations for if entered amounts are greater or less than max/min values
    - Part.java
        - added ValidInventory annotation


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

    - ValidMinInv.java
        - created custom annotation for validation logic
    - MinInvValidator.java
        - implemented validation of this annotation
    - Product.java
        - line: 23 - added @ValidMinInv annotation to product class


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

    - PartTest.java
        - lines: 104-111 - added testMinInv()
    - PartTest.java
        - lines: 113-120 - added testMaxInv()


J.  Remove the class files for any unused validators in order to clean your code.

    - DeletePartValidator.java
        - delete this file
=======

Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change. 


C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

    - mainscreen.html
        - line #: 14 - updated head title
        - line #: 16 - added background color
        - line #: 18 - centered container
        - line #: 19 - added shop name as header
        - line #: 20 - added image of terrarium
        - line #: 31,32,47,48,68,83,84 - changed button colors
   

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

    - mainscreen.html
        - line # 90,91 - added link to about html
    - created about.html
        - added info about the company
    - AboutController.java  
        - added a controller to handle get requests to /about


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

    - BootStrapData.java
        - lines: 34-90 - preloads 5 plant inventory items if none already
        - lines: 92-140 - preloads 5 material inventory items if none already
        - lines: 143-158 - preloads 5 product items if none already

    - Renamed endpoint mappings, methods, and variables to match my company
        - PlantForm.html, MaterialForm.html, AddMaterialController.java, AddPlantController.java


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
  •  The “Buy Now” button must be next to the buttons that update and delete products.
  •  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
  •  Display a message that indicates the success or failure of a purchase.

    - mainscreen.html
        - line #: 83 - added Buy Now button
    - AddProductController.java
        - lines: 177-199 - added /buyProduct mapping with logic to decrement product's inventory
    - Failure.html
        - added page to render if trying to buy product with 0 inventory
    - Success.html
        - added page to render when product purchase is successful


G.  Modify the parts to track maximum and minimum inventory by doing the following:
    •  Add additional fields to the part entity for maximum and minimum inventory.
    •  Modify the sample inventory to include the maximum and minimum fields.
    •  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
    •  Rename the file the persistent storage is saved to.
    •  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

    - Part.java
        - lines: 32-35 - added minInv and maxInv variables
        - lines: 98-112 - added getters/setters for minInv and maxInv
    - mainscreen.html
        - lines: 39-40, 49-50 - added minInv and maxInv to parts table
    - BootStrapData.java
        - lines: 35-185 - added preloaded minInv and maxInv values for parts
    - application.properties
        - line 6: renamed datasource file
    - PlantForm.html
        - lines: 25-29 - added min/max inventory fields to input forms
        - lines: 32-36 - added error message
    - MaterialForm.html
        - lines: 25-29 - added min/max inventory fields to input forms
        - lines: 31-35 - added error message
    - InventoryValidator.java, ValidInventory.java
        - added constraint validations for if entered amounts are greater or less than max/min values
    - Part.java
        - added ValidInventory annotation


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

    - ValidMinInv.java
        - created custom annotation for validation logic
    - MinInvValidator.java
        - implemented validation of this annotation
    - Product.java
        - line: 23 - added @ValidMinInv annotation to product class


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

    - PartTest.java
        - lines: 104-111 - added testMinInv()
    - PartTest.java
        - lines: 113-120 - added testMaxInv()


J.  Remove the class files for any unused validators in order to clean your code.

    - DeletePartValidator.java
        - delete this file
>>>>>>> 71bff175338eb4802fd49d5301a6d0474b4477fd
