import java.util.*;
public class MediumGame {
    public String[] words = new String[]{"agility", "ability", "driving", "backing", "evident", "exactly", "factory", "family", "concert", "contact", "dynamic", "exhibit", "gallery", "general", "hundred", "kingdom", "kitchen", "million", "optical", "quality", "radical", "silicon", "removal", "warning", "virtual", "wedding", "written", "version", "visible"};
    public String line = "_______";
    public int guesses = 13;
    public int q = 0;
    public char[] guessedWords = new char[13];
    public void main(String userName){
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        int len = words.length;
        int r = rand.nextInt(len);
        System.out.println("Good luck guessing this seven letter word, " + userName + "!");
        String word = words[r];
        // System.out.println("Your word is " + word);
        System.out.println(line);
        System.out.println("Please guess a letter to start.");

        boolean result = false;

        while(guesses > 0){
            String input = scnr.next();
            guesses--;
            char guess = input.charAt(0);
            run(word, guess, line);
            guessed(guessedWords, guess, q);
            q++;
            System.out.println("You have " + guesses + " remaining. Please enter the next letter you would like to guess below.");
            System.out.println("You have already guessed the following words: ");
            for(int i = 0; i < guessedWords.length; i++){
                System.out.print(guessedWords[i] + " ");
            }
            System.out.println("");
            if(line.equals(word)){
                result = true;
                break;
            }
        }
        if(result){
            System.out.println("You correctly guessed the word! You WIN!");
        }else{
            System.out.println("You did not guess the word, you LOSE!");
            System.out.println("You word was " + word);
        }
    }
    public void run(String word, char guess, String line){
        StringBuilder str = new StringBuilder(line);
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == guess) {
                str.setCharAt(i, guess);
            }
        }
        System.out.println(str);
        this.line = str.toString();
    }
    public void guessed(char[] x, char c, int count){
        x[count] = c;
    }
}
