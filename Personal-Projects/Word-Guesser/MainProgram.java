import java.util.*;
public class MainProgram {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to word guesser! Please enter your username below.");
        String username = scnr.next();
        System.out.println("Welcome, " + username + "! What level would you like to play at (Easy, Medium, or Hard).");
        String difficulty = scnr.next();
        switch(difficulty){
            case "easy":
            case "Easy":
                System.out.println("Easy difficulty chosen");
                EasyGame game1 = new EasyGame();
                game1.main(username);
                break;
            case "medium":
            case "Medium":
                System.out.println("Medium difficulty chosen");
                MediumGame game2 = new MediumGame();
                game2.main(username);
                break;
            case "hard":
            case "Hard":
                System.out.println("Hard difficulty chosen");
                HardGame game3 = new HardGame();
                game3.main(username);
                break;
            default:
                System.out.println("Invalid option chosen, please try again.");
        }

    }
}
