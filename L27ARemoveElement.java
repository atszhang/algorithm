public class L27ARemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] arr = nums.clone();
        int index = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (; index < arr.length; index++) {
                if (arr[index] != val) {
                    nums[i] = arr[index];
                    index++;
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}
