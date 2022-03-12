public class L1694AReformatPhoneNumber {
    public static String reformatNumber(String number) {
        StringBuilder simplified = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c != ' ' && c != '-') {
                simplified.append(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < simplified.length(); i++) {
            if (i != 0 && i % 3 == 0) {
                ans.append('-');
            }
            if (simplified.length() - i == 4 && i % 3 != 2) {
                ans.append(simplified.charAt(simplified.length() - 4));
                ans.append(simplified.charAt(simplified.length() - 3));
                ans.append('-');
                ans.append(simplified.charAt(simplified.length() - 2));
                ans.append(simplified.charAt(simplified.length() - 1));
                break;
            }
            ans.append(simplified.charAt(i));
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        String number = "123 4-5678";
        System.out.println(reformatNumber(number));
    }
}
