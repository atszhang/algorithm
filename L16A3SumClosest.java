import java.util.Arrays;

public class L16A3SumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int sum = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int currSum = nums[i] + nums[low] + nums[high];
                if (currSum > target) {
                    high--;
                } else {
                    low++;
                }
                if (Math.abs(currSum - target) < Math.abs(sum - target)) {
                    sum = currSum;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));

    }
}
