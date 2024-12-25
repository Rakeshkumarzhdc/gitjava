public class LeftRotateArray {
  public static void main(String[] args) {
    // Initialize the array
    int arr[] = new int[]{1, 2, 3, 4, 5, 6};
    // Determine the number of times the array should be rotated
    int n = 3;
    
    // Display original array
    System.out.println("Original array:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    
    // Rotate the given array by n times towards the left
    for (int i = 0; i < n; i++) {
      int first = arr[0];  // Store the first element
      // Shift all elements of the array to the left by one position
      for (int j = 0; j < arr.length - 1; j++) {
        arr[j] = arr[j + 1];
      }
      // Place the first element at the end
      arr[arr.length - 1] = first;
    }
    
    // Display resulting array after rotation
    System.out.println("\nArray after left rotation:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
