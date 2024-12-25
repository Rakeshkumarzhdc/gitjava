public class NewButterflyTriangle {
  public static void main(String[] args) {
    int n = 5;
    int star = 9; 
    for(int i = 1; i <= n; i++){
      for(int j = 1; j < i; j++){
        System.out.print(" ");
      }
      for(int j = 1; j <= star; j++){
        System.out.print("*");
      }
      System.out.println(" ");
      star -= 2;
    }
    
    for(int i = n-1; i >= 1; i--){
      for(int j = 1; j < i; j++){
        System.out.print(" ");
      }
      for(int j = 1; j <= star; j++){
        System.out.print("*");
      }
      System.out.println(" ");
      star += 2;
    }
  }
}
