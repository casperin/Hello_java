// We enxtend the Animal. Sp when we create a Dog, then we know it is also an Animal (and has the same methods as defined in that class, see Animal.java)
// "Dog" is now a subclass
public class Dog extends Animal {

  String name;
  String breed;


  // Our constructor
  //
  // Set name and breed of dog when consutred. Not important to understand superclass
  Dog(String n, String b) {
    name = n;
    breed = b;
  }



  // This will overwrite the general method in the Animal superclass
  @Override // This is not *needed*. But good for compilers that checks your code: http://stackoverflow.com/questions/94361/when-do-you-use-javas-override-annotation-and-why
  void sayHi() {
    System.out.println("Hi, my name is " + name);
  }


  // We can also call methods from the superclass like this
  void sayHola() {
    super.sayHi();
  }



}
