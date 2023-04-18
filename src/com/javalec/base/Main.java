package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int firstNum = 0;
		int secondNum = 0;
		int act = 0;
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		firstNum = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		secondNum = scanner.nextInt();
		
		System.out.println("*** 원하는 결과를 선택하세요 ***");
		act = scanner.nextInt();
		
		
	}

}
