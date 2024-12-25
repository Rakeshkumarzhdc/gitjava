public class DuplicateElementInArray {
  public static void findDuplicate(int arr[]){
    for(int i = 0; i < arr.length; i++){
      for(int j = i; j < arr.length; j++){
        if(arr[i]==arr[j]){
          System.out.println("Duplicate element found:" +arr[i]);
          break;
        }

      }
    }
  }
  public static void main(String[] args) {
    int arr[] = {4,5,6,7,5,6};
    findDuplicate(arr);
  }
}
