package vowelsubstring;

public class Main {
    public static void main(String[] args) {
    String s = "ABEC";

    Solution sol = new Solution();
    int result = sol.vowelSubstring(s);

    System.out.println("No. of substrings that Starts with a Vowel: " + result);
    }
}
