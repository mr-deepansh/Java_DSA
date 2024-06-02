import java.util.Scanner;

public class Check_Prime_no {

  // Check Prime Number
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();

    // Special cases
    if (n <= 1) {
      System.out.println("Not a Prime Number");
    } else if (n == 2) {
      System.out.println("Prime Number");
    } else {
      boolean isPrime = true;
      // Only check up to the square root of n
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println("Prime Number");
      } else {
        System.out.println("Not a Prime Number");
      }
    }
    sc.close();
  }
}
