public class _0198 {
    public int rob(int[] nums) {
        // money 前三位为0
        int[] money = new int[nums.length + 3];

        for (int i = 0; i < nums.length; i++) {
            money[i + 3] = Math.max(money[i], money[i + 1]) + nums[i];
        }

        return Math.max(money[money.length - 1], money[money.length - 2]);
    }
}
