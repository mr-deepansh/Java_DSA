public class If_Statement {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    // Simple if statement
    if (a > b) {
      System.out.println("a is greater than b");
    }

    // if-else statement
    if (a < b) {
      System.out.println("a is less than b");
    } else {
      System.out.println("a is not less than b");
    }

    // if-else if-else statement
    if (a > b) {
      System.out.println("a is greater than b");
    } else if (a == b) {
      System.out.println("a is equal to b");
    } else {
      System.out.println("a is less than b");
    }

    // Nested if statement
    if (a < b) {
      if (b > 15) {
        System.out.println("b is greater than 15");
      } else {
        System.out.println("b is not greater than 15");
      }
    }
    int age = 14;

    if (age >= 18) {
      System.out.println("You are eligible to vote");
    } else if (age > 13 && age < 18) {
      System.out.println("You are a teenager");
    } else {
      System.out.println("You are not eligible to vote");
    }

  }
}
