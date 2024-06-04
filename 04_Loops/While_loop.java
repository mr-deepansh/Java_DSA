import java.util.Scanner;

public class While_loop {

  public static void main(String[] args) {
    // int i = 0;
    // while (i < 10) {
    // System.out.println("Hello Programmer ! How are you Today");
    // i++;
    // }

    // while loop second example
    // int counter = 1;
    // while (counter <= 10) {
    // System.out.println("Counter is: " + counter);
    // counter++;

    // third example

    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int number = 1;
    // int n = input.nextInt();
    // while (number <= n) {
    // System.out.println(number);
    // number++;
    // }
    // input.close();

    // fourth example
    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int n = input.nextInt();
    // int sum = 0;
    // int i = 1;
    // while (i <= n) {
    // sum = sum + i;
    // i++;
    // }
    // System.out.println("Sum is: " + sum);
    // input.close();

    // fifth example

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();

    while (n > 0) {
      int lastDigit = n % 10;
      n = n / 10;
      System.out.print(lastDigit);
    }
    input.close();

    // sixth example
    // int n = 10899;
    // int rev = 0;

    // while (n > 0) {
    // int lastDigit = n % 10;
    // rev = (rev * 10) + lastDigit;
    // n = n / 10;
    // }
    // System.out.println(rev);
  }
}