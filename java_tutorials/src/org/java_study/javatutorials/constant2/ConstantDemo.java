package org.java_study.javatutorials.constant2;

//class Fruit{
//	public static final Fruit APPLE = new Fruit();
//	public static final Fruit PEACH = new Fruit();
//	public static final Fruit BANANA = new Fruit();
//}
//class Company{
//	public static final Fruit GOOGLE = new Company();
//	public static final Fruit APPLE = new Company();
//	public static final Fruit ORACLE = new Company();
//}
enum Fruit{
	APPLE, PEACH, BANANA;
}
enum Company{
	GOOGLE, APPLE, ORACLE;
}
 
public class ConstantDemo {
     
    public static void main(String[] args) {
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
}