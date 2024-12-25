public class Stringreversed {
    public static void main(String[] args) {
        String str = "rakeshkumar";
        System.out.println("Original string is :" +str);
        System.out.println("Reversed the string: ");
        for(int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");
    }
}
