import java.util.Scanner;

public class Swap2Nums {
    public static void swaap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();

        swaap(a, b);

        sc.close();
    }
}
