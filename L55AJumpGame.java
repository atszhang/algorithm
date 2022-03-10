public class L55AJumpGame {
    public static boolean canJump(int[] nums){
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 0; i < dp.length; i++) {   
            if(dp[i]){
                for (int j = 0; j <= nums[i] && j < dp.length - i; j++) {
                    dp[i + j] = true;
                }
            }
        }
        
        return dp[nums.length - 1];
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
    }
}
