package Basic.Prb7_DigitalRoot;

import java.util.Scanner;

// Method 1 : Find Digital Root
// public class DigitalRoot {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number: ");
//         int num = sc.nextInt();

//         while (num >= 10) {
//             int sum = 0;
//             while (num > 0) {
//                 sum += num % 10;
//                 num = num / 10;
//             }
//             num = sum;
//         }

//         System.out.println("Digital Root: "+ num);

//         sc.close();
//     }
// }

//Method 2

public class DigitalRoot{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("Digital Root: "+ num);
        }else{
            int answer = 1 + (num-1) % 9;
            System.out.println("Digital Root: " + answer);
        }

        sc.close();
    }
}
