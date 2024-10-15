package word_games;
import java.util.Scanner;

public class WordGamesTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask for a word
        System.out.println("Word:");
        String word = input.nextLine();
        // Scramble it
        WordGames wordGames = new WordGames(word);
        // Print out scrambled word
        System.out.println(wordGames.scramble());

        // Ask for an index
        // Ask for random word
        System.out.println("Enter a random word: ");
        word = input.nextLine();
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String randomWord = input.nextLine();
        WordGames wordGames2 = new WordGames(word);
        wordGames2.bananaSplit(idx,randomWord);
        System.out.println(wordGames2.bananaSplit(idx,randomWord));


        // Add random word at index
        // Print out the word


        // Ask for a character (store as a String)
        System.out.println("Give a random character:");
        String charachara = input.nextLine();
        // Ask for random word
        System.out.println("Give another word (last one trust):");
        String randWord2 = input.nextLine();
        // Add random word at character
        wordGames.bananaSplit(charachara,randWord2);
        System.out.println(wordGames.bananaSplit(charachara,randWord2));
        // Print out the word
        System.out.println(wordGames.toString());
    }
}
