package com.tistory.devhong;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int inputCnt = 0;
        Scanner scan = new Scanner(System.in);
        inputCnt = scan.nextInt();
        scan.nextLine();
        if(inputCnt>0){	//음수에 대한 방어코드
            int[] checkNumber = new int[inputCnt];
            for(int i=0;i<checkNumber.length;i++){
                int inputNumber = scan.nextInt();
                if(inputNumber<=0){
                	System.out.println("양의 정수만 입력하세요");
                	break;
                }
                checkNumber[i] = inputNumber;
            }
            long start = System.currentTimeMillis();
            isPrimeNumber(checkNumber);
            long end = System.currentTimeMillis();
            System.out.println("실행 시간 : " + (end-start) + "ms");
        }
    }
    
    public static void isPrimeNumber(int[] number){
        
        for(int i=0;i<number.length;i++){
        	boolean isPrime = false;
            if(number[i] ==2){
                isPrime = true;
            } else if(number[i] != 1){
                for(int j=2;j<=Math.sqrt(number[i]);j++){
                    if(number[i]%j==0){
                        isPrime = false;
                        break;
                    } else{
                        isPrime = true;
                    }
                }
            }
            if(isPrime){
                System.out.println("Prime");
            } else{
                System.out.println("Not prime");
            }
        }
    }
}
