package com.company.mianshi.staticOrder;

public class CMain {
    static int value = 33; 
 
    public static void main(String[] args) throws Exception{
        new CMain().printValue();
    }
 
    private void printValue(){
        int value = 3;
        System.out.println(this.value);//输出结果为33
    }
}
