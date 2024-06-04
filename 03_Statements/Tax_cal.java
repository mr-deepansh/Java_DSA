import java.util.Scanner;

public class Tax_cal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your income :");

    int income = scanner.nextInt();
    scanner.close();
    int tax;
    if (income < 500000) {
      tax = 0;
    } else if (income >= 500000 && income < 1000000) {
      tax = (int) (income * 0.2);
    } else {
      tax = (int) (income * 0.3);
    }
    System.out.println("Your tax is: " + tax);
  }

  // method second
  /*
   * private static final int NO_TAX_THRESHOLD = 500000;
   * private static final int MID_TAX_THRESHOLD = 1000000;
   * private static final double MID_TAX_RATE = 0.2;
   * private static final double HIGH_TAX_RATE = 0.3;
   * 
   * public static void main(String[] args) {
   * Scanner scanner = new Scanner(System.in);
   * System.out.print("Enter your income: ");
   * 
   * if (scanner.hasNextInt()) {
   * int income = scanner.nextInt();
   * 
   * if (income < 0) {
   * System.out.println("Income cannot be negative.");
   * } else {
   * int tax = calculateTax(income);
   * System.out.println("Your tax is: " + tax);
   * }
   * } else {
   * System.out.println("Invalid input. Please enter a valid integer.");
   * }
   * scanner.close();
   * }
   * 
   * private static int calculateTax(int income) {
   * if (income < NO_TAX_THRESHOLD) {
   * return 0;
   * } else if (income < MID_TAX_THRESHOLD) {
   * return (int) (income * MID_TAX_RATE);
   * } else {
   * return (int) (income * HIGH_TAX_RATE);
   * }
   * }
   */
}