/**
 * 41. 缺失的第一个正数
 * 给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 * <p>
 * 输入: [7,8,9,11,12]
 * 输出: 1
 */
@Deprecated
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            boolean flag = true;
            for (int num : nums) {
                if (i == num) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return i;
            }
        }

        return 0;
    }

}
