package String.Prb3_Uppercase;

import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        for(int i = 0; i<ch.length; i++){
            
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                ch[i] = (char) (ch[i] - 32);
            }
        }

        String result = new String(ch);
        System.out.println(result);
        sc.close();
    }
}
