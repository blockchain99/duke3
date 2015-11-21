package duke3;

public class CharacterDemo {
	public void digitTest() {
		String array = "ABCabc0123456789';#!";
		for (int i = 0; i < array.length(); i++) {
			char ch = array.charAt(i);
			if(Character.isDigit(ch)){
				System.out.println(ch + "is Digit");
			}
			if(Character.isAlphabetic(ch)){
				System.out.println(ch + "is alphabetic");
			}
			if(ch == '#'){
				System.out.println(ch + " #hashtag");
			}
		}
	}
	public void conversioinTest(){
		String array= "ABCDEFabcdef123!#";
		for (int i = 0; i < array.length(); i++) {
			char ch = array.charAt(i);
			char uch = Character.toUpperCase(ch);
			char lch = Character.toLowerCase(ch);
			System.out.println(ch + " "+ uch + " " + lch);
		}
			
			
		}
	}

