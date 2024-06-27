package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int num = sc.nextInt();
		 
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i=1;i<=num;i++) {
			
			if(num%2==1&&i%2==1) {
				oddSum += i;
				}
			else if(num%2==0&i%2==0) {
				evenSum += i;
			}
			
		}
		
		if (oddSum>0) {
		System.out.println("결과값 : "+oddSum);
		}else if(evenSum>0) {
		System.out.println("결과값 : "+evenSum);	
		}
		
		sc.close();
	}
}
