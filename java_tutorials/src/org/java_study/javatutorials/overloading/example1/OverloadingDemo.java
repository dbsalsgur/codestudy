package org.java_study.javatutorials.overloading.example1;

public class OverloadingDemo {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
    //int A (){System.out.println("void A()");}
    //위 주석을 해제하면 오류가 발생한다.
    //1. overloading을 하기 위해서는 리턴값을 동일하게 해야하기 때문이다.
    //2. od.A()를 했을 때 호출될 메소드가 2개여서 두개를 구분하는 것이 애매하다.
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}
