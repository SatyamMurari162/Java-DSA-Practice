package String.Prb8_FindLongestSubstring;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "pwwkew";

        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }
            map.put(ch, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        System.out.println(map);
    }
}
