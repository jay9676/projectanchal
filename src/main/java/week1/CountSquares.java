package week1;

public class CountSquares {
    static void countSquaresNonSquares(int n)
    {
        int sc = (int)(Math.floor(Math.sqrt(n)));
        System.out.println("Count of" +
                " squares " + sc);
        System.out.println("Count of" +
                " non-squares " +
                (n - sc) );
    }

    // Driver code
    public static void main(String args[])
    {
        int n = 10;
        countSquaresNonSquares(n);
    }
}
