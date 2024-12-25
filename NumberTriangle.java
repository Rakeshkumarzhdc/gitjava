public class NumberTriangle {
  public static void main(String[] args) {
      int n = 5; // Number of rows for the triangle
      for (int i = 1; i <= n; i++) {  // Loop for each row
          // Print spaces for alignment
          for (int j = 1; j <= n - i; j++) {
              System.out.print(" ");  // Print spaces
          }
          // Print the numbers in the current row
          for (int j = 1; j <= i; j++) {
              System.out.print(i + " ");  // Print the number i
          }
          System.out.println();  // Move to the next line after each row
      }
  }
}
