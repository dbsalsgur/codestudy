package org.java_study.javatutorials.reference;
class A{
	public int id;
	A(int id){
		this.id = id;
	}
}
public class ReferenceDemo1 {
	 
    public static void runValue(){
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, "+a); 
        //결과 runValue, 1
    }
 
    public static void runReference(){
        A a = new A(1);
        A b = a;
        //b.id = 2;
        b = new A(2);
        System.out.println("runReference, "+a.id);      
        //결과 runReference, 2
    }
 
    public static void main(String[] args) {
        runValue();
        runReference();
    }
 
}