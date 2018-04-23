class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int a = 0, b = 0, c;
        for (int i = 2; i <= cost.length; i++) {
            c = Math.min(a + cost[i - 2], b + cost[i - 1]);
            a = b;
            b = c;
        }
        return c;
    }
}