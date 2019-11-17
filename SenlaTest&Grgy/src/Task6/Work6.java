package Task6;

public class Work6 {
    public static int pack(int weights[], int costs[], int need) {
        int n = weights.length;
        int pak[][] = new int[need + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= need; j++) {
                if (weights[i-1] <= j) {
                    pak[j][i] = Math.max(pak[j][i - 1], pak[j - weights[i-1]][i - 1] + costs[i-1]);
                } else {
                    pak[j][i] = pak[j][i - 1];
                }
            }
        }
        return pak[need][n];
    }
}
