import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 0, res = 0, pow = 0, sum = 0;

        System.out.print("Enter ArmstrongNumber: ");
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        int originalNum = num;

        while (num > 0) {
            res = num % 10;
            num = num / 10;
            pow++;
            for(int i = 0; i<=pow; i++){
                sum += res * pow;
            }
        }

        num = originalNum;

        while(num>0){
            res = num % 10;

            sum += Math.pow(res, pow);
            
            num = num /10;
        }

        System.out.println(sum);

        if(originalNum == sum){
            System.out.println(originalNum + " is an armstrongnumber");
        }else{
            System.out.println(originalNum + " is not an armstrong number");
        }

        sc.close();

    }
}