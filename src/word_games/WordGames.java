package word_games;
import java.util.Scanner;
/**
 * Name: Brandon Smith (put your name here)
 * Date: 10-10-24 (put date of last revision here)
 * Description: This is a collection of methods for a word game that
 * people can play
 */
public class WordGames
{
    Scanner input = new Scanner(System.in);

    private String word;

    public WordGames(String text)
    {
        word = text;
    }

    /**
     * Scrambles a word by switching the first and second half of the word.
     * @return the scrambled word
     */
    public String scramble()
    {
        // switch first half
        int scramCount = word.length();
        int halfCount = word.length() / 2;
        String scramH1 = word.substring(0, halfCount);
        // and second half
        String scramH2 = word.substring(halfCount, scramCount);
        return scramH2 +scramH1;

    }

    /**
     * Modifies a given string by inserting text at the specified index
     * @param insertIdx int index where the text will be inserted
     * @param insertText String text to be inserted
     * @return modified text
     */
    public String bananaSplit(int insertIdx, String insertText)
    {
        return word.substring(0,insertIdx) + insertText + word.substring(insertIdx);

    }

    /**
     * Modifies a given string by inserting text at the first occurrence of the
     * specified character
     * @param insertChar char character you want
     * @param insertText String
     * @return the modified text
     */
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        int indexVal = word.indexOf(insertChar);
        // occurence of the insertChar
        return word.substring(0,indexVal)+insertText + word.substring(indexVal);

    }

    @Override
    public String toString()
    {
        // Games[word]
        return "["+word+"]";

    }

}
