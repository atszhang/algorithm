public class L1662ACheckIfTwoStringsAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            s1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            s2.append(word2[i]);
        }
        if (String.valueOf(s1).equals(String.valueOf(s2))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
