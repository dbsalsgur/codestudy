package org.java_study.javatutorials.exception;

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		//예외를 우리가 만든다면, 이 지점에서 right 인자에 대한 illegalArgummentException을 사용할 수 있다.
		/*if(right == 0) {
			throw new IllegalArgumentException("두번째 인자는 0을 허용하지 않습니다.");
		}*/
		this.left = left;
		this.right = right;
	}

	public void divide(){
		if(right == 0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		//예외를 우리가 만든다면, ArithmeticException을 사용할 수 있다.
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
		try{
			c1.divide();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		//try catch 구문 없이 c1.divide를 호출하면 divide 메소드에 있는 throw new로 생성한 인스턴스에 의해 문자열을 출력한다.
		//try catch를 넣었을 때 catch 구문에 있는 데이터타입이 divide 메소드에서 생성한 인스턴스와 같다면(현재 ArithmeticException) 해당 인스턴스를 catch 구문의 변수에 담는다(현재 e)
		//그래서 위의 코드를 실행하면, getMessage API는 divide 메소드의 인스턴스에 입력한 "0으로 나눌 수 없습니다."가 출력되는 것이다.
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
