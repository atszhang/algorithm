import java.util.HashSet;

public class L91ADecodeWays {
    static int numDecodings(String s) {
        HashSet<String> numbers = new HashSet<>();
        for (int i = 1; i <= 26; i++) {
            numbers.add(Integer.toString(i));
        }
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 0; i <= s.length(); i++) {
            if (i + 1 <= s.length() && numbers.contains(s.substring(i, i + 1))) {
                dp[i + 1] += dp[i];
            }
            if (i + 2 <= s.length() && numbers.contains(s.substring(i, i + 2))) {
                dp[i + 2] += dp[i];
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "06";
        System.out.println(numDecodings(s));
    }
}
