import java.util.Scanner;
public class Main {

   public static void main(String []args) {
      System.out.println("Receipt");

      Scanner input = new Scanner(System.in);

     String highSchoolName = "Birch Wathen Lenox";
    String initials1 = highSchoolName. substring(0,1);
    String initials2 = highSchoolName. substring(6,7);
    String initials3 = highSchoolName. substring(13,14);
    System.out.println(initials1 + initials2 + initials3);


     double drinkPrice = 1.50;
     double candyPrice = 1.25;
     double hotdogPrice = 2.75;
     double hamburgerPrice = 3.50;
     
       double orderNumber = (int) ( Math.random() * 100)+1;
     System.out.println("Order Number: " + orderNumber);

     double drinksOrdered = input.nextInt();
     System.out.println("Drinks ordered: " + drinksOrdered);

     double candyOrdered = input.nextInt();
     System.out.println("Candy ordered: " + candyOrdered);

     double hotdogsOrdered = input.nextInt();
     System.out.println("Hot dogs ordered: " + hotdogsOrdered);

     double hamburgersOrdered = input.nextInt();
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
     System.out.println("*     " + highSchoolName + " Snack Bar   *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPrice + "           *");                      
     System.out.println("*     Candy ..........$" + candyPrice + "          *");     
     System.out.println("*     Hot Dog ........$" + hotdogPrice + "          *");     
     System.out.println("*     Hamburger ......$" + hamburgerPrice + "           *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");

    
   }
}
