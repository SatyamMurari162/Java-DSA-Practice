package String.Prb2_CountVowelsAndConsonants;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int vol = 0, con = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vol++;
                } else {
                    con++;
                }
            }
        }
        System.out.println("Vowels: " + vol);
        System.out.println("Consonents: " + con);

        sc.close();
    }
}
