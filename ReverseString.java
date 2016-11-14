package com.tistory.devhong;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hong sung jae test!";
		
		StringBuilder sb = new StringBuilder(str1);
		System.out.println(sb.reverse());
		System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().reduce(0, (acc, e) -> acc + e));
		
	}
	
	public static void reverseString(char[] charArr, int index){
		System.out.print(charArr[index]);
		if(index>0) {
			reverseString(charArr, index-1);
		}
	}

}
