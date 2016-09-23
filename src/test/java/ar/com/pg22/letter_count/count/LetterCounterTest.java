package ar.com.pg22.letter_count.count;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import ar.com.pg22.letter_count.counter.LetterCounter;

public class LetterCounterTest {
	
	@Test
	public void testCocodrilo(){
		LetterCounter counter = new LetterCounter();
		counter.addWord("Cocodrilo");
		
		assertCount(counter, "c", 2);
		assertCount(counter, "o", 3);
		assertCount(counter, "d", 1);
		assertCount(counter, "r", 1);
		assertCount(counter, "i", 1);
		assertCount(counter, "l", 1);
		assertCount(counter, "a", 0);
	}
	
	@Test
	public void testCocodriloCaseSensitive(){
		LetterCounter counter = new LetterCounter();
		counter.setIgnoreCase(false);
		counter.addWord("Cocodrilo");
		
		assertCount(counter, "C", 1);
		assertCount(counter, "c", 1);
		assertCount(counter, "o", 3);
		assertCount(counter, "d", 1);
		assertCount(counter, "r", 1);
		assertCount(counter, "i", 1);
		assertCount(counter, "l", 1);
		assertCount(counter, "a", 0);
	}
	
	private static void assertCount(LetterCounter counter, String letter, int expectedCount){
		assertEquals("Count of letter " + letter, expectedCount, counter.getLetterCount(letter));
	}

}
