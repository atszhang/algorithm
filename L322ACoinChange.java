public class L322ACoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] coinsNeeded = new int[amount + 1];
        // index refers to amount, value refers to min coins needed
        // initialized with -1
        for (int i = 0; i <= amount; i++) {
            coinsNeeded[i] = -1;
        }
        coinsNeeded[0] = 0;
        for (int i = 0; i <= amount; i++) {
            if (coinsNeeded[i] != -1) {
                for (int j = 0; j < coins.length; j++) {
                    if (coins[j] > amount) {
                        continue;
                    }
                    if (i + coins[j] <= amount) {
                        if (coinsNeeded[i + coins[j]] == -1) {
                            coinsNeeded[i + coins[j]] = coinsNeeded[i] + 1;
                        } else {
                            coinsNeeded[i + coins[j]] = Math.min(coinsNeeded[i + coins[j]], coinsNeeded[i] + 1);
                        }
                    }
                }
            }
        }
        return coinsNeeded[amount];
    }
}
