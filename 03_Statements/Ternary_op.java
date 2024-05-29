/**
 * Ternary_op
 */
public class Ternary_op {

  public static void main(String[] args) {

    int a = 5, b = 10;
    int max = (a > b) ? a : b;
    System.out.println("The maximum value is: " + max);

    int number = 9;
    String result = (number % 2 == 0) ? "Even" : "Odd";
    System.out.println("The number is " + result);

  }
}