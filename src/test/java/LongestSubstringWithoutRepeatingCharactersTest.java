import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters characters = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3, characters.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, characters.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, characters.lengthOfLongestSubstring("pwwkew"));
        assertEquals(4, characters.lengthOfLongestSubstring("abcbasa"));
    }
}