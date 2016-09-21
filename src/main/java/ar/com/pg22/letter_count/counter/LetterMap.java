package ar.com.pg22.letter_count.counter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LetterMap {
	
	private Map<String, Integer> map;
	
	public LetterMap(){
		this.map = new HashMap<>();
	}
	
	public Integer getCount(String key){
		return this.map.get(key);
	}
	
	public void addChar(char c){
		String key = String.valueOf(c);
		Integer previousCount = map.get(key);
		if (previousCount == null) {
			map.put(key, Integer.valueOf(1));
		} else {
			map.put(key, Integer.valueOf(previousCount + 1));
		}
	}
	
	public void addLetterMap(LetterMap current) {
		for (String key : current.map.keySet()) {
			Integer currentCount = current.map.get(key);
			Integer fullCount = this.map.get(key);
			if(fullCount==null || currentCount.compareTo(fullCount) > 0) {
				this.map.put(key, currentCount);
			}
		}
	}
	
	public List<String> getOrderedLetters() {
		List<String> list = new ArrayList<>();
		for (String key : this.map.keySet()) {
			String s = new String(key);
			list.add(s);
		}
		
		Collections.sort(list);
		return list;
	}
	
	public void print(){
		for (String s : getOrderedLetters()){
			Integer count = map.get(s);
			System.out.println(s + ": " + count);
		}
	}

}
