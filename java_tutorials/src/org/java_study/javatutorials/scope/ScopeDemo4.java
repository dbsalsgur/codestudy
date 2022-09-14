package org.java_study.javatutorials.scope;

public class ScopeDemo4 {

    static void a(){
        String title = "coding everybody";
        // title이 해당 메소드 안에서만 유효하기 때문에 아래의 메인이라는 메소드에서는 title을 인식할 수 없다.
    }
    public static void main(String[] args) {
        a();
        //System.out.println(title);
    }
 
}