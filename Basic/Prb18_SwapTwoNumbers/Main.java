package Basic.Prb18_SwapTwoNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number First: ");
        int a = sc.nextInt();

        System.out.print("Enter Number Second: ");
        int b = sc.nextInt();

        System.out.println("Befere Swap a: "+ a);
        System.out.println("Befere Swap b: "+ b);

        b = a + b;
        a = b - a ;
        b = b - a;

        System.out.println("After Swap a: "+ a);
        System.out.println("After Swap b: "+ b);

        sc.close();
    }
}
