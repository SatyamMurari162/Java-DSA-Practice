package Basic.Prb4_ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int rev = reverse(num);
        System.out.println(rev);

        sc.close();
    }

    public static int reverse(int n) {
        int rev = 0;

        while(n>0){
            int digits = n % 10;
            rev = rev * 10 + digits;
            n = n / 10;
        }
        return rev;
    }
}
