package String.Prb5_CountWords;

public class Count {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println(count);
    }
}
