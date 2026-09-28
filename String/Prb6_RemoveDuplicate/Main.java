package String.Prb6_RemoveDuplicate;

public class Main {
    public static void main(String[] args) {
        String str = "hello";

        // Set <Character> set = new HashSet<>();
        boolean[] seen = new boolean[128];
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
        System.out.println("Count of unique letters: " + sb.length());
    }
}
