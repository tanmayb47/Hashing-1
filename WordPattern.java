
import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");

        if (pattern.length() != strArray.length)
            return false;

        HashMap<Character, String> pmap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = strArray[i];

            if (pmap.containsKey(c)) {
                if (!pmap.get(c).equals(str)) {
                    return false;
                }
            } else {
                pmap.put(c, str);
            }

            if (smap.containsKey(str)) {
                if (smap.get(str) != c) {
                    return false;
                }
            } else {
                smap.put(str, c);
            }
        }

        return true;
    }
}
