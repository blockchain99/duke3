package duke3;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordPlayTest {

	@Test
	public void testIsVowel() {
		WordPlay wp = new WordPlay();
		assertEquals(true, wp.isVowel('a'));
		assertEquals(false, wp.isVowel('g'));
		assertEquals(false, wp.isVowel('k'));
		assertEquals(true, wp.isVowel('i'));
	}
	@Test
	public void testReplaceVowels(){
		WordPlay wp = new WordPlay();
		String testSt = "this is test";
		String testSt1 = "You are Sunshine";
		char ch = '*';
		char ch1 = '#';
	// seems not working!  assertEquals() 
		assertEquals("th*s *s t*st" , wp.replaceVowels(testSt, ch));
		assertEquals("Y## #r# S#nsh#n#", wp.replaceVowels(testSt1, ch1));
		}
    public void testEmphasize(){
    	WordPlay wp = new WordPlay();
		String testSt = "Mary Bella Abracadabra";
		char ch = 'a';
		assertEquals("M+ry Bell+ +br*c*d*br+", ch);
    }
}
