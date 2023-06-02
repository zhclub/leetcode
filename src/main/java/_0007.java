/**
 * 7. 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class _0007 {

    public int reverse(int x) {

        int next, ret = 0;
        for (int k = 1; x != 0; k *= 10, x = x / 10, ret = next) {
            next = ret * 10 + x % 10;
            if (ret != 0 && next / ret < 10) {
                return 0;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new _0007().reverse(-123));
    }
}