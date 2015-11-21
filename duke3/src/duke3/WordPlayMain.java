package duke3;

public class WordPlayMain {
	public void testReplaceVowels(){
		WordPlay wp = new WordPlay();
		String testSt = "this is test";
		String testSt1 = "You are Sunshine";
		char ch = '*';
		char ch1 = '#';
		String result = wp.replaceVowels(testSt1, ch1);
		System.out.println(result);
}
	public void testEmphasize(){
		WordPlay wp = new WordPlay();
		String testSt = "dna ctgaaactga";
		String testSt1= "Mary Bella Abracadabra";
		char ch = 'a';
		String result = wp.emphasize(testSt, ch);
		String result1 = wp.emphasize(testSt1, ch);
		System.out.println(result);
		System.out.println(result1);
	}
	public static void main(String[] args) {
		WordPlayMain wpm = new WordPlayMain();
		wpm.testReplaceVowels();
		wpm.testEmphasize();
//		int al = (int)'a';
//		int zl = (int)'z';
//		int au = (int)'A';
//		int zu = (int)'Z';
//		System.out.println("a" + al + " z"+zl+" au"+au+" zu"+zu);
//		System.out.println((int)'a'+","+(int)'e' + ","+(int)'i'+","+(int)'o'+","+(int)'u'+
//				","+(int)'A'+","+(int)'E'+","+(int)'I'+","+(int)'O'+","+(int)'U');
    }

}