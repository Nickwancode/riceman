package riceman;

public class RiceWorld {
    public static void main(String[] args) {
      String productname = "Rice";
      int qty = 20; // Nick wants 20 rice
      float price = 5.0f; // Nick know rice is 5 dollars each
      int miles = -1; // nick live 10 miles away
      int deliveryFee = 0; // unknown
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
