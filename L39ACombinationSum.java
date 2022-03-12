import java.util.ArrayList;
import java.util.List;

public class L39ACombinationSum {
    public static List<List<Integer>> combos = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        for (int i = 0; i < candidates.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(candidates[i]);
            recurse(i, candidates[i], target, temp, candidates);
        }
        return combos;
    }

    public static void recurse(int index, int sum, int target, ArrayList<Integer> currCombo, int[] candidates) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            combos.add(currCombo);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            ArrayList<Integer> temp = (ArrayList<Integer>) currCombo.clone();
            temp.add(candidates[i]);
            recurse(i, sum + candidates[i], target, temp, candidates);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        int target = 8;
        System.out.println(combinationSum(candidates, target));
    }
}
