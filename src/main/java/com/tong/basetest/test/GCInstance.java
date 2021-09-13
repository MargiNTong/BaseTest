package com.tong.basetest.test;

public class GCInstance {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("对象被回收了！");
    }
}
