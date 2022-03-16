public class L300ALongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] states = new int[nums.length];
        // index refers to sums index, value refers to # of increasing values before that index
        for (int i = 0; i < states.length; i++) {
            states[i] = 1;
        }

        for (int i = 0; i < states.length; i++) {
            for (int j = i; j < states.length; j++) {
                if (nums[j] > nums[i]) {
                    states[j] = Math.max(states[j], states[i] + 1);
                }
            }
        }
        int max = 1;
        for (int i = 0; i < states.length; i++) {
            max = Math.max(max, states[i]);
        }
        return max;
    }
}
