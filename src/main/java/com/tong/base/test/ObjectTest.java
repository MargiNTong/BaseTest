package com.tong.base.test;


import org.openjdk.jol.info.ClassLayout;

public class ObjectTest {
    public static void main(String[] args) {
        Object o = new Object();
        o="hellohellohellohellohellohellohellohello";
        System.out.println(ClassLayout.parseInstance(o).toPrintable());


//        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
//        }
    }
}