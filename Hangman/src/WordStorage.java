import java.util.Random;

public class WordStorage {
    static Random rand = new Random();
    static String[] words = {"keeper", "wolf", "dungeon", "redeemer", "light"};

    public static String getWord() {
        return words[rand.nextInt(words.length-1)];
    }

    public static String curConstruct (String init){
        StringBuilder sb = new StringBuilder(init.length());

        for (int i = 0; i < init.length(); i++){
            sb.replace(i,i,"_");
        }

        return sb.toString();
    }
}
