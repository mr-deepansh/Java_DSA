/**
 * ReverseArr
 */
public class ReverseArr {

  public static void main(String[] args) {
    int[] arr = { 32, 42, 52, 62, 72, 82, 92, 102, 112, 122 };
    reverse(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Index " + i + ": " + arr[i] + "," + " ");
      // System.out.print(" " + arr[i]);
    }
    System.out.println();
  }

  public static void reverse(int arr[]) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
      int temp = arr[end];
      arr[end] = arr[start];
      arr[start] = temp;

      start++;
      end--;
    }
  }
}