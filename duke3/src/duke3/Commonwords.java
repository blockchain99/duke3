package duke3;

import edu.duke.*;
import org.apache.*;

//the : common[0]
//of  : common[1]
//and : common[2] ... common[19) -> common.length = 20
public class Commonwords {
	public String[] getCommon(){
	FileResource fr = new FileResource("c:\\data\\common\\common.txt");	
	String[] common = new String[20];
	int index = 0;
	   for(String s : fr.words()){
		common[index] = s;
		index +=1;
	   }
	return common;
	}
//check whether the k-th list[k] equals with input word, if so(found), return this k number;
// for each 20 common((the : common[0] ,of : common[1] ...common[19]), check if match with word in resource
// if match (ex list = the: common[0], word in resource = the), return 0 (k value)  
	public int indexOf(String[] list, String word){
		for(int k= 0; k < list.length ; k++){
			if(list[k].equals(word) ){
				return k;
			}
		}
		return -1; // we don't found
	}
	// for each word in each resource of caesar.txt plays[0], errors.txt plays[1] ... plays[5] : plays.length = 6, 
	// if match with common(("the" : common[0] ,of : common[1] ...common[19])<- by indexOf() with word "the" receive
	// index 0, which is not -1 , so add 1 to counts[0], so, count[0] is now 1, and so on...
	// common[k]'s frequency is counts[k]
	public void countWords(FileResource resource, String[] common, int[] counts){
		for(String word : resource.words()){
			word = word.toLowerCase();
			int index = indexOf(common, word);
			if(index != -1){
				counts[index] +=1;
			}
		}
	}
	// for each resource of caesar.txt plays[0], errors.txt plays[1] ... plays[5] : plays.length = 6, 
	// count the common(the : common[0] ,of : common[1] ...common[19])
	public void countShakespeare(){
		String[] plays = {"caesar.txt", "errors.txt", "hamlet.txt",
				"likeit.txt", "macbeth.txt", "romeo.txt" };
//		String[] plays = {"small.txt"};
		String[] common = getCommon();
		int[] counts = new int[common.length];
		for(int k=0; k < plays.length; k++){
			FileResource resource = new FileResource("c:\\data\\common\\"+plays[k]);
			countWords(resource, common, counts);
			System.out.println("done with " + plays[k]);
			
		}
		for(int k = 0; k < common.length; k++){
			System.out.println(common[k] + "\t"+ counts[k]);
			
		}
	}
	
}
