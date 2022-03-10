import java.util.ArrayList;
import java.util.List;

public class L139AWordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i <= s.length(); i++) {
            if (dp[i]) {
                for (int j = 0; j < wordDict.size(); j++) {
                    if(i + wordDict.get(j).length() <= s.length() && wordDict.get(j).equals(s.substring(i, i + wordDict.get(j).length()))){
                        dp[i + wordDict.get(j).length()] = true;
                    }
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak(s, wordDict));
    }
}
