
public class ArrayRotate {
    // Method 1: Left rotate arr[] of size N by D
    void LeftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            leftRotatebyOne(arr, n);
        }
    }

    // Method 2: Left rotate the array by one position
    void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }

    // Method 3: Print the array
    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");  // Print on the same line
        }
        System.out.println();  // Move to the next line after printing the array
    }

    // Main driver method
    public static void main(String[] args) {
        ArrayRotate rotate = new ArrayRotate();  // Create an object of ArrayRotate

        int arr[] = {1, 2, 3, 4, 5};
        
        // Calling method to rotate the array leftwards by 2 positions
        rotate.LeftRotate(arr, 2, arr.length);
        
        // Printing the array after rotation
        rotate.printArray(arr, arr.length);
    }
}
