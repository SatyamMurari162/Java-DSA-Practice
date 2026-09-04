package Basic.Prb8_FindGCDandLCM;

import java.util.Scanner;

public class FindGCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        int originalNum1 = num1;
        int originalNum2 = num2;
        int remainder = 0;
        while(num2 != 0){
            remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        long lcm = ((long) originalNum1 * originalNum2) / num1;

        System.out.println("GCD="+ num1);
        System.out.println("LCM="+ lcm);
        
        sc.close();
    }
}
