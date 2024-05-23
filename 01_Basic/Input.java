import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read a username
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        // Prompt for and read a boolean value
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = scanner.nextBoolean();

        // Prompt for and read a long value
        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();

        // Prompt for and read a short value
        System.out.print("Enter a short value: ");
        short shortValue = scanner.nextShort();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Print the entered values
        System.out.println("Your username is " + username);
        System.out.println("Boolean value: " + boolValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Short value: " + shortValue);
    }
}
