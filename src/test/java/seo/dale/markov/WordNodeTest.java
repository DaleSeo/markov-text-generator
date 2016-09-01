package seo.dale.markov;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static junit.framework.TestCase.assertTrue;

/**
 * @author 서대영(DAEYOUNG SEO)/Onestore/SKP
 */
public class WordNodeTest {

	private static final String WORD = "Javascript";
	private static final List<String> NEXT_WORDS = Arrays.asList(
		"HTML", "CSS", "JSON", "jQuery", "React", "NodeJS", "AngularJS", "TypeScript"
	);

	private WordNode wordNode;

	@Before
	public void setUp() {
		wordNode = new WordNode(WORD);
		for (String nextWord : NEXT_WORDS) {
			wordNode.addNextWord(nextWord);
		}
	}

	@Test
	public void testGetRandomNextWord() {
		Random random = new Random(1);
		for (int i = 0; i < 10; i++) {
			String nextWord = wordNode.getRandomNextWord(random);
			assertTrue(NEXT_WORDS.contains(nextWord));
			System.out.println(nextWord);
		}
	}

}