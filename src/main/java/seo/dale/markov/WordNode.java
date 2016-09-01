package seo.dale.markov;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class WordNode {

	private String word;
	private List<String> nextWords;

	public WordNode(String word) {
		this.word = word;
		nextWords = new LinkedList<>();
	}

	public String getWord() {
		return word;
	}

	public void addNextWord(String nextWord) {
		nextWords.add(nextWord);
	}

	public String getRandomNextWord(Random generator) {
		int randomIndex = generator.nextInt(nextWords.size());
		return nextWords.get(randomIndex);
	}

	@Override
	public String toString() {
		String text = word + ": ";
		for (String word : nextWords) {
			text += word + "->";
		}
		return text;
	}

}
