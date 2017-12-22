package salestaxapp;
 
public class Calculations {
    float totalSalesTax;
    float total;
   
    public float tsTax1(float itemOne, float itemTwo, float itemThree){
        totalSalesTax = itemOne + itemTwo + itemThree;
        return totalSalesTax;
    }
   
    public float  tsTax2(float itemOne, float itemTwo){
         totalSalesTax = itemOne + itemTwo;
         return totalSalesTax;
    }
   
    public float tsTax3(float itemOne, float itemTwo, float itemThree,
            float itemFour){
        totalSalesTax = itemOne + itemTwo + itemThree + itemFour;
        return totalSalesTax;
    }
   
    public float tTotalOne(float itemOne, float itemTwo, float itemThree,
            float salesTax){
        total = itemOne + itemTwo + itemThree + salesTax;
        return total;
    }
   
}