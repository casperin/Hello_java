// The interesting bits are in CarInterface.java and Car.java
public class StartingPoint {
  public static void main (String args[]) {
  
    // Creating a car
    Car volvo = new Car("Volvo"); 

    // Looking in Car.java you can see that it implements the CarInterface. Which forces it to have the methods defined in there


    // Checking out number of wheels
    System.out.println("Your car has " + volvo.numOfWheels(2,2) + " wheels.");

    // Checking its brand
    System.out.println("The brand is " + volvo.brand()); // These two methods (from Car.java), are forced on it from the CarInterface.java
  
  }
}
