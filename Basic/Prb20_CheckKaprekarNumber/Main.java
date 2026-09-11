package Basic.Prb20_CheckKaprekarNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int num = sc.nextInt();
        int n = num;

        int square = num * num;
        int count = 0;
        while(num > 0) {
            num = num / 10;
            count++;
        }

        int power = 1;
        while(count > 0){
            count--;
            power = power * 10;
        }

        int right = square % power;
        int left = square / power;

        if(right + left == n){
            System.out.println(n + " is a kaprekar number");
        }else{
            System.out.println(n + " is not a kaprekar number");
        }

        sc.close();
    }
}