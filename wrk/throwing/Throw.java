public class Throw {
  public static void main(String args[]){

    // Setting up the numbers for division. We want to divide 6 with 0 to blow up the world
    double a = 6;
    double b = 0;

    // Creating an object that has a method defined to divide with
    Mathing math = new Mathing();

    // When wishing to throw exceptions, you must always "try/catch"
    try {
      // Divide with zero
      System.out.println(math.divide(a,b));
    } catch (MyException e) {
      // It will throw an error, and this is how we print it to the log
      e.printStackTrace();
    }

  }
}
