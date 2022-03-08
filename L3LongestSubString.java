import java.util.Arrays;

public class L3LongestSubString {

    public static int getLongestSubstr(String inputStr) {
        int length = 0;
        int left = -1;
        int[] charLocationMap = new int[256];
        Arrays.fill(charLocationMap, -1);
        for (int i = 0; i < inputStr.length(); i++) {
            left = Math.max(charLocationMap[inputStr.charAt(i)], left);
            length = Math.max(length, (i - left));
            charLocationMap[inputStr.charAt(i)] = i;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(getLongestSubstr("abcabc12abd"));
        System.out.println(getLongestSubstr("abcabc1"));
        System.out.println(getLongestSubstr("abcd1234ab"));

    }
}
