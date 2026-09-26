package String.Prb6_RemoveDuplicate;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "programming";

        // Set <Character> set = new HashSet<>();
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!seen[ch]){
                // set.add(ch);
                sb.append(ch);
                seen[ch] = true;
            } 
        }
        System.out.println(sb.toString());
    }
}
