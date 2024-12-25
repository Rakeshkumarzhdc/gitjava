public class palindrome {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false; // Return false if characters do not match
            }
        }
        return true; // Return true if it is a palindrome
    }

    public static void main(String[] args) {
        String str = "racecar";
        boolean result = isPalindrome(str);
        System.out.println(str + " is a palindrome: " + result);
    }
}
