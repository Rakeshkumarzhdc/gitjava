

public class BinarySearch {
  public static int binarySearch(int[] numbers, int key) {
    int left = 0;  // Start index of the array
    int right = numbers.length - 1;  // End index of the array

    while (left <= right) {
        int mid = left + (right - left) / 2;  // Find the middle index

        // Check if key is present at mid
        if (numbers[mid] == key) {
            System.out.println("Key found at index: " + mid);  // Print when the key is found
            return mid;
        }

        // If key is greater, ignore the left half
        if (numbers[mid] < key) {
            left = mid + 1;
        }
        // If key is smaller, ignore the right half
        else {
            right = mid - 1;
        }
    }
  /* 

  public static int linearSearch(int[] numbers, int key) {
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == key) {
            System.out.println("Key found at index: " + i);  // Print when the key is found
            return i;  // Return the index where the key is found
        }
    }
    System.out.println("Key not found");  // Print when the key is not found
    return -1;  // Return -1 if the key is not found
}

  
  
  
  
  /*
  public static void printsubArray(int number[]){
    for(int i = 0; i < number.length; i++){
      int start = i;
      for(int j = 0; j < number.length; j++){
        int end = j;
      for(int k = start; k <= end; k++){
        System.out.print(number[k]+ " ");
      }
      System.out.print(" ");

      }
      System.out.print(" ");
    }
  }

  
  public static void printPairs(int number[]){
    for(int i = 0; i < number.length; i++){
      int curr = number[i];
      for(int j = i+1; j < number.length; j++){
        System.out.print("(" + curr + "," + number[j] + ")");
      }
      System.out.print(" ");

    }
  
  }

  
  
  public static int printSmallest(int number[]){
    int smallest = Integer.MAX_VALUE;
    for(int i = 0; i < number.length; i++){
      if(smallest > number[i]){
        smallest = number[i];
      }
    }
    return smallest;

  }


  
  public static int PrintLargrst(int number[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i < number.length; i++){
      if(largest < number[i]){
        largest = number[i];
      }
    } 
    return largest;
  }
  
  public static void ReverseArray(int number[]){
    int first = 0, last = number.length-1;
    while(first<last){
      int temp = number[last];
      number[last] = number[first];
      number[first] = temp;
      first++;
      last--;
       
    }
  }

    private static int key;
  public static int binarySearch(int numbers[], int key){
    int start = 0 , end = numbers.length-1;
    while(start<=end){
      int mid = (start+end)/2;
      if(numbers[mid]==key){
        return mid;
      }
      if(numbers[mid]<key){
        start = mid+1;
      }else{
        end = mid-1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int number[] = {2,4,6,8,10,12,14,16};
    int key = 10;
  System.out.println("found element is " +binarySearch(number, key));
}
  
  // Reverse the array 
  public static void main(String[] args) {
    int number[] = {1,2,3,4,5};
    ReverseArray(number);
    for(int i = 0; i < number.length; i++){
      System.out.println(number[i]+" ");
    } System.out.print(" ");
  }
    

    // To find the maximum element of the array
    public static void main(String[] args) {
      int number[] = {1,2,3,4,5,6};
      System.out.println("The largest number is : " + PrintLargrst(number));;
    }
  
  public static void main(String[] args) {
    int number[] = {1,2,3,4,5,6};
    System.out.println("The largest number is : " + printSmallest(number));;
  }
   
    public static void main(String[] args) {
      int number[] = {1,2,3,4,5,6};
      
      System.out.println("pairs of the array is : " );
      printPairs(number);

    }
       
      // print the sub Array
      public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        printsubArray(number);
      }
      

         // Main method to test the linear search
    public static void main(String[] args) {
      int[] numbers = {5, 2, 9, 12, 7};  // Array of numbers
      int key = 12;  // Key to search for

      // Call the linearSearch method and print the result
      int result = linearSearch(numbers, key);

      // You can optionally print the result in the main method too
      if (result == -1) {
          System.out.println("Key was not found in the array.");
      } else {
          System.out.println("Key was found at index: " + result);
      }
            
  }
      */

      // Binary Search 
      public static void main(String[] args) {
        int numbers[] = {4,5,7,9,12};
        int key = 9;
      }
}
}

