public class L35ASearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low != high) {
            if (nums[(low + high) / 2] > target) {
                high = (low + high) / 2;
            } else if (nums[(low + high) / 2] < target) {
                low = (low + high) / 2 + 1;
            } else {
                return (low + high) / 2;
            }
        }
        if (high == nums.length - 1 && target > nums[high]) {
            return high + 1;
        }
        return high;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
}
