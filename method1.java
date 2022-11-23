public class method1 extends method2 {
  
  // instance fields
  String productType;

    public method1(String product, String name) {
        super(name);
        productType = product;
        
    }
     
    // advertise method
    public void advertise() {
      String message = "Selling " + productType + "!";
          System.out.println(message);
    }
    
    public void greetCustomer(String customer){
  
      System.out.println("Welcome to the store, " + customer + "!");
    }
    // main method
    public static void main(String[] args) {
      method1 lemonadeStand = new method1("Lemonade","lemonade store");
      
      lemonadeStand.greetCustomer("Arnold");
      System.out.println(lemonadeStand.name);
      System.out.println(lemonadeStand.productType);
    }
  }