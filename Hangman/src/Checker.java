

public class Checker {
    public static int counter = 0;
    public static char[] Check(char[] current, String key, char guess) {
    boolean changed = false;


        for (int i = 0; i < key.length(); i++) {

            if (key.charAt(i) == guess) {
                current [i] = key.charAt(i);
                changed = true;
            }
        }
        if (!changed) {counter++;}
        return current;
    }

    public static boolean winCheck(char[] guess, String key) {

        for (int i = 0; i < key.length(); i++) {
            if (guess[i] != key.charAt(i)) {
                return true;}
        }

        return false;
    }
}
