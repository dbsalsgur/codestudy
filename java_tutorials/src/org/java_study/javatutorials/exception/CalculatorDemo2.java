package org.java_study.javatutorials.exception;

class DivideException2 extends Exception{
	//Exception은 예외클래스가 checked임
	DivideException2(){
		super();
	} 
	DivideException2(String message){
		super(message);
	}
}
class Calculator2 {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide(){
		try {
			if(right == 0) {
				throw new DivideException2("0으로 나눌 수 없습니다.");
			}
			System.out.println(this.left/this.right);
		} catch(DivideException e) {
			e.printStackTrace();
		}
    }
}

public class CalculatorDemo2 {
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

