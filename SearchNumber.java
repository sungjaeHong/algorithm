package com.tistory.devhong;

import java.util.Scanner;

public class SearchNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numberArray = new int[100000];
		int inputValue;
		setArray(numberArray);
		System.out.println("1~10000 찾는 값을 입력하세요");
		inputValue = scan.nextInt();
		if(inputValue<0 || inputValue>100000){
			System.out.println("잘못입력하셨습니다.");
		} else{
			long start = System.currentTimeMillis();
			System.out.println("찾는 값은 "+findArray(numberArray, inputValue)+"번째에 있습니다.");
			long end = System.currentTimeMillis();
            System.out.println("실행 시간 : " + (end-start) + "ms");
		}
		
	}

	public static void setArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			arr[i] = i+1;
		}
	}
	
	public static int findArray(int[] arr, int value){
		int min = 0;
		int max = 100000;
		int index = (max+min)/2;
		while(min<max){
			if(arr[index] == value){
				return index;
			}else if(arr[index] < value){
				min = index;
			}else{
				max = index;
			}
			index = (min + max) / 2;
			System.out.println("min : " + min + ", index : " + index + ", max : " + max);
		}
		return -1;
	}
}
