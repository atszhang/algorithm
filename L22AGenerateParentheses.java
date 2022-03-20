import java.util.ArrayList;
import java.util.List;

public class L22AGenerateParentheses {
    static ArrayList<String> ans = new ArrayList<>();
    static int length;

    public static List<String> generateParentheses(int n) {
        length = n * 2;
        recurse(1, 1, new StringBuilder("("));
        return ans;
    }

    public static void recurse(int numOpen, int sum, StringBuilder combo) {
        if (combo.length() == length) {
            if (sum == 0) {
                ans.add(String.valueOf(combo));
            }
            return;
        }
        if (numOpen < length / 2) {
            StringBuilder temp = new StringBuilder(combo);
            temp.append("(");
            recurse(numOpen + 1, sum + 1, temp);
        }
        if (sum > 0) {
            StringBuilder temp = new StringBuilder(combo);
            temp.append(")");
            recurse(numOpen - 1, sum - 1, temp);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParentheses(n));
    }
}
