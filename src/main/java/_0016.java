import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2)。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 */
public class _0016 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int diff = Integer.MAX_VALUE;
        int ret = 0;

        for (int i = 0, j = nums.length - 1; i < j - 1; ) {
            for (int k = i + 1; k < j; k++) {
                int sum = nums[i] + nums[j] + nums[k];
                int diffTemp = Math.abs(sum - target);
                if (diffTemp == 0) {
                    return sum;
                } else if (diffTemp < diff) {
                    diff = Math.abs(sum - target);
                    ret = sum;
                }
            }

            if (ret > target) {
                j--;
            } else {
                i++;
            }
        }

        return ret;
    }

}
