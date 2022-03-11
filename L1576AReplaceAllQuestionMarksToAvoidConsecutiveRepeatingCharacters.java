public class L1576AReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharacters {
    public static String modifyingString(String s) {
        StringBuilder ans = new StringBuilder();
        char[] alphabet = "abcdefghijlkmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                for (int j = 0; j < alphabet.length; j++) {
                    if (i < s.length() - 1 && s.charAt(i + 1) == alphabet[j]) {
                        continue;
                    }
                    if (i > 0 && (s.charAt(i - 1) == alphabet[j]) || (ans.length() > 0 && alphabet[j] == ans.charAt(ans.length() - 1))) {
                        continue;
                    }
                    ans.append(alphabet[j]);
                    break;
                }
            } else {
                ans.append(s.charAt(i));
            }
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        String s = "?zs";
        System.out.println(modifyingString(s));
    }
}
