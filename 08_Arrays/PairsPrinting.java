/**
 * PairsPrinting
 */
public class PairsPrinting {

  public static void main(String[] args) {
    int[] numbers = { 10, 20, 30, 40, 50 };
    printPairs(numbers);
  }

  public static void printPairs(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        System.out.print(" ( " + numbers[i] + "," + numbers[j] + " ) ");
      }
      System.out.println();
    }
  }
}
