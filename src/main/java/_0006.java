/**
 * 6. Z 字形变换
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * <p>
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * <p>
 * 请你实现这个将字符串进行指定行数变换的函数：
 * <p>
 * string convert(string s, int numRows);
 * 示例 1:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 * <p>
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 * <p>
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 */
public class _0006 {

    /**
     * 按行输出，算法：
     * 首先访问 行0 中的所有字符，接着访问 行1，然后 行2，依此类推...
     * <p>
     * 对于所有整数 k，
     * <p>
     * 行 00 中的字符位于索引 k(2⋅numRows−2) 处;
     * 行 numRows−1 中的字符位于索引 k(2⋅numRows−2)+numRows−1 处;
     * 内部的 行i 中的字符位于索引 i(k+1)(2⋅numRows−2)−i 处;
     */
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; i + j < s.length(); j += cycleLen) {
                ret.append(s.charAt(i + j));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < s.length()) {
                    ret.append(s.charAt(j + cycleLen - i));
                }
            }
        }

        return ret.toString();
    }

//    // 按行排序
//    public String convert(String s, int numRows) {
//        if (numRows == 1) return s;
//
//        List<StringBuilder> rows = new ArrayList<>();
//        for (int i = 0; i < numRows; i++)
//            rows.add(new StringBuilder());
//
//        int currentRow = 0;
//        int direction = -1;
//        for (int i = 0; i < s.length(); i++, currentRow += direction) {
//            rows.get(currentRow).append(s.charAt(i));
//            if (currentRow == 0 || currentRow == numRows - 1) direction *= -1;
//        }
//
//        StringBuilder ret = new StringBuilder();
//        for (StringBuilder row : rows) ret.append(row);
//
//        return ret.toString();
//    }
}
