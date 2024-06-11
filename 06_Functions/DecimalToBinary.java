import java.util.Scanner;

public class DecimalToBinary {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Decimal number: ");
    int decimalNumber = scanner.nextInt();
    scanner.close();

    int power = 0;
    int binaryNumber = 0;

    while (decimalNumber > 0) {
      int remainder = decimalNumber % 2;
      binaryNumber += remainder * Math.pow(10, power);
      power++;
      decimalNumber /= 2;
    }

    System.out.println("Binary representation: " + binaryNumber);
  }
}
