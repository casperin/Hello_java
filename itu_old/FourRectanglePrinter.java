public class FourRectanglePrinter {

  // Private variables
  private int width = 50;
  private int height = 50;
  private int x = 75;
  private int y = 75;

  // Our constructor for building the rectangle
  public FourRectanglePrinter(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public static void main(String[] arg) {
    FourRectanglePrinter rectangle = new FourRectanglePrinter(75,75,50,50);
    System.out.println("First rectangle:");
    System.out.println("X: " + rectangle.x + ", Y: " + rectangle.y + ", Width: " + rectangle.width + ", Height: " + rectangle.height );
    rectangle.x = rectangle.x + 50;
    System.out.println("Second rectangle:");
    System.out.println("X: " + rectangle.x + ", Y: " + rectangle.y + ", Width: " + rectangle.width + ", Height: " + rectangle.height );
    rectangle.y = rectangle.y + 50;
    System.out.println("Third rectangle:");
    System.out.println("X: " + rectangle.x + ", Y: " + rectangle.y + ", Width: " + rectangle.width + ", Height: " + rectangle.height );
    rectangle.x = rectangle.x - 50;
    System.out.println("Fourth rectangle:");
    System.out.println("X: " + rectangle.x + ", Y: " + rectangle.y + ", Width: " + rectangle.width + ", Height: " + rectangle.height );
  }


}

