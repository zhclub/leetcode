package solution;

import java.util.*;

/**
 * 76. 最小覆盖子串
 * 给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字母的最小子串。
 *
 * 示例：
 *
 * 输入: S = "ADOBECODEBANC", T = "ABC"
 * 输出: "BANC"
 * 说明：
 *
 * 如果 S 中不存这样的子串，则返回空字符串 ""。
 * 如果 S 中存在这样的子串，我们保证它是唯一的答案。
 */
@Deprecated
public class MinimumWindowSubstring {
//
//    public static void main(String[] args) {
//        System.out.println(new solution.MinimumWindowSubstring().minWindow("aa", "aa"));
////        new solution.MinimumWindowSubstring().minWindow("ADOBECOCEDBOEBANC", "ABC");
//    }
//
//    public String minWindow(String s, String t) {
//        if (s.equals(t)) {
//            return s;
//        }
//
//        int count = t.length();
//        int begin = 0, end = s.length();
//
//        LinkedList<Integer> indexes = new LinkedList<>();
//
//        Map<Character, Node> map = new HashMap<>();
//        for (char c : t.toCharArray()) {
//            map.put(c, map.getOrDefault(c, new Node()).add());
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if (map.containsKey(c)) {
//                Node node = map.get(c);
//                if (node.index == -1) {
//                    node.index = i;
//                    node.add(-1);
//                    count--;
//                } else {
//                    map.put(c, i);
//                    indexes.remove(index);
//                }
//
//                indexes.add(i);
//
//                if (count == 0) {
//                    if ((end - begin) > (indexes.getLast() - indexes.getFirst())) {
//                        end = indexes.getLast();
//                        begin = indexes.getFirst();
//                    }
//                }
//            }
//        }
//
//        if (end == s.length()) {
//            return "";
//        }
//        return s.substring(begin, end + 1);
//    }
//
//    class Node {
//        int count;
//
//        int index = -1;
//
//        public Node add(int num) {
//            count += num;
//            return this;
//        }
//
//        public int getCount() {
//            return count;
//        }
//
//        public Node setCount(int count) {
//            this.count = count;
//            return this;
//        }
//
//        public int getIndex() {
//            return index;
//        }
//
//        public Node setIndex(int index) {
//            this.index = index;
//            return this;
//        }
//    }
}
