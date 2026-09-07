package Basic.Prb1_CheckArmstrongNumber;
import java.util.Scanner;

class Armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter NUmber: ");
    int num = sc.nextInt();
    int originalNum = num;

    int pow = 0;
    while(num > 0){
      num = num / 10;
      pow++;
    }

    num = originalNum;
    int sum = 0;
    while (num != 0) {
      int digits = num % 10;
      sum+= (int) Math.pow(digits, pow);
      num = num / 10;
    }

    if(sum == originalNum){
      System.out.println(originalNum + " is an armstrong number");
    }else{
      System.out.println(originalNum + " is  not an armstrong number");
    }

    sc.close();
  }
}