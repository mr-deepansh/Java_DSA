import java.util.Scanner;

public class Convert_Decimal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a binary number: ");
    int binNum = scanner.nextInt();
    scanner.close();

    int originalBinNum = binNum;
    int power = 0;
    int decNum = 0;

    while (binNum > 0) {
      int lastDigit = binNum % 10;
      decNum = decNum + (lastDigit * (int) Math.pow(2, power));
      power++;
      binNum = binNum / 10;
    }

    System.out.println("Decimal Number: " + originalBinNum + " = " + decNum);
  }
}
