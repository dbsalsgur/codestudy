package org.java_study.javatutorials.scope;

class C {
    int v = 10;
 
    static void m() {
    	int v = 20;
    	int w = 50;
        System.out.println(v);
        System.out.println(w);
       
        //지역변수와 전역변수가 둘 다 있을 때 지역변수가 우선한다.
        //this.v는 아래의 c1 인스턴스 자신의 변수이다.
        //즉 c1에서 유효한 v의 값은 전역변수 int v = 10이기 때문에 위의 코드는 각각 20과 10을 출력한다.
    }
    void test() {
    	System.out.println(v);
    }
}
 
public class ScopeDemo7 {
 
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
        C.m();
        C c2 = new C();
        System.out.println(c2.v);
    }
 
}
