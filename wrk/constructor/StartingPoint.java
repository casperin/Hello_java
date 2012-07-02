public class StartingPoint {
  // There can be only *one* "main" function
  public static void main(String args[]){
  
    // We create a new instance of a "Dog" (which has to be defined somewhere - like in Dog.java). It's called a "Dog object".
    // We pass two arguments along.
    // A constructor (Dog) is always named with a capital first letter. Variables (jerome) with a lower case first letter. (By convention)
    Dog jerome = new Dog("Jerome", "Golden Retriever");

    Dog henry  = new Dog("Henry", "Pitbull");

    // These methods are defined by the constructor.
    jerome.bark();
    jerome.printName();


    henry.printName();

    henry.sayHello("John");

    jerome.sayHello();

  }
}
