import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PrimeNumber {
    public static void main(String[] args) {
        int inputCnt = 0;
        Scanner scan = new Scanner(System.in);
        inputCnt = scan.nextInt();
        int[] checkNumber = new int[inputCnt];
        for(int i=0;i<checkNumber.length;i++){
            checkNumber[i] = scan.nextInt();
        }
        isPrimeNumber(checkNumber);
    }
    
    public static void isPrimeNumber(int[] number){
        boolean isPrime = true;
        for(int i=0;i<number.length;i++){
            if(number[i] == 1 || number[i] ==2){
                isPrime = true;
            } else{
                for(int j=2;j<number[i];j++){
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
