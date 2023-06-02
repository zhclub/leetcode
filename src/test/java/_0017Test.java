import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class _0017Test {

    @Test
    void letterCombinations() {
        _0017 letter = new _0017();

        List<String> result = letter.letterCombinations("23");

        result.sort(Comparator.comparing(Function.identity()));

        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]",
                result.toString());
    }
}