// Required to take input from user
import java.util.Scanner;

public class Calculator {
  public static void main(String args[]){

    // Defining 'sc' to be our Scanner
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to our amazing calculator. Unfortunately, it only works with integers.");
    System.out.print("Type in the first number: ");
    // The program pauses here, takes the next int that a user types in, and assigns it to 'fnum' (first number)
    int fnum = sc.nextInt();

    System.out.print("Type in your operator: ");
    String op = sc.next();
    // This line is only because a switch operator doesn't take a string, but only 'char', 'int', 'byte', and some others:
    // http://stackoverflow.com/questions/2898068/java-switch-incompatible-types-boolean-int
    char operator = op.charAt(0);
  
    System.out.print("Type in the second number: ");
    int snum = sc.nextInt();

    // If this is not set to 0, then we get a compile time error because the program MIGHT end up trying to print something undefined
    int answer = 0;

    // Joyride from here

    switch(operator){
      case '+':
        answer = fnum + snum;
        break;
      case '-':
        answer = fnum - snum;
        break;
      case '*':
        answer = fnum * snum;
        break;
      case '/':
        answer = fnum / snum;
        break;
    }

    System.out.println(fnum + " " + operator + " " + snum + " = " + answer);


  }
}
