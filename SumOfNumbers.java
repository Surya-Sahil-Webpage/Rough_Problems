import java.util.Scanner;

public class SumOfNumbers {
    // public static int totalSum(int n){
    //     return n*(n + 1)/2;
    // }

    public static int recurssionTotalSum(int n){
        if (n == 1){
            return 1;
        } else {
            return n + recurssionTotalSum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // System.out.println(totalSum(n));
        System.out.println(recurssionTotalSum(n));

        sc.close();
    }
}
