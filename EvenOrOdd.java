import java.util.Scanner;

public class EvenOrOdd {
    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        System.out.println(isEven(k));
    }

}
