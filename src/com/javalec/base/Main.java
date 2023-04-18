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
		System.out.println("1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n5. 몫과 나머지\n6. 종료");
		act = scanner.nextInt();
		
		// 나 지금 되는거니??
		
	}

}
