package com.tong.base.test;

import java.lang.ref.WeakReference;

public class WeekReferenceDemo {
    public static void main(String[] args) {
        WeakReference weakReference = new WeakReference(new User());
        System.gc();
    }
}