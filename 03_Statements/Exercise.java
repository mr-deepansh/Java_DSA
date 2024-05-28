import java.util.Scanner;

public class Exercise {

  public static void main(String[] args) {
    // int a = 1;
    // int b = 3;

    // if (a >= b) {
    // System.out.println("a is greater than b");
    // } else {
    // System.out.println("a is less than b");
    // }

    // print if a number is odd or even
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    if (number % 2 == 0) {
      System.out.println("The number is even");
    } else {
      System.out.println("The number is odd");
    }
    scanner.close();

  }
}