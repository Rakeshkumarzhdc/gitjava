public class MaxSubArraySum {
  public static void printMaxSubArraySum(int numbers[]) {
    int maxsum = Integer.MIN_VALUE;  // Initialize max sum to a very small number
    int start = 0; // To track the starting index of the maximum subarray
    int end = 0;   // To track the ending index of the maximum subarray

    // Iterate over all possible subarrays
    for (int i = 0; i < numbers.length; i++) {
      int currsum = 0;  // Initialize the current sum for each subarray starting at index i
      for (int j = i; j < numbers.length; j++) {
        currsum += numbers[j];  // Add numbers[j] to the current sum
        
        // If the current sum is greater than the max sum found so far
        if (currsum > maxsum) {
          maxsum = currsum;  // Update maxsum
          start = i;         // Update the starting index
          end = j;           // Update the ending index
        }
        
        // Print the current subarray and its sum
        System.out.print("(");
        for (int k = i; k <= j; k++) {
          System.out.print(numbers[k] + " ");
        }
        System.out.print(") Sum = " + currsum + "\n");
      }
    }

    // Print the maximum subarray and its sum
    System.out.println("\nMax subarray sum = " + maxsum);
    System.out.print("Subarray with max sum: (");
    for (int k = start; k <= end; k++) {
      System.out.print(numbers[k] + " ");
    }
    System.out.println(")");
  }

  public static void main(String[] args) {
    int numbers[] = {2, 4, 6, 8, 10};
    printMaxSubArraySum(numbers);
  }
}
