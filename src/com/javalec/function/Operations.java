package com.javalec.function;

public class Operations {
	
	// Field
	private int firstNum;
	private int secondNum;
	private int act;
	int result;
	int quotient;
	double divResult ;
	double reminder;
	
	// Constructor 
	public Operations() {
		// TODO Auto-generated constructor stub
	}

	public Operations(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}



	// Method 
	public int addCalc () {
		result = firstNum + secondNum ;
		return result;
	}
	public int subCalc () {

	}
	public int multiCalc () {
		result = firstNum * secondNum ;
		return resulf;

	}
	public double divCalc () {

	}
	
	public double reminderCalc() { 		// 몫과 나머지 
		reminder = firstNum % secondNum;
		quotient = firstNum / secondNum;
		return reminder;
	}
	
	
	
	
	
}
