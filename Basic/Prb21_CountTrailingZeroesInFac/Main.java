package Basic.Prb21_CountTrailingZeroesInFac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int count = 0;
        int divisor = 5;

        while (n / divisor > 0) {
            count = count + n / divisor;
            divisor = divisor * 5;
        }

        System.out.println("Trailing zeroes = " + count);

        sc.close();
    }
}
