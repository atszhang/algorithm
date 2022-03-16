public class L70AClimbingStairs {
    public int climbStairs(int n) {
        int[] steps = new int[n + 1];
        // index refers to the stair number, the value refers to the number of ways to reach that step
        steps[0] = 1;
        for (int i = 0; i < n; i++) {
            if(i + 1 <= n){
                steps[i + 1] += steps[i];
            }
            if(i + 2 <= n){
                steps[i + 2] += steps[i];
            }

        }
        return steps[n];
    }
}
