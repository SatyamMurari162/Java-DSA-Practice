package Basic.Prb14_CheckDisariumNumber;

import java.util.Scanner;

public class Disarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        
        int n = num;
        int  pow = 0;
        while(num > 0){
            num = num / 10;
            pow++; 
        }

        num = n;
        int total = 0;
        while(num > 0){
            int digit = num % 10;
            total += (int) Math.pow(digit,pow);
            num = num /10;
            pow--;
        }

        if(total == n){
            System.out.println(n + " is a disarium number");
        }else{
            System.out.println(n + " is not a disarium number");
        }

        sc.close();
    }
}
