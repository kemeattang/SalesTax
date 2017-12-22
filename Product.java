package salestaxapp;
 
public class Product {
   
    int quantity = 0;
    String description;
    float price = 0.00f;
    float priceTotal = 0.00f;
    Boolean basicItem;
    Boolean importedItem;
   
    float salesTax = 0.00f;
    float productTax = 0.00f;
   
   
    public Product(int nQuantity, String nDescription, float nPrice,
            Boolean bItem, Boolean imported){
        quantity = nQuantity;
        description = nDescription;
        price = nPrice;
        basicItem = bItem;
        importedItem = imported;
       
         if(basicItem == true){
            salesTax = 0.10f;
         }
         if(importedItem == true){
            salesTax = 0.15f;
         }
         
         productTax = price * salesTax;
         
         priceTotal = price + productTax;
    }
}
 