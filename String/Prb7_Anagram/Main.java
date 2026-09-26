package String.Prb7_Anagram;

public class Main {
    public static void main(String[] args) {
        String str = "silent";
        String str1 = "listen"; 

        boolean result = CheckAnagram(str, str1);
        System.out.println(result);

    }
    public static boolean CheckAnagram(String str, String str1){
         if(str.length() != str1.length()){
            return false;
        }
        
        int[] freq = new int[26];
        for(int i = 0; i<str.length(); i++){
            freq[str.charAt(i) - 'a'] ++;
            freq[str1.charAt(i) - 'a'] --;
        }

        for(int c : freq){
            if(c!=0){
             return false;
            }
        }

        return true;

    }
}
