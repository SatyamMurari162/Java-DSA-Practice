package Basic.Prb17_SumEvenAndOdd;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int evenSum = 0, oddSum = 0;
        for(int i = 1; i<=n; i++){
            if(i % 2 == 0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);

        sc.close();
    }
}