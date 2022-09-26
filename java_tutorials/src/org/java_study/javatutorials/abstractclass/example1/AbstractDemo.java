package org.java_study.javatutorials.abstractclass.example1;

abstract class A{
    public abstract int b();
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")}
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
    public void d(){
        System.out.println("world");
    }
}
class B extends A {
	public int b() {
		return 1;
		//추상 클래스는 상속해야만 쓸 수 있는 것처럼, 추상 메소드는 오버라이딩 해야만 사용할 수 있다.
	}
}
public class AbstractDemo {
    public static void main(String[] args) {
        //A obj = new A();
    	//추상클래스인데 상속을 하지 않았기 때문에 오류가 발생
    	B obj = new B();
    }
}