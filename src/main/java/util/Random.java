package util;

public class Random {

    private static String chars = "abcdefg";

    public void randomCharacter() {
        for (int i = 0; i < 20; i++) {
            System.out.print(chars.charAt((int) (Math.random() * chars.length() - 1) + 1) + "");
        }
    }

}
