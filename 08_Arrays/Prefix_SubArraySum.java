import java.util.*;

public class Prefix_SubArraySum {
  public static void main(String[] args) {
    int numbers[] = { 1, -2, 6, -1, 3 };
    System.out.println("Max sum is: " + maxSubArraySum(numbers));
  }

  public static int maxSubArraySum(int[] numbers) {
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];
    prefix[0] = numbers[0];

    // calculate prefix array
    for (int i = 1; i < numbers.length; i++) {
      prefix[i] = prefix[i - 1] + numbers[i];
    }

    // calculate max subarray sum using prefix sums
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i; j < numbers.length; j++) {
        int currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
        if (maxSum < currentSum) {
          maxSum = currentSum;
        }
      }
    }

    return maxSum;
  }
}
