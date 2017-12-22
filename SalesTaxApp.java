package salestaxapp;
 
import java.text.NumberFormat;
import java.util.Locale;
 
public class SalesTaxApp {
 
    public static void main(String[] args) {
       
        // Add items into the Product constructor to set variable/types.
        Product book = new Product(1, "book", 12.49f, false, false);
        Product cd= new Product(1, "music CD", 14.99f, true, false);
        Product chocoBar = new Product(1, "chocolate bar ", 0.85f,
                false, false);
       
        // For Currency and calculations
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        Calculations cal = new Calculations();
       
        float tsTaxOne = cal.tsTax1(book.productTax, cd.productTax,
               chocoBar.productTax);
        float totalOne = cal.tTotalOne(book.price, cd.price,
                chocoBar.price, tsTaxOne);
       
        // Print Results
        System.out.print(
                book.quantity + " " +
                book.description + " : " +
                currency.format(book.priceTotal) + "\n" +
               
                cd.quantity + " " +
                cd.description + " : " +
                currency.format(cd.priceTotal) + "\n" +
                       
                chocoBar.quantity + " " +
                chocoBar.description + " " +
                currency.format(chocoBar.priceTotal)+ "\n");
       
        System.out.println("Sales Tax: " + currency.format(tsTaxOne));
        System.out.println("Total : " + currency.format(totalOne));
    }
   
}