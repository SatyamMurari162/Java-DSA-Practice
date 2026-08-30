import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int digits = 0, sum = 0;
        while(num>0){
            int fac = 1;
            digits = num % 10;
            for(int i = 1; i<=digits; i++){
                fac *= i;
            }
            sum += fac;
            num = num / 10;
        }
        
        if(sum == originalNum){
            System.out.println(originalNum + " " + "is a strong number");
        }else{
            System.out.println(originalNum + " " + "is not a strong number");
        }

        sc.close();
    }
}
