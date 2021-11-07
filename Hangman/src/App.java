import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String key = WordStorage.getWord();
        Scanner reader = new Scanner(System.in);
        System.out.println("Please set the possible number of mistakes:");
        int tries = reader.nextInt();
        reader.nextLine();
        System.out.println("I guessed a word!");
        char curGuess;
        char[] display = WordStorage.curConstruct(key).toCharArray();
        System.out.println(display);




        while(Checker.winCheck(display, key) && Checker.counter <= tries){
            System.out.println("Current number of mistakes: " + Checker.counter + " out of " + tries);
            System.out.println("Print a Letter to guess:");
            curGuess = reader.next().charAt(0);
            display  = Checker.Check(display, key, curGuess);


            System.out.println(display);


        }
        if (!Checker.winCheck(display, key)) System.out.println("You won!");
        if (Checker.winCheck(display, key)) System.out.println("You failed!");

    }
}
