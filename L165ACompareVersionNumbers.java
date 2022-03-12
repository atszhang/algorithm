public class L165ACompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < version1.length() || index2 < version2.length()) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb1.append(0);
            sb2.append(0);
            for (; index1 < version1.length(); index1++) {
                if (version1.charAt(index1) == '.') {
                    break;
                }
                sb1.append(version1.charAt(index1));
            }
            for (; index2 < version2.length(); index2++) {
                if (version2.charAt(index2) == '.') {
                    break;
                }
                sb2.append(version2.charAt(index2));
            }
            int num1 = Integer.valueOf(String.valueOf(sb1));
            int num2 = Integer.valueOf(String.valueOf(sb2));
            if (num1 < num2) {
                return -1;
            }
            if (num1 > num2) {
                return 1;
            }
            index1++;
            index2++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String version1 = "1.01";
        String version2 = "1.001";
        System.out.println(compareVersion(version1, version2));

    }
}
