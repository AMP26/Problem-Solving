package specialsubsequence;

public class Solution {

    public int specialSubsequence(String s) {
        int countA = 0, countPair = 0;

        for(int  i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A') { countA++; }
            else if(s.charAt(i ) == 'G') { countPair += countA; }
        }
        return countPair;
    }
}
