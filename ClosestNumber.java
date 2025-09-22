import java.util.Scanner;

// Given two integers n and m (m != 0).
// Find the number closest to n and divisible by m.
// If there is more than one such number, output the one with maximum absolute value.

public class ClosestNumber {
    public static int closestNum(int n, int m) {
        // Find the quotient when n is divided by m
        int q = n / m;

        // First candidate: closest multiple below or equal to n
        int n1 = q * m;

        // Second candidate: closest multiple above n
        int n2;
        if (n * m > 0) {
            // If n and m are same sign
            n2 = (q + 1) * m;
        } else {
            // If n and m are opposite signs
            n2 = (q - 1) * m;
        }

        // Now check which is closer
        if (Math.abs(n - n1) < Math.abs(n - n2)) {
            return n1;
        } else if (Math.abs(n - n2) < Math.abs(n - n1)) {
            return n2;
        } else {
            // If both are equally close → return the one with max absolute value
            return (Math.abs(n1) > Math.abs(n2)) ? n1 : n2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print("m : ");
        int m = sc.nextInt();

        int result = closestNum(n, m);
        System.out.println("Closest divisible number: " + result);
    }
}
