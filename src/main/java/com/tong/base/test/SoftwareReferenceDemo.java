package com.tong.base.test;

import java.lang.ref.SoftReference;
/*
软引用会在堆内存不够时被回收
* */
public class SoftwareReferenceDemo {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        SoftReference softReference = new SoftReference(new User());
        System.gc();
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        System.out.println("-------------------------");
        Object o = new byte[1024*1024*19];
//        System.gc();
    }
}