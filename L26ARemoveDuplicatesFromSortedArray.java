import java.util.ArrayList;

public class L26ARemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!array.contains(nums[i])) {
                array.add(nums[i]);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            nums[i] = array.get(i);
        }
        return array.size();
    }
}
