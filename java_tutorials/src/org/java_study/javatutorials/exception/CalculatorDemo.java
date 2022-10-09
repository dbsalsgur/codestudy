package org.java_study.javatutorials.exception;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide(){
		//계산결과는 오류가 발생했습니다 : / by zero
    	try {
    		System.out.print("계산결과는 ");
    		System.out.print(this.left/this.right);
    		System.out.print(" 입니다.");
    	} catch(Exception e) {
    		/* 
계산결과는 

e.getMessage()
/ by zero


e.toString()
java.lang.ArithmeticException: / by zero


e.printStackTrace()
java.lang.ArithmeticException: / by zero
	at java_tutorials/org.java_study.javatutorials.exception.Calculator.divide(CalculatorDemo.java:15)
	at java_tutorials/org.java_study.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:31)
*/
			System.out.println("\n\ne.getMessage()\n"+e.getMessage());
	        System.out.println("\n\ne.toString()\n"+e.toString());
	        System.out.println("\n\ne.printStackTrace()");
	        e.printStackTrace();
    	}
    	//try, catch는 예외처리를 위한 핵심적인 문법
    }
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
	}
}
/*
 * 아래와 같은 오류가 뜬다. 계산결과는 Exception in thread "main"
 * java.lang.ArithmeticException: / by zero at
 * org.opentutorials.javatutorials.exception.Calculator.divide(CalculatorDemo.
 * java:10) at
 * org.opentutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.
 * java:18)
 */
