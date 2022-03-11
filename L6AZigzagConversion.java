import java.util.ArrayList;

public class L6AZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder ans = new StringBuilder();
        ArrayList<ArrayList<Character>> pattern = new ArrayList<>();
        int index = 0;
        while (index < s.length()) {
            pattern.add(new ArrayList<>());
            for (int i = 0; i < numRows && index < s.length(); i++) {
                if ((pattern.size() - 1) % (numRows - 1) == 0 || i == numRows - 1 - (pattern.size() - 1) % (numRows - 1)) {
                    pattern.get(pattern.size() - 1).add(s.charAt(index));
                    index++;
                } else {
                    pattern.get(pattern.size() - 1).add('<');
                }
            }
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < pattern.size(); j++) {
                if (i < pattern.get(j).size() && pattern.get(j).get(i) != '<') {
                    ans.append(pattern.get(j).get(i));
                }
            }
        }

        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        String s = "A";
        int numRows = 1;
        // PINALSIGYAHRPI
        System.out.println(convert(s, numRows));
    }
}
