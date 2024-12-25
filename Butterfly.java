public class Butterfly {
  public static void main(String[] args) {
      int n = 5;  // The size of the butterfly (number of rows in the upper part)
      
      // Upper part of the butterfly
      for (int i = 1; i <= n; i++) {
          // Left part: print stars
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }

          // Spaces in the middle
          int space = 2 * (n - i);  // Adjust the number of spaces
          for (int j = 1; j <= space; j++) {
              System.out.print(" ");
          }

          // Right part: print stars
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }

          // Move to the next line after completing a row
          System.out.println();
      }

      // Lower part of the butterfly
      for (int i = n; i >= 1; i--) {
          // Left part: print stars
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }

          // Spaces in the middle
          int space = 2 * (n - i);  // Adjust the number of spaces
          for (int j = 1; j <= space; j++) {
              System.out.print(" ");
          }

          // Right part: print stars
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }

          // Move to the next line after completing a row
          System.out.println();
      }
  }
}
