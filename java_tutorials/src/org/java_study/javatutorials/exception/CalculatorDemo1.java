package org.java_study.javatutorials.exception;

class DivideException extends RuntimeException{
	//RuntimeException은 예외 클래스가 unchecked임
	DivideException(){
		super();
	} 
	DivideException(String message){
		super(message);
	}
}
class Calculator1 {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide(){
		if(right == 0) {
			throw new DivideException("0으로 나눌 수 없습니다.");
		}
		System.out.println(this.left/this.right);
    }
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		try{
			c1.divide();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
