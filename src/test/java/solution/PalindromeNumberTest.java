package solution;

import org.junit.jupiter.api.Test;
import solution.PalindromeNumber;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        assertTrue(palindromeNumber.isPalindrome(2));
        assertFalse(palindromeNumber.isPalindrome(-121));
        assertFalse(palindromeNumber.isPalindrome(10));
    }
}