package com.javalec.function;

public class Operations {
	
	// Field
	private int firstNum;
	private int secondNum;
	int result;
	int quotient;
	double divResult ;
	double remainder;
	
	// Constructor 
	public Operations() {
		// TODO Auto-generated constructor stub
	}

	public Operations(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}



	// Method ----
	// 더하기 기능 Method
	public int addCalc () {
		result = firstNum + secondNum;
		System.out.println(firstNum + " + " + secondNum + " = " + result);
		return 0;
	}
	
	// 빼기 기능 Method
	public int subCalc () {
		result = firstNum - secondNum;
		System.out.println(firstNum + " - " + secondNum + " = " + result);
		return 0;
	}
	
	// 곱하기 기능 Method
	public int multiCalc () {
		result = firstNum * secondNum ;
		System.out.println(firstNum + " X " + secondNum + " = " + result);
		return 0;
	}
	
	// 나누기 기능 Method
	public double divCalc () {
		divResult = (double)firstNum / secondNum;
		System.out.println(firstNum + " ÷ " + secondNum + " = " + String.format("%.2f", divResult));
		return 0;
		
	}
	
	// 몫과 나머지
	public double remainderCalc() {
		quotient = firstNum / secondNum;		//몫
		remainder = firstNum % secondNum;		//나머지
		System.out.println(firstNum + " ÷ " + secondNum + "의 몫은 " + quotient + "이고 나머지는 " + remainder + "입니다.");
		return 0;
	}
	
	
	
	
	
}
