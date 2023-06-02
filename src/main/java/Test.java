/**
 *
 */
public class Test {

    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1 - count; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                for (int j = i + 1; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
            }
        }

        return nums.length - count;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int n = test.removeDuplicates(nums);
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }

}
