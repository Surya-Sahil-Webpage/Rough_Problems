import java.util.Scanner;

public class PrintTable {
    public static void tables(int n){
        for(int i = 1; i <= 10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        tables(n);
    }
}
