// A class containing the divide method
class Mathing{

  // The only method in this class. Takes two doubles, and returns a double
  public double divide(double a, double b) throws MyException {
    // Check if the 'b' is zero and throws and error if so
    if (b == 0) {
      throw new MyException("You can't divide by zero!");
    }
    // If b == 0, then we never get this far. The error break out of the program and shuts it down
    return a / b;
  }

}
