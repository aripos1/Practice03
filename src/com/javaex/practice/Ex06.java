package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int i = 1;
	
		for(i=1; i<101; i++) {
		
			if(i%5==0&&i%7==0) {
				System.out.println(i);
			}
		}
	}
}
