package com.tistory.devhong;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "test123";
		String str2 = "1te23st";
		
		System.out.println(anagram(str1, str2));

	}
	
	public static boolean anagram(String str1, String str2){
		if(str1.length() != str2.length())	return false;
		char[] charArr1 = new char[str1.length()];
		char[] charArr2 = new char[str2.length()];
		
		for(int i=0;i<str1.length();i++){
			charArr1[i] = str1.charAt(i);
			charArr2[i] = str2.charAt(i);
		}
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		if(Arrays.equals(charArr1, charArr2)){
			return true;
		}else{
			return false;
		}
	}

}
