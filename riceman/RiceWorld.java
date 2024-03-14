package riceman;

import java.util.Scanner;

public class RiceWorld {
    public static void main(String[] args) {
       // nick live 10 miles away
      int deliveryFee = 0; // unknown

        Scanner riceWrld = new Scanner(System.in);
        System.out.println("What item are you seeking today?");
        String productname = riceWrld.next();

        System.out.println("how many " + productname + " would you want?");
        int qty = riceWrld.nextInt();

        System.out.println("Okay, whats the price?");
        float price = riceWrld.nextFloat();

        System.out.println("How far are you");
        int miles = riceWrld.nextInt();


        if (miles >=0 && miles <=4) { // Use && to check two conditions at the same time
          deliveryFee = 2;
      } // if statement conditions return boolean true or false
      else if (miles <=15 && miles >=5) {
            deliveryFee = 5; }
      else if (miles <=25 && miles >=16) {
          deliveryFee = 10; }
      else if (miles <=50 && miles >=26) {
          deliveryFee = 15;
      }
      else if (miles >50 ) {
          deliveryFee = 20;
      }

        float totalCost = qty * price + deliveryFee;
        System.out.println("Your total will be $" + totalCost);




















    }
}
