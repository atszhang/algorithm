public class L1306AJumpGameIII {

    static boolean[] dp;
    static boolean found = false;

    public static boolean canReach(int[] arr, int start) {
        dp = new boolean[arr.length];
        dp[start] = true;
        recurse(arr, start);
        return found;
    }

    public static void recurse(int[] arr, int index) {
        if (found) {
            return;
        }
        if (index - arr[index] >= 0 && !dp[index - arr[index]]) {
            if (arr[index - arr[index]] == 0) {
                found = true;
                return;
            }
            dp[index - arr[index]] = true;
            recurse(arr, index - arr[index]);
        }
        if (index + arr[index] < arr.length && !dp[index + arr[index]]) {
            if (arr[index + arr[index]] == 0) {
                found = true;
                return;
            }
            dp[index + arr[index]] = true;
            recurse(arr, index + arr[index]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,0,2,1,2};
        int start = 2;
        System.out.println(canReach(arr, start));
    }
}
