package Basic.Prb6_Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;

        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (rev == originalNum) {
            System.out.println(originalNum + " is a palindrome number");
        } else {
            System.out.println(originalNum + " is not a palindrome number");
        }

        sc.close();
    }
}
