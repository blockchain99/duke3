package duke3;

import edu.duke.FileResource;

public class EyeBallDecrypt {
	public String encrypt(String input, int key){
		StringBuilder encrypted = new StringBuilder(input);
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabetL = "abcdefghijklmnopqrstuvwxyz";
		String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
		String shiftedAlphabetL = alphabetL.substring(key) + alphabetL.substring(0, key);
		// for each "I AM" char in StringBuilder 
		for(int i =0 ; i < encrypted.length();i++){
			//look at the i-th character of encryped (call it currChar)
			char currChar = encrypted.charAt(i);
			if(Character.isAlphabetic(currChar)){
				if(Character.isUpperCase(currChar)){
					//Find the index of currChar in the alphabet (call it idx)
					int idx = alphabet.indexOf(currChar);
					//If currChar is in the alphabet
					if(idx != -1){
						//Get the idx-th character of shiftedAlphabet (newChar)
						char newChar = shiftedAlphabet.charAt(idx);
				//		System.out.println("hi :i "+i+",newchar "+newChar);
						//Replace the i-th character of encrypted with newChar
						encrypted.setCharAt(i, newChar);
					}
				}
				// if currChar is lower case 
				else{
					//Find the index of currChar in the alphabet (call it idx)
					int idx = alphabetL.indexOf(currChar);
					//If currChar is in the alphabet
					if(idx != -1){
						//Get the idx-th character of shiftedAlphabet (newChar)
						char newChar = shiftedAlphabetL.charAt(idx);
					//	System.out.println("low :i "+i+",newchar1 "+newChar);
						//Replace the i-th character of encrypted with newChar
						encrypted.setCharAt(i, newChar);
					
				     }
		         }
		      }
	       } 
		return encrypted.toString();
	}
	
	public void eyeDecrypt(String encrypted){
	//	for(int k = 0 ; k < encrypted.length(); k++){  // run time error:String index out of range: -1
		for(int k = 0 ; k < 26; k++){
			String result = encrypt(encrypted, k);
				System.out.println(k+"\t"+result);
		}
	}
	// message6 : 
	public void testCaesar(){
		FileResource fr = new FileResource();
		String message = fr.asString();
		System.out.println(message);
		System.out.println("Eyeball decrypt as follows : ");
		eyeDecrypt(message);
	  
	}
}
