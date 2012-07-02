// A Dog class
// Notice that it is named "Dog", not "dog". This is by convention and done to make it easier to read later.
public class Dog{

  // Variables without a value. You will get an error if it's called before it has been assigned a value
  String name;
  String breed;

  // This is the constructor. It takes two arguments. No more, no less.
  // You can have as many constructors in a class as you want, e.g. if you want one that only takes one argument
  Dog(String n, String b) {
    name = n;
    breed = b;
  }

  // General method
  void bark() {
    System.out.println("Woof");
  }

  // General method that prints the dogs name (that was set when it was constructed)
  void printName() {
    System.out.println(name);
  }

  // Methods can also take arguments and use them.
  // Again, this seems to be a certain number
  void sayHello(String n) {
    System.out.println("Hello " + n + ". How are you?");
  }

  // This method has same name as the one above, but is considered different in that it takes a different number and type of parameters.
  void sayHello(){
    System.out.println("Hello. How are you?");
  }



}
