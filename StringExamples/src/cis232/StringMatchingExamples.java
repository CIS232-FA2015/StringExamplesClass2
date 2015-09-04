package cis232;

import java.util.Scanner;

public class StringMatchingExamples {

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String words = keyboard.nextLine();
		
		if(words.startsWith("These")){
			System.out.println("Starts with These!");
		}
		
		if(words.endsWith("!")){
			System.out.println("You should calm down.");
		}
		
		//Don't worry about regionMatches
		//If you figure out a good use for it, let me know.
		//Rapper class!
		if(words.regionMatches(2, "ese", 0, 3)){
			System.out.println("Something about ese?");
		}
		
		//Find the position of all "d"s
		System.out.println("All d indexes:");
		int index = words.lastIndexOf("add");
		while(index >= 0){
			System.out.println(index);
			index = words.lastIndexOf("add", --index);
		}
		
		
	}
}
