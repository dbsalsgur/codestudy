package org.java_study.javatutorials.interfaces.example3;

interface I1{
    public void x();
}
 
interface I2{
    public void z();
}
 
class A implements I1, I2{
    public void x(){}
    public void z(){}   
}
