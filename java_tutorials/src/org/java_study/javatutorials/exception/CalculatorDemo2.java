package org.java_study.javatutorials.exception;

class DivideException2 extends Exception{
	//Exception은 예외클래스가 checked임
	public int left;
	public int right;
	DivideException2(){
		super();
	} 
	DivideException2(String message){
		super(message);
	}
	DivideException2(String message, int left, int right){
		super(message);
		this.left = left;
		this.right = right;
	}
}
class Calculator2 {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide()throws DivideException2 {
			if(right == 0) {
				throw new DivideException2("0으로 나눌 수 없습니다.", this.left, this.right);
			}
			System.out.println(this.left/this.right);
		} 
		//throws나 try catch를 통해서 예외처리를 강제로 해야함.
    }


public class CalculatorDemo2 {
	public static void main(String[] args) {
		Calculator c2 = new Calculator();
		c2.setOprands(10, 0);
		try{
			c2.divide();
		} catch(DivideException2 e) {
			System.out.println(e.getMessage());
		}
	}
}

