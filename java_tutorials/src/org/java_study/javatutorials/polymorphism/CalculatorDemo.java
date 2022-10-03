package org.java_study.javatutorials.polymorphism;

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+_sum());
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
	public static void execute(Calculator cal) {
		System.out.println("실행결과");
		cal.run();
		//변수 cal은 calculatorDecoPlus와 Minus의 부모 클래스인 calculator를 그 속성으로 한다.
		//cal에는 인스턴스 변수가 담긴다.
	}
    public static void main(String[] args) { 
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
         
        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        
        execute(c1);
        execute(c2);
        //이렇게 햐면 execute에 넣는 입력 값에 따라 다른 결과가 출력된다.
    }
   
}