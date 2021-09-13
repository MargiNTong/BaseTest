package com.tong.base.test;

public class StrongReferenceDemo {
    public static void main(String[] args) {
        User u = new User();
        /*强制终止引用后,User对象才能被回收*/
        u = null;
        System.gc();
    }
}