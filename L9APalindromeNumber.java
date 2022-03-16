public class L9APalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int n = s.length() / 2;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
