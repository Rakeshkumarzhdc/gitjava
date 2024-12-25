

 
public class Basic {
    private static boolean[] arr;

    public static void printDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Start from i + 1 to avoid self-comparison
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found: " + arr[i]);
                    break; // Exit the inner loop once a duplicate is found
                }
            }
        }
    }
     /* 
    
    
    
    
    public static boolean printAnagram(String s1, String s2) {
        // Convert strings to character arrays
        char[] CharArray1 = s1.toCharArray();
        char[] CharArray2 = s2.toCharArray();

        // Sort the character arrays
        Arrays.sort(CharArray1);
        Arrays.sort(CharArray2);

        // Compare the sorted arrays
        return Arrays.equals(CharArray1, CharArray2);
    }

    
    
    
    
   

    PROGRAM OF THE PRIME NUMBER 
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
     
    
    
    
    
    FABONNACI program



    public static int fibonacciFind(int n){
        int result = 0;
        if(n<=1){
            return n;
        }else{
            result = fibonacciFind(n-1)+fibonacciFind(n-2);
            
        }
        return result;
    }




   
    Factorial program


    public static int FactorialNum(int n){
        int result = 04;
        if(n==0||n==1){
            return 1;
        }else{
             result = n * FactorialNum(n-1);
           
        }
                return result;
    }
      
    public static boolean  printPalindrome(String str){
        int n = str.length();
        for(int i = 0; i < n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
     
     SECOND PROGRAM
    public static int printLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
          if(largest < arr[i]){
           largest = arr[i];
          }
        }
        return largest;
    }
    
    first program 
    public static void main(String[] args) {
        String str = "RAKESH KUMAR";
        System.out.println("Original String is: " +str);
        System.out.print("Reversed String is: ");
        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));;

        }
        System.out.println(" ");
    }
        

        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,6};
            int result = printLargest(arr);
            System.out.println("The largest number is " +result);
        }
            
            public static void main(String[] args) {
                String str ="racecar";
                boolean result = printPalindrome(str);
                System.out.println( str + "  " +result);
            }
               
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the number whose factorail you want to find out:");
                    int n = sc.nextInt();
                    int result = FactorialNum(n);
                    System.out.println("Factorial of the given number is enter by the user is :" +result);
                }
                    
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter the fibonacci number whose you want to display : ");
                        int n = sc.nextInt();
                        int result = fibonacciFind(n);
                        System.out.println("The result of the fibonacci number is " +result);
                    }
                         
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);

                            System.out.print("Enter a number to check if it's prime: ");
                            int number = scanner.nextInt();
                    
                            if (isPrime(number)) {
                                System.out.println(number + " is a prime number.");
                            } else {
                                System.out.println(number + " is not a prime number.");
                            }
                    
                            scanner.close();
                        }
                            

                            public static void main(String[] args) {
                                String str1 = "silent";
                                String str2 = "listen";
                                if(printAnagram(str1,str2)){
                                    System.out.println("true");
                                }else{
                                    System.out.println("false");
                                }
                            }
                               
                                
                                public static void main(String[] args) {
                                    int arr[] = {1,2,3,4,5,6,2,4,1,3};
                                    printDuplicates(arr);
                                }
                                     */
                                    
                                    public static void main(String[] args) {
                                        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
                                        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
                                        int c[][] = new int[3][3];
                                        for(int i = 0; i < 3; i++){
                                            for(int j = 0; j < 3; j++){
                                                c[i][j] = a[i][j]*b[i][j];
                                               // System.out.print(c[i][j] + " ");
                                            }
                                            
                                        }
                                        // Printing the original product matrix
        System.out.println("Product Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        int transpose[][] = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                transpose [j][i] = c[i][j];
            }

        }
        // printing transpose matrix
        System.out.println("\n Transpose matrix is :");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(" ");
        }
                                        
                                    }




                                    }
                                    

 
    