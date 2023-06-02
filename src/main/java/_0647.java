/**
 * 647. 回文子串
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 * <p>
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入："abc"
 * 输出：3
 * 解释：三个回文子串: "a", "b", "c"
 * 示例 2：
 * <p>
 * 输入："aaa"
 * 输出：6
 * 解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
 * <p>
 * <p>
 * 提示：
 * <p>
 * 输入的字符串长度不会超过 1000 。
 */
public class _0647 {

    public int countSubstrings(String s) {
        int count = 0;
        // 头部增加一个空字符，方便后续统一处理
        char[] chars = (" " + s).toCharArray();

        for (int i = 2; i < chars.length; i++) {
            // 偶数串
            if (chars[i] == chars[i - 1]) {
                count += countPalindromicLength(chars, i - 1, i);
            }
            // 奇数串
            if (chars[i] == chars[i - 2]) {
                count += countPalindromicLength(chars, i - 2, i);
            }
        }

        return count + s.length();
    }

    // 以L/R指针开始，分别向左右遍历，统计回文串的长度
    private int countPalindromicLength(char[] chars, int l, int r) {
        int count = 0;
        for (; l > 0 && r < chars.length && chars[l] == chars[r]; l--, r++, count++) ;
        return count;
    }
}
