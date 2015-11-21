package duke3;

public class CaesarCipher {
	
	char[] alpa = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static int ch_a = 'a';
	static int ch_z = 'z';
	static int ch_A = 'A';
	static int ch_Z = 'Z';
	static int ch_blank = ' ';
	//small character 
			public  void smalleChar(){
			String g = "li ne";
			String g4 = "rogramming can be fun so can cryptography however they should not be combined";
			char[] c_arr = g4.toCharArray(); 
			for(char a: c_arr){
				//check blank , which value is 32
			   if((int)a == 32) {
				   System.out.print((char)a);
			   }
			   else {
				 if((int)a - 3 >= 97){
					 System.out.print((char)((int)a - 3));
				 }
				 else{
					 System.out.print((char)(122-(2-((int)a -97))));
				 }
		       }
			}
			System.out.println();
			}
			
			//large character 
			public  void largeChar(){
			String g1 = "LI NE";
			String g = "FIRST LEGION ATTACK EAST FLANK";
			String g2 = "P";
			char[] c_arr = g.toCharArray(); 
			for(char a: c_arr){
			  if((int)a == 32){
				  System.out.print((char)a);
			  }
			  else {
				if((int)a - 3 >= 65){
					System.out.print((char)((int)a - 3));
				}
				else{
					System.out.print((char)(90-(2-((int)a-65))));
				}
		      }
			}
			System.out.println();
		  }
/*
 * Make a "rearranged" alpahbet	using str.subtring(key) + str.substring(0,k)	
 */
	public String rearrangeStr(String inputStr, int key){
		// Take two pieces(substring) from key (ex 23) position to end(XYZ)
		String encr = inputStr.substring(key);
//		String finalStr = encr + inputStr.substring(0,23);   //error
//		return finalStr;
		//Concatenate them together
		encr = encr + inputStr.substring(0,key);
		return encr;
	}
	
	public static String shift(String s) {
		 return s.charAt(s.length()-1)+s.substring(0, s.length()-1);
	}
	
	public static String printResult(String input){
//		String input = "Stackoverflow";
//		String input1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String finalInput = null;
				System.out.println(input);
	    for(int i = 0; i < 3; i++){
	       input = shift(input);
	       System.out.println(input);
	    }
	    finalInput = input;
	    System.out.println("FINAL : " + finalInput);
	    return finalInput;
	}
	public static void main(String[] args)throws java.lang.Exception{
		CaesarCipher cc = new CaesarCipher();
		System.out.print("print of (char)(\'a\'+23) : ");
		System.out.println((char)('a'+23));   // result is x
		System.out.print("print of \'F\' -3 : ");
		System.out.println('F'- 3 );  // result is 67
		System.out.println("char a number & b number ");
		System.out.println(ch_a);  //(int)'a' 97
		System.out.println(ch_z);  //(int) 'z' 122
		System.out.println("char A number & B number ");
		System.out.println(ch_A);   // (int) 'A' 65
		System.out.println(ch_Z);   // (int) 'Z' 90
		System.out.println((int)(' '));
		System.out.println(ch_blank); // (int)' ' is 32
//		smalleChar();
//		largeChar();
		cc.smalleChar();
		cc.largeChar();
		String input1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("After printResult() : ");
		cc.printResult(input1);
		System.out.println("Before & After rearrangeStr() : ");
		System.out.println(input1);
		// key is 23 "XYZ" should go to the front
		System.out.println(cc.rearrangeStr(input1,19));
		System.out.println("substring() Test : ");
		String str6= "01234567";
		String str5 = "alphabet";
		String sub5 = str5.substring(5);  // "bet" str1[5] ~ str1[7] : 3 elements
		sub5 = sub5 + str5.substring(0, 5);  //sub + str1[0] ~ str1[4] : 5 elements = 5-0
		System.out.println(sub5);
//		String str7 = "I AM";
//		String str7Result = cc.
		
	 }
	}

