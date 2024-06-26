package com.javaex.practice;

public class Ex05 {
	
	public static void main(String[] args) {
		
		int i = 1; //1로 변수 초기화
		boolean flag = true; //true로 변수 초기화
		
		while(flag) {
			flag = false; // 실행 했지만 false 값이 있어 종료
		}
		
		System.out.println(i); // i값이 1이 이므로 1 출력
		i=i+1;
	}

}
