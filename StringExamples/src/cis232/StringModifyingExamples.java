package cis232;

public class StringModifyingExamples {

	public static void main(String[] args){
		//Concatenation
		String firstWord = "      The";
		String secondWord = "Class      ";
		String twoWords = firstWord.concat(" ").concat(secondWord);
		System.out.println(twoWords);
		
		//Replace
		System.out.println("Replace space with newline");
		twoWords = twoWords.replace(' ', '\n');
		System.out.println(twoWords);
		
		//Trim
		System.out.println("Trim the spaces");
		twoWords = twoWords.trim();
		System.out.println(twoWords);
		System.out.println("*****");
	}
}
