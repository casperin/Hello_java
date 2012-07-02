public class Animal {

  // If a "Dog" is created (which extends this class), then the dog will also have access to this method
  void isAnimal() {
    System.out.println("Yes, this is an animal");
  } 


  // Another method, that we will overwrite in the Dog class
  void sayHi() {
    System.out.println("Hi");
  }

}
