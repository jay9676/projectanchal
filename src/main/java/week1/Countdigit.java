package week1;

public class Countdigit {
    static int countDigit(int n) {
        // Base case
        if (n == 0)
            return 1;

        int count = 0;

        // Iterate till n has digits remaining
        while (n != 0) {

            // Remove rightmost digit
            n = n / 10;

            // Increment digit count by 1
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 58964;
        System.out.println( countDigit(n));
    }
}
