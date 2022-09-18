package org.java_study.javatutorials.overloading.example1;

public class OverloadingDemo2 extends OverloadingDemo{
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
    //overloading이다. 기존과 다른 매개변수를 사용하기 때문. 
    void A (){System.out.println("sub class : void A ()");}
    //overriding이다. 기존과 같은, 매개변수가 없는 메소드에서 다른 로직이 동작하도록 수정한 것이니기 때문.
    void A (int param1){System.out.println("void A (int param1)");}
    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");
         
    }
}