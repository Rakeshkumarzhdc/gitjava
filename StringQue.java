

public class StringQue{
    // public static boolean printPalindrome(String str){
    //     int n = str.length();
    //     for(int i = 0; i <= n/2; i++){
    //         if(str.charAt(i)!=str.charAt(n-i-1)){
    //             return false;

    //         }

    //     }
    //     return true;
            
    // }
    public static void main(String[] args) {
        
        // String str = "rakesh Kumar";
        // System.out.println("Original String is : " +str);
        // System.out.print("Reversed String is :");
        // for(int i = str.length()-1; i >= 1; i--){
        //     System.out.print(str.charAt(i));
        // }
        // System.out.println(" ");

        // check String is palindrome or not 
        // take the input from the user 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string from the user : ");
        // String n = sc.nextLine();
        // System.out.println("your result is :" + printPalindrome(n));



        String str = "i love india";
        String FirstLetter = str.substring(0,1);
        String remaining = str.substring(1, str.length());
        FirstLetter = FirstLetter.toUpperCase();
        str = FirstLetter+remaining;
        System.out.println("str: " +str);


    }
}