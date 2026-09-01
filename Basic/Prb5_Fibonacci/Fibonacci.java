package Basic.Prb5_Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.err.println("Invalid Input");
        } else {
            int first = 0, next = 1, curr;
            for (int i = 0; i < n; i++) {
                curr = first + next;
                first = next;
                next = curr;
            }
            System.out.print("The" + " " + n + "th Fibonacci Number is: "+ first);
        }
        
        sc.close();
    }
}
