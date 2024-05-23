import java.util.*;

public class Sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter value of a: ");
    int a = scanner.nextInt();

    System.out.println("Enter value of b: ");
    int b = scanner.nextInt();

    int c = a * b;
    System.out.println("Multiply of a and b is: " + c);

    scanner.close();
  }
}
