package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Operations;

public class Main {

	public static void main(String[] args) {
		/*
		 - 문제 풀이는 Constructor로 함.
		 
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		int firstNum = 0;
		int secondNum = 0;
		int act = 0;
		boolean loop = true;
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		firstNum = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		secondNum = scanner.nextInt();
		
		System.out.println("*** 원하는 결과를 선택하세요 ***");
		System.out.println("1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n5. 몫과 나머지\n6. 종료");
		act = scanner.nextInt();
		
		// 각 case에서 기능 메소드를 불러서 구현되게 제작.
		Operations operations = new Operations(firstNum, secondNum);
		
		
		while(loop == true) {
			switch(act){
				case 1:
				
				case 2:
					
				case 3:
					
				case 4:
					
				case 5:
					
				case 6:
					System.out.println(">>> Thank You <<<");
					loop = false;
					return;
			}
		}
		
		
	}

}
