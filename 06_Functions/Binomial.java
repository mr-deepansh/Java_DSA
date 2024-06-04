import java.util.Scanner;

public class Binomial {
  public static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f *= i;
    }
    return f;
  }

  public static int binomial(int n, int r) {
    return factorial(n) / (factorial(r) * factorial(n - r));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    System.out.print("Enter r: ");
    int r = sc.nextInt();
    sc.close();

    System.out.println("Binomial Coefficient: " + binomial(n, r));
  }
}
