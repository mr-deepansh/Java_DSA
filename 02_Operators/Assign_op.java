/**
 * Assign_op
 */
public class Assign_op {

  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    // Basic assignment
    int result = a;
    System.out.println("result = " + result); // 10

    // Add and assign
    result += b;
    System.out.println("result += b: " + result); // 30

    // Subtract and assign
    result -= b;
    System.out.println("result -= b: " + result); // 10

    // Multiply and assign
    result *= b;
    System.out.println("result *= b: " + result); // 200

    // Divide and assign
    result /= b;
    System.out.println("result /= b: " + result); // 10

    // Modulus and assign
    result %= b;
    System.out.println("result %= b: " + result); // 10

    // Bitwise AND and assign
    result &= b;
    System.out.println("result &= b: " + result); // 0

    // Bitwise OR and assign
    result |= a;
    System.out.println("result |= a: " + result); // 10

    // Bitwise XOR and assign
    result ^= b;
    System.out.println("result ^= b: " + result); // 30

    // Left shift and assign
    result <<= 2;
    System.out.println("result <<= 2: " + result); // 120

    // Right shift and assign
    result >>= 2;
    System.out.println("result >>= 2: " + result); // 30

    // Unsigned right shift and assign
    result >>>= 2;
    System.out.println("result >>>= 2: " + result); // 7
  }
}