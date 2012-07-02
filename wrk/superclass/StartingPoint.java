public class StartingPoint {
  public static void main(String args[]){
  
    Dog jerome = new Dog("Jerome", "Golden Retriever");

    // from the Animal superclass
    jerome.isAnimal();

    // This is also from the superclass, but gets overwritten in the Dog subclass
    jerome.sayHi();

    // A method from the Dog subclass that calls a method in its Animal superclass
    jerome.sayHola();

  }
}
