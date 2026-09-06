package Basic.Prb12_FindPrimeNumbers;

import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        if(N<=1){
            System.out.println(N + " is not Prime NUmbers");
        }

        boolean[] prime = new boolean[N + 1];

        for (int i = 2; i <= N; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= N; i++) {

            if (prime[i]) {

                for (int j = i * i; j <= N; j += i) {
                    prime[j] = false;
                }
            }
        }

        System.out.print("Prime Numbers: ");
        for (int i = 2; i <= N; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}