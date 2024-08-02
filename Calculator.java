import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        divide(n, m);
        sc.close();
    }

    private static void divide(int n, int m) {
        if(m!=0){
        int result1 = n / m ;
        System.out.println(result1);

        int result2 = n % m;
        System.out.println(result2);
        }else{
            System.out.println("Invalid number");
        }
    }        
}
