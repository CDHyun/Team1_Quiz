package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Operations;

public class Main {

	public static void main(String[] args) {
		/*
		 - 문제 풀이는 Constructor로 함.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int firstNum = 0;				// 사용자가 입력하는 첫번째 숫자
		int secondNum = 0;				// 사용자가 입력하는 두번째 숫자
		int act = 0;					// 사용자가 입력하는 행동
		boolean loop = true;			// while문 반복 여부
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		firstNum = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		secondNum = scanner.nextInt();
		
		
		// 각 case에서 기능 메소드를 불러서 구현되게 제작.
		// Main에서 출력문 없이 출력되게 제작.
		Operations operations = new Operations(firstNum, secondNum);
		
		// loop가 true일 경우, while문은 무한히 반복됨.
		while(loop == true) {
			System.out.println("*** 원하는 결과를 선택하세요 ***");
			System.out.println("1. 덧셈\n2. 뺄셈\n3. 곱셈\n4. 나눗셈\n5. 몫과 나머지\n6. 종료");
			System.out.print("==========> 선택 : ");
			act = scanner.nextInt();
			switch(act){
				case 1:	// 덧셈
					operations.addCalc();
					break;
				case 2:	// 뺄셈
					operations.subCalc();
					break;
				case 3:	// 곱셈
					operations.multiCalc();
					break;
				case 4:	// 나눗셈
					operations.divCalc();
					break;
				case 5:	// 몫과 나머지
					operations.remainderCalc();
					break;
				case 6:	// 종료
					System.out.println("계산 프로그램을 종료합니다. 감사합니다.");
					loop = false;		// 사용자가 종료를 실행시, loop가 false로 바뀌며 while문 반복 종료.
					break;
				default : // default(잘못된 Case)
					System.out.println("잘못된 번호를 선택하셨습니다. 올바른 번호를 입력해주세요.");
					break;
			}
		}
		
		
	}

}
