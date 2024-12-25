
public class RecusrionQue {

    private static int sumUpToN(int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public class SumOfNaturalNumbers {

        // Recursive method to find the sum of natural numbers up to n
        public static int sumUpToN(int n) {
            if (n == 0) { // Base case
                return 0;
            }
            return n + sumUpToN(n - 1); // Recursive step
        }
    }



// Recursive Java program to find mean of array 

    
    
    /* 

    // print the number form N to 1;
    public static int printDec(int n){
        if(n > 0){
            System.out.print(n+ " ");
            printDec(n-1);
        }
        return n;
    }


    // print the number from 1 to N;
    public static  int printNum(int n){
        if(n > 0){
            printNum(n-1);
            System.out.print(" " + n);
        }
        return n;
        

    }
        */
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     // Prompt the user for input
    //     System.out.print("Enter a positive integer n: ");
    //     int n = scanner.nextInt();

    //     if (n < 0) {
    //         System.out.println("Please enter a non-negative integer.");
    //     } else {
    //         // Calculate and display the sum
    //         int sum = sumUpToN(n);
    //         System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
    //     }

    //     scanner.close();
    // }
}
