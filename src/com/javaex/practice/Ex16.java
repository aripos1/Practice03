package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		int sum = 0;
		int p = 0;	
				
		for(int i=1; i<=num; i++) {
			
			if(i%5==0) {
				p = i/5;	
				sum = sum+i;
			}
			
		}
		System.out.println("5의배수의 합 : "+ p);
		System.out.println("5의배수의 합 : "+sum);
		sc.close();
	}
}
