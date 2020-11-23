package solution;

/**
 * 5. 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
class LongestPalindromicSubstring {

    private int[] range;

    String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        range = new int[2];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            expandAroundCenter(chars, i, i);
            expandAroundCenter(chars, i, i + 1);
        }

        return s.substring(range[0], range[1]);
    }

    private void expandAroundCenter(char[] s, int begin, int end) {
        while (begin >= 0 && end < s.length && s[begin] == s[end]) {
            begin--;
            end++;
        }

        if (end - begin - 1 > range[1] - range[0]) {
            range[0] = begin + 1;
            range[1] = end;
        }
    }
}
