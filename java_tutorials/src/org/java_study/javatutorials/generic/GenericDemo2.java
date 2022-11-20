package org.java_study.javatutorials.generic;

class EmployeeInfo2{
    public int rank;
    EmployeeInfo2(int rank){ this.rank = rank; }
}
class Person2<T, S>{
    public T info;
    public S id;
    Person2(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
    public <U> void printInfo(U info) {
    	System.out.println(info);
    }
}
public class GenericDemo2 {
    public static void main(String[] args) {
    	EmployeeInfo2 e = new EmployeeInfo2(1);
    	Integer i = new Integer(10);
        Person2 p1 = new Person2(e, i);
        //생성한 인스턴스 변수의 데이터 타입이 존재하기 떄문에 Person2뒤에 데이터 타입을 굳이 명시하지 않아도, 각각 EmployeeInfo2, Integer 타입임을 자바가 인식한다.
        p1.printInfo(e);
        //위와 비슷한 맥락으로, e의 데이터 타입이 EmployeeInfo2이기 때문에, 위의 printInfo()메소드의 제네릭 <U>에도 EmployeeInfo2가 지정된다.
    }
}