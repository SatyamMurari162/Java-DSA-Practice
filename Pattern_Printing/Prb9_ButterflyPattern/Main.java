package Pattern_Printing.Prb9_ButterflyPattern;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            //left star print
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int k = 1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            // right star
            for(int l = 1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int k = 1; k<=2*(n-i); k++){
                System.out.print(" ");
            }
            for(int l =1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();

        }

        sc.close();
    }
}
