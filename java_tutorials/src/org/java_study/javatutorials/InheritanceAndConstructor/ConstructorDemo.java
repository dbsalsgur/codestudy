package org.java_study.javatutorials.InheritanceAndConstructor;

public class ConstructorDemo {
	public ConstructorDemo() {}
	//아래의 객체를 생성할 때, 인자가 없는 객체를 생성했기 때문에 위와 같은 인자가 없는 생성자를 추가해주어야 한다.
	public ConstructorDemo(int param1) {}
	//위의 생성자만 있으면 오류가 발생한다.
	//생성자가 없어도 인자가 없는 생성자를 자동으로 생성하기 때문에 오류는 없다.
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo();
	}

}
