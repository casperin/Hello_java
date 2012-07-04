class SuperClass {
    // We have a "k" set to 11 in SubClass
    int k = 10;

    // This will be run if a subclass fires "super();"
    SuperClass() {
      System.out.println("created");
    }

    // And this will be run if it fires "super(a);"
    SuperClass(String n) {
      System.out.println("Create with variable: " + n);
    }
}
