public class AllSorting {


    /* 
    SELECTION SORT PROGRAM
    
    public static void printSelectionSort(int arr[]) {
        // Loop through the array
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;  // Assume the current position is the minimum

            // Loop through the rest of the array to find the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {  // Change to '>' for ascending order
                    minpos = j;  // Update minpos if a smaller element is found
                }
            }

            // Swap the found minimum element with the current element
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array after sorting
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Selection sort result: " + arr[i]);
        }
        System.out.println();  // Empty line after printing the array
    }

    
    THE BUBBLE SORT PROGRAM IS DOWN ----->>
    public static void printBubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length-1; turn++){
            for(int j = 0; j < arr.length-1-turn; j++){
                if(arr[j] > j+1){
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;


                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length;i++){
            System.out.println("sorting array is : " +arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,5,6,3,4,1};
        printBubbleSort(arr);
        printArr(arr);
    }
        */
        public static void main(String[] args) {
            int arr[] = {2,5,6,3,4,1};
            printArr(arr);
           printSelectionSort(arr);
        }
}
