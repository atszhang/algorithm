import java.util.HashMap;

public class L13ARomanToInteger {
    public static int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        HashMap<Character, Character> subtract1 = new HashMap<>();
        subtract1.put('I', 'V');
        subtract1.put('X', 'L');
        subtract1.put('C', 'D');
        HashMap<Character, Character> subtract2 = new HashMap<>();
        subtract2.put('I', 'X');
        subtract2.put('X', 'C');
        subtract2.put('C', 'M');
        for (int i = 0; i < s.length(); i++) {
            if (subtract1.containsKey(s.charAt(i))) {
                if (i < s.length() - 1 && (subtract1.get(s.charAt(i)) == s.charAt(i + 1) || subtract2.get(s.charAt(i)) == s.charAt(i + 1))) {
                    sum += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                    i++;
                    continue;
                }
            }
            sum += map.get(s.charAt(i));

        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }
}
