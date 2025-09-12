import java.util.*;

public class SumOfSquare {
    public static int totalSquare(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(totalSquare(n));

        sc.close();
    }
}