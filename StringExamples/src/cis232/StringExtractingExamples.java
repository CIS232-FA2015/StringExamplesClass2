package cis232;

import java.util.Scanner;

public class StringExtractingExamples {

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String words = keyboard.nextLine();
		
		int upTo3 = words.length() > 3 ? 3 : words.length();
		String sub = words.substring(0, upTo3);
		System.out.println(sub);
		
		int spaceIndex = words.indexOf(' ');
		if(spaceIndex >= 0){
			System.out.println(words.substring(0, spaceIndex));
		}else{
			System.out.println(words);
		}
	}
}
