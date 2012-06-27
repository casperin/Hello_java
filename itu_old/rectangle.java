public class rectangle {

  // Private variables
  private int width = 50;
  private int height = 50;
  private int x = 75;
  private int y = 75;

  // Our constructor for building the rectangle
  public rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public static void main(String[] arg) {
    rectangle rectangle = new rectangle(75,75,50,50);
    System.out.println("Hello, Dave");
  }


}

