class Say {
  public static void main(String[] args) {
    String sn = args[0];
    String msg = "";
    int n = Integer.parseInt(sn);

    if ( n < 0 || n > 99 ) { // Check if the number inputted is out of range
      msg = "Number is out of range. Please insert a number between 0 and 99.";
    } else {
      int fn = Integer.parseInt( Character.toString( sn.charAt(0) ) ); // Get first digit and assign it
      int ln = 0;
      if ( n > 9 ) ln = Integer.parseInt( Character.toString( sn.charAt(1) ) ); // Last digit, if it's there
      // Setting up the arrays that we need
      String[] ones = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
      String[] tens = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

      if ( n == 0 ) { // Special case
        msg = "zero";
      } else if ( n < 20 ) { // No need to combine the word
        msg = ones[n];
      } else { // Twenty and above we use combined words. For "20", "30", etc. it's important to have the "empty" spot in the first array
        msg = tens[fn] + ones[ln];
      }
    }
    System.out.println(msg);
  }
}

