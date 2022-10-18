package org.java_study.javatutorials.exception;

import java.io.*;
//기본으로 import 되어 있는 java.lang이 아니기 때문에 따로 import를 해주어야 한다.
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        BufferedReader bReader = null;
        String input = null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        //new FileReader라는 인스턴스의 인자 값으로 가져오고자 하는 파일 명을 기입
        //new BufferedReader라는 클래스의 객체를 생성하여, bReader라는 변수에 담음
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
        //readLine이라는 클래스가 위의 out.txt를 읽어서 input 변수에 담는다.
        System.out.println(input); 
    }
}