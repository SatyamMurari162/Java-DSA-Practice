package Basic.Prb15_CheckAutomorphicNumber;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NUmber: ");
        int num = sc.nextInt();

        int sqaure = num * num;

        int n = num;
        int digit = 0;
        while(num > 0){
            num = num / 10;
            digit++;
        }

        int divisor = (int) Math.pow(10,digit);

        if(sqaure % divisor == n){
            System.out.println(n + " is a automorphic number");
        }else{
            System.out.println(n + " is not a automorphic number");
        }

        sc.close();
    }
}
