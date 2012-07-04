class SubClass extends SuperClass {

  private String name;
  int k = 11;

  SubClass(String name) {
    // Can be created both with, and without a variable. However it must the first statement in a constructor
    super("hello"); 
    // super();


    // "this" is mandatory here, to avoid confusion between the two "name" variables
    this.name = name;
  }

  public void m() {
    // To gain access to the "k" variable defined in SuperClass.java, you have to prefix it with "super". If you don't add "super"; you will use the variable defined above
    System.out.println(super.k);

    // "this" is not a must here. Works just fine if you print "name". However it's considered good coding style to use it
    System.out.println(this.name);
  }

}
