import java.util.Arrays;
import java.util.Comparator;

public class L14ALongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int size = 0;
        Arrays.asList(strs).sort(Comparator.comparingInt(String::length));
        loop:
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    break loop;
                }
            }
            size++;
        }
        if (size == 0) {
            return "";
        }
        return strs[0].substring(0, size);
    }
}
