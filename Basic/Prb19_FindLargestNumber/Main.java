package Basic.Prb19_FindLargestNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number a: ");
        int a = sc.nextInt();
        System.out.print("Enter Number b: ");
        int b = sc.nextInt();
        System.out.print("Enter Number c: ");
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("a is largest number: " + a);
        }else if(b > a && b > c){
            System.out.println("b is largest number: " + b);
        }else{
            System.out.println("c is largest number: " + c);
        }

        sc.close();
    }
}
