package Basic.Prb22_FindAllDivisors;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        Set <Integer> set = new TreeSet<Integer>();

        for(int i = 1; i<=num; i++){
            if(num % i == 0){
                set.add(i);
            }
        }

        System.out.println(set);

        sc.close();
    }
}
