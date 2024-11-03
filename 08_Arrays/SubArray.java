/**
 * SubArray
 */
public class SubArray {

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 10, 14 };
    printSubArrays(numbers);
  }

  public static void printSubArrays(int[] numbers) {
    int totalSubArrays = 0;
    for (int start = 0; start < numbers.length; start++) { // Outer Loop
      for (int end = start; end < numbers.length; end++) { // inner Loop
        int sum = 0;
        System.out.print("subArrays: [ ");
        for (int k = start; k <= end; k++) { // Innermost Loop
          System.out.print(numbers[k] + " "); // SubArray
          sum += numbers[k];
        }
        totalSubArrays++;
        System.out.print("] => Sum = " + sum);
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("Total subArrays = " + totalSubArrays);
  }
}
