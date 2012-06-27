class StaircasePrinter  {
    public static void main(String[] args) {
      String air = "    ";
      String stepV = "+---";
      String stepH = "|   ";
      System.out.println(air + air + air + stepV + "+");
      System.out.println(air + air + air + stepH + "|");
      System.out.println(air + air + stepV + stepV + "+");
      System.out.println(air + air + stepH + stepH + "|");
      System.out.println(air + stepV + stepV + stepV + "+");
      System.out.println(air + stepH + stepH + stepH + "|");
      System.out.println(stepV + stepV + stepV + stepV + "+");
      System.out.println(stepH + stepH + stepH + stepH + "|");
      System.out.println(stepV + stepV + stepV + stepV + "+");
    }
}

