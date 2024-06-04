import java.util.Scanner;

public class Do_while {
  public static void main(String[] args) {
    // do while loop first example
    // int i = 20;
    // do {
    // System.out.println("Hello Programmer ! How are you Today");
    // i++;
    // } while (i < 10);

    // do while loop second example

    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int number = 1;
    // int n = input.nextInt();
    // input.close();

    // do {
    // System.out.println(number);
    // number++;
    // } while (number <= n);

    // do while loop fourth example

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    input.close();
    int sum = 0;
    int i = 1;
    do {
      sum = sum + i;
      i++;
    } while (i <= n);
    System.out.println("Sum is: " + sum);

  }

}