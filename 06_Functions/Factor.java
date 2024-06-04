import java.util.Scanner;

public class Factor {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    sc.close();
    System.out.println("Factorial of " + n + " is " + factor(n));
  }

  public static int factor(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f = f * i;
    }
    return f;
  }
}