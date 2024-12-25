public class SelectionSort {
  public static void PrintSectionSort(int arr[]){
    for(int i = 0; i < arr.length; i++){
      int minpos = i; 
      for(int j = i+1; j < arr.length; j++){
        if(arr[minpos]>arr[j]){
          minpos = j; 
        }
      }
      int temp = arr[minpos];
      arr[minpos] = arr[i];
      arr[i] = temp;
    }
  }
  public static void PrintArr(int arr[]){
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]+ " ");
    }
    System.out.println(" ");
  }
  public static void main(String[] args) {
    int arr[] = {1,5,8,3,2};
    PrintSectionSort(arr);
    PrintArr(arr);
  }
}
