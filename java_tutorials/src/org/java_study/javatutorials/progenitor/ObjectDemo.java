package org.java_study.javatutorials.progenitor;

class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj) {
        Student s = (Student)obj;
        return name == s.name;
    }
}
 
class ObjectDemo {
 
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        //Object 클래스와 Student 클래스는 부모 자식관계이다.
        //s1, s2 인스턴스는 equals라는 메소드에 넣었을 때 Object obj라는 매개변수에 Student s1이라는 변수를 넣게된다
        // → Object 데이터 타입을 가진 매개변수에 Student 데이터 타입을 가진 변수를 넣는 꼴
        //s2를 equals 메소드에 넣는 것은 문제 없다.
        //하지만 s2의 데이터 타입을 Object로 가지면 Student 클래스의 name이라는 변수에 접근할 수 없다.
        // → Object 클래스에 name이라는 멤버는 없기 때문이다.
        //따라서 name이라는 변수에 접근하기 위해 Object라는 데이터 타입을 Student 데이터 타입으로 변환할 필요가 있다.
        //하지만 부모 클래스의 데이터타입을 가진 변수에게 자식클래스의 데이터 타입을 가지게 하는 것은 불가능하다.
        //그래서 9행과 같이 Student s = (student)obj;라고 하면 형 변환이 가능하다.
    }
}