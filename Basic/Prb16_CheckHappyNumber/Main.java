package Basic.Prb16_CheckHappyNumber;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();   

        boolean res = checkHappyNumber(num);
        System.out.println(res);

        sc.close();
    }

    public static boolean checkHappyNumber(int n){

        Set<Integer> set = new HashSet<Integer>();
        while (n != 1) {

            int sum = 0;
            int temp = n;
            
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp = temp / 10;
            }

            n = sum;
            if (set.contains(n)) {
                return  false;
            }
            set.add(sum);
        }
  
        return true;
    }
}
