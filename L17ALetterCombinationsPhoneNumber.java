import java.util.ArrayList;
import java.util.List;

public class L17ALetterCombinationsPhoneNumber {
    static List<String> combos = new ArrayList<>();
    static String alphabet;

    public static List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return combos;
        }
        alphabet = "abcdefghijklmnopqrstuvwxyz";
        recurse(new ArrayList<>(), digits);
        return combos;
    }

    public static void recurse(ArrayList<Integer> whichLetter, String digits) {
        if (whichLetter.size() == digits.length()) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < whichLetter.size(); i++) {
                int num = Integer.parseInt(String.valueOf(digits.charAt(i)));
                char c = alphabet.charAt((num - 2) * 3 + whichLetter.get(i));
                s.append(c);
            }
            combos.add(String.valueOf(s));
            return;
        }
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> array = (ArrayList<Integer>) whichLetter.clone();
            array.add(i);
            recurse(array, digits);
        }
        return;
    }

    public static void main(String[] args) {
        String digits = "";
        System.out.println(letterCombinations(digits));
    }
}
