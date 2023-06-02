/**
 * 564. 寻找最近的回文数
 * <p>
 * 给定一个整数 n ，你需要找到与它最近的回文数（不包括自身）。
 * <p>
 * “最近的”定义为两个整数差的绝对值最小。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "123"
 * 输出: "121"
 * 注意:
 * <p>
 * n 是由字符串表示的正整数，其长度不超过18。
 * 如果有多个结果，返回最小的那个。
 */
@Deprecated
class FindTheClosestPalindrome {
    public static void main(String[] args) {
        System.out.println(new FindTheClosestPalindrome().nearestPalindromic("42123"));
    }

    public String nearestPalindromic(String n) {
        // n = 3;
        int index = -1;
        char replaceValue = ' ';

        for (int i = 0, j = n.length() - 1; i <= j; i++, j--) {
            if (n.charAt(i) < n.charAt(j)) {
                return replace(n, j, n.charAt(i));
            } else if (n.charAt(i) > n.charAt(j)) {
                index = i;
                replaceValue = n.charAt(j);
            }
        }

        int mid = n.length() / 2;

        if (index != -1) {
            return replace(n, index, replaceValue);
        } else if (n.length() % 2 == 0) {
            String s = replace(n, n.length() / 2, getClosest(n.charAt(mid)));
            return replace(s, n.length() / 2 - 1, getClosest(n.charAt(mid)));
        } else {
            return replace(n, n.length() / 2, getClosest(n.charAt(mid)));
        }
    }

    private String replace(String s, int index, char c) {
        if (index == 0) {
            return c + s.substring(1);
        } else {
            return s.substring(0, index) + c + s.substring(index + 1);
        }
    }

    private char getClosest(char c) {
        if (c == '0') {
            return '1';
        } else {
            return (char) (c + 1);
        }
    }
}