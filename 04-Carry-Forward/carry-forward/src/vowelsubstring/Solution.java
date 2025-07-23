package vowelsubstring;

public class Solution {

    public int vowelSubstring(String s) {
        int count = 0, n = s.length();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)) { count += (n - i); }
        }
        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';

    }
}

// Time Complexity: O(N)
// Space Complexity: O(1)