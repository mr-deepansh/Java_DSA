public class kadanesAlo {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, -2, 5};
    int[] arr2 = {1, -2, 6, -1, 3};
    int[] arr3 = {-1, -2, -3, -4, -5};

    System.out.println("Max sum for arr1: " + arraySum(arr1));
    System.out.println("Max sum for arr2: " + arraySum(arr2));
    System.out.println("Max sum for arr2: " + arraySum(arr3));
  }

  public static int arraySum(int[] arr) {
    int maxSum = arr[0];
    int currentSum = arr[0];

    for (int i = 1; i < arr.length; i++) {
      currentSum = Math.max(arr[i], currentSum + arr[i]);
      maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;

  }
}