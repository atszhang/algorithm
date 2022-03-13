import java.util.Arrays;

public class L45AJumpGameII {
    public static int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] != -1) {
                for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
                    if (dp[i + j] == -1) {
                        dp[i + j] = dp[i] + 1;
                    } else {
                        dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                    }
                }
            }
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }
}
