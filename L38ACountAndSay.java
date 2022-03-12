public class L38ACountAndSay {
    public static String countAndSay(int n) {
        StringBuilder s = new StringBuilder();
        s.append('1');
        n--;
        for (int i = 0; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                int count = 0;
                for (; j < s.length() && s.charAt(j) == c; j++) {
                    if(s.charAt(j) == c) {
                        count++;
                    }
                }
                j--;
                temp.append(count);
                temp.append(c);
            }
            s = temp;
        }
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
}
