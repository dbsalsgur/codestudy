package org.java_study.javatutorials.scope;

public class ScopeDemo5 {

	    public static void main(String[] args) {
	        for (int i = 0; i < 5; i++) {
	            System.out.println(i);
	        }
	        //System.out.println(i);
	        //위의 for문의 중괄호 안에서 선언된 변수 i는 for문 안에서만 유효함
	        //for문 아래에서 i를 출력하는 코드는 오류가 있기 때문에 실행불가 
	    }
	 
	}
