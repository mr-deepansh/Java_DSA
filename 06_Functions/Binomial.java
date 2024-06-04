import java.util.Scanner;

public class Binomial {
  public static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f = f * i;
    }
    return f;
  }

  public static int binomial(int n, int r) {
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_n_r = factorial(n - r);
    int binomial = fact_n / (fact_r * fact_n_r);
    return binomial;
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