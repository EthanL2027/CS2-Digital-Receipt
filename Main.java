import java.util.Scanner;
public class Main {

   public static void main(String []args) {
      System.out.println("Receipt");

      

     String highSchoolName = "Crenshaw";
     double drinkPrice = 1.50;
     double candyPrice = 1.25;
     double hotdogPrice = 2.75;
     double hamburgerPrice = 3.50;
     
       double orderNumber = (int) ( Math.random() * 100)+1;
     System.out.println("Order Number: " + orderNumber);

     double drinksOrdered = (int) (Math.random() * 10)+1;
     System.out.println("Drinks ordered: " + drinksOrdered);

     double candyOrdered = (int) (Math.random() * 10)+1;
     System.out.println("Candy ordered: " + candyOrdered);

     double hotdogsOrdered = (int) (Math.random() * 10)+1;
     System.out.println("Hot dogs ordered: " + hotdogsOrdered);

     double hamburgersOrdered = (int) (Math.random() * 10)+1;
     System.out.println("Hamburgers ordered: " + hamburgersOrdered);
      
      double taxRate = 0.08;
      System.out.println("Tax rate: " + taxRate);

      double subTotal = drinkPrice * drinksOrdered + candyPrice * candyOrdered + hotdogPrice * hotdogsOrdered + hamburgerPrice * hamburgersOrdered;
      System.out.println("Sub total: " + subTotal);

      double totalTax = taxRate * subTotal;
      System.out.println("Total tax: " + totalTax);

      double total = totalTax + subTotal;
      System.out.println("Total: " + total);


      
     
     
      // RECEIPT PRINTOUT SECTION
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar             *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPrice + "           *");                      
     System.out.println("*     Candy ..........$" + candyPrice + "          *");     
     System.out.println("*     Hot Dog ........$" + hotdogPrice + "          *");     
     System.out.println("*     Hamburger ......$" + hamburgerPrice + "           *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");

    
   }
}
