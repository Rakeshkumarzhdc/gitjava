public class TrianglePattern {
  public static void main(String[] args) {
      int n = 5;
      for (int i = 1; i <n; i++) {
          // Print spaces
          for (int j = 1; j < i; j++) {
              System.out.print(" ");
          }
          // Print stars
          for (int j = i; j <= n; j++) {
              System.out.print("* ");
          }
          // Move to the next line
          System.out.println();
      }
  }
}
