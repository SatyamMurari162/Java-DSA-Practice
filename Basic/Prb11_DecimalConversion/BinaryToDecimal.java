package Basic.Prb11_DecimalConversion;

import java.util.Scanner;

public class BinaryToDecimal{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        int binary = sc.nextInt();

        int power = 0;
        int decimal = 0;
        while(binary > 0){
            int digits = binary % 10;
            decimal = (int) (decimal + (digits * Math.pow(2, power)));
            binary = binary / 10;
            power++;
        }

        System.out.println("Decimal Number: "+decimal);
        sc.close();
    }
}