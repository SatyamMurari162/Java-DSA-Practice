package Basic.Prb13_SumNaturalNumbers;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int result = sumNaturalNUmbers(num);

        System.out.println("Sum of firsrt " + num + " natural numbers are: " + result);
        
        sc.close();
    } 
    public static int sumNaturalNUmbers(int n){
        return n * (n+1)/2;
    }  
}