package com.company.mianshi.staticOrder;

/**
 * 执行顺序 
 * 1、类的执行顺序（静态方法、成员变量、构造方法）
 * @author Dell
 *
 */
public class DTest {
	
    Person person = new Person("Test");//4
    
    static{
        System.out.println("1- test static");//1
    }
     
    public DTest() {
        System.out.println("5-test constructor");//5
    }
    
    Person person2 = new Person("Test2");//4
    
    public static void main(String[] args) {
        new MyClass();
    }
}
 
class Person{
	
    static{
        System.out.println("3-person static");
    }
    public Person(String str) {
        System.out.println("4/6-person "+str);
    }
}
 
 
class MyClass extends DTest {
	
    Person person = new Person("6-MyClass");
    
    static{
        System.out.println("2-myclass static");
    }
     
    public MyClass() {
        System.out.println("7-myclass constructor");//6
    }
}
