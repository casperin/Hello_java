class Leap  {
    public static void main(String[] args) {
        String str = args[0];
        int y = Integer.parseInt(str);
        String msg = "";

        int k = y % 4;
        if ( y % 4 == 0 ) {
          if ( y % 100 == 0 ) {
            if ( y % 400 == 0 ) {
              msg = "Leap year!";
            } else {
              msg = "Not a leap year!";
            }
          } else {
            msg = "Not a leap year!";
          }
        } else {
          msg = "Not a leap year!";
        }

        System.out.println(msg);
    }
}

