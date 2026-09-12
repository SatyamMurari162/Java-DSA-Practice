package Basic.Prb23_CheckCo_Prime;

import java.util.Scanner;

public class CheckCoPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int n = sc.nextInt();

        System.out.print("Enter Secod Number: ");
        int n1 = sc.nextInt();

        int gcd = 1;
        for(int i = 1; i<n && i<n1; i++){
            if(n % i == 0 && n1 % i == 0){
                gcd = i;
            }
        }

        if(gcd == 1){
            System.out.println(n + " and " +n1 + " are co-prime");
        }else{
            System.out.println(n + " and " + n1 + " are not co-prime");
        }

        sc.close();
    }
}
