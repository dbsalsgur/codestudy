package org.java_study.javatutorials.InheritanceAndConstructor;

class Calculator {
    int left, right;
    
    public Calculator() {}
    
    public Calculator(int left, int right) {
    	this.left = left;
        this.right = right;
    }
    //기본 생성자를 따로 만들어주지 않으면, 상속을 하여 자식클래스가 객체를 생성했을 때, 오류가 발생한다.
   
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right)/ 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
	int up, down;
	public SubstractionableCalculator(int left, int right) {
		//this.left = left;
		//this.right = right;
		super(left, right);
	}
	//위의 자식클래스에 생성자를 추가하여, 아래 객체 생성 시 인자 값을 갖도록 했다.
	//만약 부모클래스에 기본생성자가 없는경우 수기로 추가해도 되지만, 위와같이 super를 사용해서 부모 클래스의 생성자를 호출해도 된다.
    public void substract() {
        System.out.println(this.left - this.right);
    }
    public void sum () {
    	super.sum();
    	System.out.println("+ sum" + (this.left + this.right));
    }
}

public class ConstructorDemo_example {
    public static void main(String[] args) {
    	 
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
 
}
