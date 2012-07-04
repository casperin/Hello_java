public class Car implements CarInterface {

  String brand;

  // A normal constructor taking one argument. Nothing new.
  Car(String b) {
    brand = b;
    System.out.println("Created a " + b + " for you.");
  }


  // The Car class (this file) implements CharInterface(.java), so it has to contain the methods defined in that.
  //
  // First one is brand()
  @Override
  public String brand() {
    return brand;
  }

  // Second is a method that takes two integers and returns a third
  @Override
  public int numOfWheels(int a, int b) {
    return a + b;
  }

}
