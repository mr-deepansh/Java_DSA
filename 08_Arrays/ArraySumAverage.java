import java.util.Scanner;

public class ArraySumAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter the number of elements
    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];
    int sum = 0;

    // Input elements into the array
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
      sum += arr[i]; // Add each element to sum
    }

    // Calculate average
    double average = (double) sum / n;

    // Display the sum and average
    System.out.println("Sum = " + sum);
    System.out.println("Average = " + average);

    scanner.close();
  }
}
