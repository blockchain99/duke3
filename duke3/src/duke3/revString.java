package duke3;
// String reverse by change string "inputS" to char[]
// using "inputS.toCharArray();"
public class revString {
public char[] rev(String inputS){
	char[] charArr = inputS.toCharArray();
	char[] newArr = new char[charArr.length];
	for (int j = 0; j < charArr.length; j++) {
			newArr[j] = charArr[charArr.length-1-j];
//		System.out.print(newArr[j]);
	}
	
//	String resultStr = charArr.toString();
//	System.out.println(resultStr);
//	return resultStr;
//	return null;
	//System.out.println();
	//System.out.println("char[] reversed  output : ");
	// not concate but actual calculate char add operation.
	//System.out.println("Result " + newArr); //print result is incorrect charter array.
	//System.out.println(newArr);  // correct output.
	return newArr;
	
}
//concatenate next char in front of appended string
//String  ret = charAt[i] + ret
public String revCharFor(String inputStr){
	String ret = "";
	for(int i = 0 ; i <inputStr.length() ; i++){
		ret = inputStr.charAt(i)+ret;
	}
	return ret;
}
public String revCharWhile(String inputStr){
	String ret = "";
	int i = 0;
	while(i < inputStr.length()){
		ret = inputStr.charAt(i) + ret;
		i++;
   }
	return ret;
}

public static void main(String[] args){
	revString rs = new revString();
	String inputS = "abcdefghijk";
	System.out.print("Original input string is : ");
	System.out.println(inputS);
	System.out.print("Result After rev() is : ");
	System.out.println(rs.rev(inputS));
	System.out.println("After revCharAt() : ");
	System.out.println(rs.revCharFor(inputS));
   }
}
