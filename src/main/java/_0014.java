/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class _0014 {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder ret = new StringBuilder();

        int length = strs[0].length();
        for (String str : strs) {
            length = Math.min(length, str.length());
        }

        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);

            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return ret.toString();
                }
            }

            ret.append(c);
        }

        return ret.toString();
    }

}
