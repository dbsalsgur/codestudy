package org.java_study.javatutorials.exception;

class DException extends Exception{
	//Exception은 예외클래스가 checked임
	public int left;
	public int right;
	DException(){
		super();
	} 
	DException(String message){
		super(message);
	}
	DException(String message, int left, int right){
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

	public void divide()throws DException {
			if(right == 0) {
				throw new DException("0으로 나눌 수 없습니다.", this.left, this.right);
			}
			System.out.println(this.left/this.right);
		} 
		//throws나 try catch를 통해서 예외처리를 강제로 해야함.
    }


public class CalculatorDemo2 {
	public static void main(String[] args) {
		Calculator2 c2 = new Calculator2();
		c2.setOprands(10, 0);
		try{
			c2.divide();
			throw new DException();
		} catch(DException e) {
			System.out.println(e.getMessage());
		}
	}
}

