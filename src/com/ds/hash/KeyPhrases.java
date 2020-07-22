package com.ds.hash;

import java.util.ArrayList;
import java.util.HashMap;

public class KeyPhrases {

	public static void main(String[] args) {
		String text = "Suppose we have a set cow, of English text brown documents and wish to rank which documentis most relevant to the query, the brown cow. A simple way to start out is by eliminating documents that do not contain all three words the brown, and cow, but this still leaves many documents.";
		
		ArrayList<String> wordsToExclude = new ArrayList<>();
		wordsToExclude.add("the"); 
		wordsToExclude.add("a");
		wordsToExclude.add("by");
		wordsToExclude.add("to");
		wordsToExclude.add("and");
		wordsToExclude.add("of");
		wordsToExclude.add("is");
		HashMap<String,Integer> wordFreq = new HashMap<>();
		Integer maxFrequency = 0;
		System.out.println(text);
		String[] textSp = text.split(" ");
		for(String word: textSp) {
							
			if(wordsToExclude.contains(word) || word.trim().length()==0) {
				continue;
			}
			
			if(word.endsWith(".") || word.endsWith(",")) {
				word = word.substring(0,word.length()-1);
			}
			
			String key = word.trim().toLowerCase();
			if(wordFreq.get(key)==null) {
				wordFreq.put(key,1);
			}else {
				int frequency = wordFreq.get(key)+1;
				wordFreq.put(key,frequency);
			}
			
			if(wordFreq.get(key)>maxFrequency) {
				maxFrequency = wordFreq.get(key);
			}
		}
		
		for(String key:wordFreq.keySet()) {
			if(wordFreq.get(key)==maxFrequency)
			System.out.println(key+":"+wordFreq.get(key));
		}			

}

	}


