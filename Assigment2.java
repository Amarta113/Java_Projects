// Q1. Reversing Digits Write a method that takes an integer value and returns the number with its digits
// reversed. For example, given the number 7631, the method should return 1367. Prepare the method that reads
// a value from the user and displays the result.

import java.util.Scanner;

class Method{
    //display method
    public void display(int num){
        int reverse_num = 0;
         while (num != 0) {
            int remainder = num % 10;
            reverse_num = reverse_num * 10 + remainder;
            num = num / 10;
        }
        //print reversed number
        System.out.println(reverse_num + "\n");
    }
}

public class Assigment2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the numbers: ");
        int num = sc.nextInt();

        //calling method
        Method obj = new Method();
        obj.display(num);

        sc.close();
    }
}

