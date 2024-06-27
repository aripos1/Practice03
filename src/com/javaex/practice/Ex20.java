package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("   [숫자맞추기게임 시작]    ");
		System.out.println("======================");
		
		
		
		while(true) {
		System.out.print(">>");
		int num =sc.nextInt();
		if (num>29) {
			System.out.println("더 낮게");
		}else if(num<29) {
			System.out.println("더 높게");
		}else {
			System.out.println("맞았습니다.");
			System.out.print("게임을 종료하시겠습니까?(y/n) >>");
			String str = sc.next();
			
			if (str .equals(str="y")) {
				System.out.println("======================");
				System.out.println("   [숫자맞추기게임 종료]    ");
				System.out.println("======================");
				break;
			}else if (str .equals(str="n")) {
				System.out.println("======================");
				System.out.println("   [숫자맞추기게임 시작]    ");
				System.out.println("======================");
			}
			
			
//			switch(str) {
//				case "y":
//				System.out.println("======================");
//				System.out.println("   [숫자맞추기게임 종료]    ");
//				System.out.println("======================");
//				break;
//				default :
//				System.out.println("======================");
//				System.out.println("   [숫자맞추기게임 시작]    ");
//				System.out.println("======================");
//			}
			
	}
		
	}
}
}
