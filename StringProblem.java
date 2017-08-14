package com.apple;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringProblem {
	
	//Main function to run removeCharWithIteration() and removeCharWithStrMethod() methods
	/*public static void main(String args[]){
		System.out.println(removeCharWithIteration());
		System.out.println(removeCharWithStrMethod());
		
	}*/
	
	//TestNG test cases
	//For valid string and valid character present in the string (Iteration Method)
	@Test
	public void testRemoveCharWithStrMethod(){
		String givenString="Mississippi";
		char charToReplace='i';
		String stringToReplace=String.valueOf(charToReplace);
		
		String modifiedString=removeCharWithStrMethod(givenString,charToReplace);
		Assert.assertFalse(modifiedString.contains(stringToReplace));
	}
	
	//For valid string and valid character not present in the string (Iteration Method)
	@Test
	public void testRemoveCharWithStrMethodNegative(){
		String givenString="Mississippi";
		char charToReplace='z';
		String stringToReplace=String.valueOf(charToReplace);
		
		String modifiedString=removeCharWithStrMethod(givenString,charToReplace);
		Assert.assertFalse(modifiedString.contains(stringToReplace));
	}
	
	////For valid string and valid character present in the string (String Method)
	@Test
	public void testRemoveCharWithIteration(){
		String givenString="Mississippi";
		char charToReplace='i';
		String stringToReplace=String.valueOf(charToReplace);
		
		String temp=removeCharWithIteration(givenString, charToReplace);
		Assert.assertFalse(temp.toString().contains(stringToReplace));

		
	}
	
	//For valid string and valid character not present in the string (String Method)
	@Test
	public void testRemoveCharWithIterationNegative(){
		String givenString="Mississippi";
		char charToReplace='z';
		String stringToReplace=String.valueOf(charToReplace);
		
		String temp=removeCharWithIteration(givenString, charToReplace);
		Assert.assertFalse(temp.toString().contains(stringToReplace));

		
	}
	
	//Method to remove character from String iteratively (one by one)
	public static String removeCharWithIteration(String givenString, char charToReplace){
		
		//String givenString="Mississippi";
		//char charToReplace='i';
	   
	    StringBuilder modifiedString=new StringBuilder();
		
	    for(int i=0;i<givenString.length();i++){
			char temp=givenString.charAt(i);
			if(temp!=charToReplace){			
				modifiedString.append(temp);	
			}
		
		 }
		 return modifiedString.toString();
	}
	
	//Method to remove character from String using String method(in a line)
	public static String removeCharWithStrMethod(String givenString, char charToReplace){
		//String givenString="Mississippi";
		//char charToReplace='i';
		
		String modifiedString=givenString.replaceAll(Character.toString(charToReplace), "");
		
		return modifiedString;
	}

}
