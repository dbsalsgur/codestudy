package org.java_study.javatutorials.exception;
import java.io.IOException;
class E {
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException1(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException{
        throw new IOException();
    }
    //IOException은 try catch로 예외를 잡거나 throws로 사용자에게 넘기는 등 반드시 예외처리를 해야하는 checked Exception이다.
}
