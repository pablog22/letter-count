package ar.com.pg22.letter_count.counter;

import java.util.List;

public class LetterCounter {
	
	private LetterMap letterMap;
	private boolean ignoreCase = true;
	
	public LetterCounter() {
		this.letterMap = new LetterMap();
	}
	
	public boolean isIgnoreCase() {
		return ignoreCase;
	}
	public void setIgnoreCase(boolean ignoreCase) {
		this.ignoreCase = ignoreCase;
	}
	
	public void addWord(String word) {
		LetterMap currentLetterMap = new LetterMap();
		char[] chars = (this.ignoreCase) ? word.toUpperCase().toCharArray() 
				: word.toCharArray();
		for (char c : chars) {
			currentLetterMap.addChar(c);
		}
		
		letterMap.addLetterMap(currentLetterMap);
	}
	
	public List<String> getOrderedLetters(){
		return letterMap.getOrderedLetters();
	}
	
	public int getLetterCount(String letter) {
		String key = (this.ignoreCase) ? letter.toUpperCase() : letter;
		Integer value = letterMap.getCount(key);
		if (value == null) {
			return 0;
		} else {
			return value.intValue();
		}
	}

}
