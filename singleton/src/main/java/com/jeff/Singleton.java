package com.jeff;

/**
 * Created with IntelliJ IDEA.
 * User: hanjiafu
 * Date: 18-4-11
 * Time: 上午11:27
 * Detail:
 */
public enum Singleton {
    INSTANCE;
    private String s = "";

    Singleton() {
        //做一些初始化工作
        s = "ok";
    }

    public static String getInstance() {
        return Singleton.INSTANCE.s;
    }
}
