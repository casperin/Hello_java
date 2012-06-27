class Hundred  {
  public static void main(String[] args) {
    String str = "";
    String name = args[0];
    int length = 0;
    int i = 0;
    while (i < 100) {
      str += name + " ";
      length += name.length()+1;
      if (length > 80) {
        str += "\n";
        System.out.println(length);
        length = 0;
      }
      i++;
    }
    System.out.println(str);
  }
}

