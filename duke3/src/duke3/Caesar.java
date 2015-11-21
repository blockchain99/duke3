package duke3;

import edu.duke.*;

public class Caesar {
	// input = "I AM"; -> store to encrypted , type of StringBuider
	public String encrypt(String input, int key){
		StringBuilder encrypted = new StringBuilder(input);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
		// for each "I AM" char in StringBuilder 
		for(int i =0 ; i < encrypted.length();i++){
			//look at the i-th character of encryped (call it currChar)
			char currChar = encrypted.charAt(i);
			//Find the index of currChar in the alphabet (call it idx)
			int idx = alphabet.indexOf(currChar);
			//If currChar is in the alphabet
			if(idx != -1){
				//Get the idx-th character of shiftedAlphabet (newChar)
				char newChar = shiftedAlphabet.charAt(idx);
				//Replace the i-th character of encrypted with newChar
				encrypted.setCharAt(i, newChar);
			}
		}
		return encrypted.toString();
	}
	
	
	public String decrypt(String encrypted){
		Caesar cc = new Caesar();
		int[] freqs = countLetters(encrypted);
		int maxDex = maxIndex(freqs);
		int dkey = maxDex - 4;
		if(maxDex < 4) {
			dkey = 26 - (4-maxDex);
		}
		
		return cc.encrypt(encrypted, 26-dkey);
	}
	// String message ="this is" : k=0 , message.charAt(0) => 't'
	public int[] countLetters(String message){
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int[] counts = new int[26];
		for(int k = 0; k < message.length(); k++){
			//message.charAt(0)-> first char in string message("this is") -> 't' , which is assinged to ch
			char ch = Character.toLowerCase(message.charAt(k));
			// index of 't' in string( alpha="abc...z") is 20 -> dex
			int dex = alpha.indexOf(ch);
			if(dex != -1){
				counts[dex] +=1;  //now counts[20] = 1
			}
		}
		return counts;
	}
	
	public int maxIndex(int[] freqs){
		
		int maxN = 0;
		for(int k = 0; k < freqs.length; k++){
			if(freqs[k] > maxN){
				maxN = freqs[k];
			}	
		}
		return maxN;
	}
	
	public void testCaesar(){
		int key = 17;
		FileResource fr = new FileResource();
		String message = fr.asString();
		for(int i = 0 ; i < message.length() ; i++){
			char currC = message.charAt(i);
			if(Character.isAlphabetic(currC)){
				Character.toUpperCase(currC);
			}
		}
		String messageR = message.toUpperCase();
		System.out.println(messageR);
		String encrypted = encrypt(messageR, key);
		System.out.println(encrypted);
		String decrypted = encrypt(encrypted, 26-key);
		System.out.println(decrypted);
	  }
	}
	



