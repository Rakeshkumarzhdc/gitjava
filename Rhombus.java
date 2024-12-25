public class Rhombus {
  public static void main(String[] args) {
    int n = 5;
    // outer loop to handle number of rows
    for(int i = 1; i <= n; i++){
      // inner loop to print spaces
      for(int j = 1; j <= i; j++){
        System.out.print(" ");
      }
       // inner loop to print stars
      for(int j = 1; j <= n; j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
  
}
