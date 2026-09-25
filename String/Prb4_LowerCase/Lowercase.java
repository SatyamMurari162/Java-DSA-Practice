package String.Prb4_LowerCase;

import java.util.Scanner;

public class Lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a upercase string: ");
        String str = sc.nextLine();

        if(str.isEmpty()){
            System.out.println("Invalid String");
        }else{
            
        StringBuilder sb = new StringBuilder(str.length());
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch +32);
            }
            sb.append(ch);
        }

        String result = new String(sb);
        System.out.println(result);
        }

        sc.close();
    }
}