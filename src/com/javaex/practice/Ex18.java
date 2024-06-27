package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			for(int x = num; x>=i; x--) {
				System.out.print("*");
			}
				System.out.println("");
		}
		for (int i=2; i<=num; i++) {
			for(int y = 1; y<=i; y++) {
				System.out.print("*");
			}
				System.out.println("");
		}	
		sc.close();
		}
}


