public class _0213 {
    public int rob(int[] nums) {
        if (nums.length <= 1) {
            return nums[0];
        }

        // 将a[1]设为0，确保会选到a[0],并且放弃最后一间房子
        int a1 = nums[1];
        nums[1] = 0;
        int max = max(nums, nums.length - 1);

        // 将a[0]设为0，确保不会选到a[0]
        nums[0] = 0;
        nums[1] = a1;
        int max2 = max(nums, nums.length);

        return Math.max(max, max2);
    }

    private int max(int[] nums, int end) {
        // money 前三位为0
        int[] money = new int[nums.length + 3];

        for (int i = 0; i < nums.length; i++) {
            money[i + 3] = Math.max(money[i], money[i + 1]) + nums[i];
        }
        return Math.max(money[end + 1], money[end + 2]);
    }
}
