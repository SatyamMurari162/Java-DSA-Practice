import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 0, res = 0, count = 0, sum = 0;

        System.out.print("Enter ArmstrongNumber: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int originalNum = num;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        num = originalNum;

        while(num>0){
            res = num % 10;
            sum += (int) Math.pow(res, count);
            num = num /10;
        }

        if(originalNum == sum){
            System.out.println(originalNum + " " + "is an armstrongnumber");
        }else{
            System.out.println(originalNum + " " + "is not an armstrong number");
        }

        sc.close();

    }
}