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

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = 1;
    int n = input.nextInt();
    while (number <= n) {
      System.out.println(number);
      number++;

    }
  }
}