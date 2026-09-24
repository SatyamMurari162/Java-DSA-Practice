package String.Prb1_ReverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        int i = 0, j = arr.length-1;
        while(i<=j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        String reverse = new String(arr);
        System.out.println("Reverse String: "+ reverse);

        sc.close();
    }
}
