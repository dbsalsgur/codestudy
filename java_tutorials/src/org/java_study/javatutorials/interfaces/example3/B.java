package org.java_study.javatutorials.interfaces.example3;

interface I3{
    public void x();
}
 
interface I4 extends I3{
    public void z();
}
 
class B implements I4{
    public void x(){}
    public void z(){}  
    //부모 클래스의 메소드나 자식 클래스의 메소드 모두 구현해야한다.
}

interface I5{
	//private void x();
}
