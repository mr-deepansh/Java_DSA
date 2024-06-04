//  * functions 

import java.util.Scanner;

public class Basic {
  // public static void main(String[] args) {
  // multiply();
  // }

  // public static void multiply() {
  // // System.out.println("Hello World");
  // Scanner sc = new Scanner(System.in);
  // System.out.print("Enter A numbers: ");
  // int a = sc.nextInt();
  // System.out.print("Enter B numbers: ");

  // int b = sc.nextInt();
  // int multiple = a * b;
  // System.out.println("multiple is: " + multiple);
  // }
  // ? 2nd way parameterize the function
  public static void main(String[] args) {
    // ! This is a main function
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A number: ");
    int a = sc.nextInt();
    System.out.print("Enter B number: ");
    int b = sc.nextInt();
    sc.close();
    int result = multiply(a, b);
    System.out.println("The product is: " + result);
  }

  public static int multiply(int a, int b) {
    int multiple = a * b;
    return multiple;
  }

}
