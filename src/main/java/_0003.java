import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长字串
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class _0003 {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();

        // first是当前子串首元素的下标
        for (int i = 0, first = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                first = Math.max(first, map.get(s.charAt(i)) + 1);
            }

            maxLength = Math.max(i - first + 1, maxLength);
            map.put(s.charAt(i), i);
        }

        return maxLength;
    }

}
