public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int x = 1; // The first value in each row of Pascal's Triangle

            // Print the values in the current row
            for (int k = 0; k <= i; k++) {
                System.out.print(x + " ");
                // Calculate the next value using the formula for binomial coefficients
                x = x * (i - k) / (k + 1);
            }
            System.out.println(); // Move to the next line after finishing the row
        }
    }
}
