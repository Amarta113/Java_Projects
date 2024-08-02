// Q1. Reversing Digits Write a method that takes an integer value and returns the number with its digits
// reversed. For example, given the number 7631, the method should return 1367. Prepare the method that reads
// a value from the user and displays the result.
import java.util.Scanner;

// class Method{
//     public void display(int num){
//         String numString = Integer.toString(num);
//         int num_size = Integer.indexOf(numString.length());

//         for (int i = 0; i <= num; i++){
//             for(int j = ; j >= 0; j--){
//             System.out.print(num);
//             }
//         }
//         System.out.println("The reverse order of is");
//     }
//}

public class practice {
    public static void main(String[] args) {
        System.out.println("Print numbers");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                num = num % 10;
                int digit = num;
                System.out.println(digit);
            }
            
        }
        // Method obj = new Method();
        // obj.display(num);

        

    }
}
