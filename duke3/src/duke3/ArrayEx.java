package duke3;

import edu.duke.*;

public class ArrayEx {
//counters[k] : # occurrences of k-th letter (Z=25, A=0)
	// as for input String s, compute the frequency of each alphabet in s,
	public void textFingerPrint(String s){
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int[] counters = new int[26];  //initialize to 0
		// for each character in input string
		for(int k=0; k < s.length(); k++){
			//s.charAt(0) -> ch = 'a'
			char ch = s.charAt(k);
			// as for character ch in input string, find the same character's index in alphabet. 
			// Suppose index =0; so, 'a' 's index
			int index = alpha.indexOf(Character.toLowerCase(ch)); // make easy to transform each character to lower case
			if(index != -1){
				//counters[0] -> 'a' 's frequency, now 1 ... then k
				counters[index] += 1;
			}
		}
		for(int k=0; k < counters.length; k++){
			System.out.println(alpha.charAt(k)+"\t"+counters[k]);
		}
		
	}
	public void test(){
		FileResource fr = new FileResource();
		String str = fr.asString();
		textFingerPrint(str);
	}
}
