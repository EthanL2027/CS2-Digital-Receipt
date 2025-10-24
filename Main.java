public class Main {

   public static void main(String []args) {
      System.out.println("Receipt");

     String highSchoolName = "Crenshaw";
     double drinkPrice = 1.50;
     double candyPrice = 1.25;
     double hotdogPrice = 2.75;
     double hamburgerPrice = 3.50;
     
     double orderNumber = (int) ( Math.random() * 100)+1;
      
   
      
     
     
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
