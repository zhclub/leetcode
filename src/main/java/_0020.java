import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class _0020 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> left = new HashSet<>(Arrays.asList('(', '{', '['));
        for (char c : s.toCharArray()) {
            if (left.contains(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (pop == '(' && c != ')' || pop == '[' && c != ']' || pop == '{' && c != '}') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
