package com.company.thread;

public class VolatileTest extends Thread {
    
    boolean flag = false;
    int i = 0;
    
    public void run() {
        while (!flag) {
            i++;
            System.out.println("--------");
        }
    }
    
    public static void main(String[] args) throws Exception {
        VolatileTest vt = new VolatileTest();
        vt.start();
        Thread.sleep(2000);
        System.out.println("==============");
        vt.flag = true;
        System.out.println("stope" + vt.i);
    }
}