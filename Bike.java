public class Bike{

  //instance variable
  String brand = "Honda";
  String colour = "Red";
  int	 engineCC = 120;
  int 	 gearBox = 5;
  double price = 85000.00;
  String noPlate = "KA01QA1122";
  boolean isDigital = true;


    public void starting(){
     System.out.println("Use the Key and Press the self button");
     System.out.println("Bike Started");
    }

    public void riding(){
     System.out.println("Wearing helmate accelarate");
     System.out.println("Riding Bike");
    }
    
   public void stoping(){
   	System.out.println("Turn the key off");
    System.out.println("Bike Stoped");
   }

   public static void main(String[] args){
     System.out.println("Main Method Started");

     Bike bike1 = new Bike(); //object creation

     bike1.brand = "Hero";

     System.out.println("Bike Details");
     System.out.println("Bike Brand="+bike1.brand);
     System.out.println(bike1.colour);
     System.out.println(bike1.engineCC);
     System.out.println(bike1.gearBox);
     System.out.println(bike1.price);
     System.out.println(bike1.noPlate);
     System.out.println(bike1.isDigital);

     bike1.starting();
   
     bike1.riding();

     bike1.stoping();


     Bike bike2 = new Bike();


     System.out.println("Main Method Ended");
   }


}