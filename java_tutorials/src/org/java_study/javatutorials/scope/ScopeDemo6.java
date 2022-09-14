package org.java_study.javatutorials.scope;

public class ScopeDemo6 {

    static int i = 5;
    
    static void a() {
        int i = 10;
        b();
    }
 
    static void b() {
        System.out.println(i);
    }
 
    public static void main(String[] args) {
        a();
    }
    //메인 메소드에서 우선 a()메소드를 실행한다.
    //i값을 10으로 선언한 뒤 b()메소드를 실행하게 되는데, 그것은 a()메소드 안에서만 유효하다
    //b()메소드에 도달했을 때, 전역변수인 int i = 5가 입력되어 출력된다.
    //결과 5가 출력된다.
}
