package ar.com.pg22.letter_count;

import java.util.List;

import ar.com.pg22.letter_count.counter.LetterCounter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "We are about to count letters in names!" );
        
        LetterCounter letterCounter = new LetterCounter();
        letterCounter.addWord("Pabloo");
        letterCounter.addWord("Pablo");
        letterCounter.addWord("Victor");
        letterCounter.addWord("Eliana");
        letterCounter.addWord("Soledad");
        
        List<String> letters = letterCounter.getOrderedLetters();
        for (String letter : letters) {
        	System.out.println(letter + ": " + letterCounter.getLetterCount(letter));
        }
    }
}
