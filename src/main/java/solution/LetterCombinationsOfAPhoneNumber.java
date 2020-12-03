package solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *  示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LetterCombinationsOfAPhoneNumber {

    String[][] numbers = new String[][] {
            {},
            {},
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h","i"},
            {"j", "k", "l"},
            {"m", "n", "o"},
            {"p", "q", "r", "s"},
            {"t", "u", "v"},
            {"w", "x", "y", "z"},
    };

    public List<String> letterCombinations(String digits) {

        String[] next = next(digits, 0);

        return Arrays.stream(next).collect(Collectors.toList());
    }

    private String[] next(String digits, int layers) {
        int number = Character.getNumericValue(digits.charAt(layers));

        if (layers == digits.length() - 1) {
            return numbers[number];
        }

        String[] next = next(digits, layers + 1);

        String[] result = new String[next.length * numbers[number].length];

        int i = 0;
        for (String head : numbers[number]) {
            for (String s : next) {
                result[i++] = head + s;
            }
        }

        return result;
    }
}
