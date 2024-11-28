package com.ian.mike.validator;

/**
 * @author mike ian
 * @date 2024/11/26
 * @desc
 **/
public class HelloObjValidator {

    private static ThreadLocal<String> flag = new ThreadLocal<>();

    public static void hello(String msg) {
        System.out.println("validator hello msg : " + msg);
        flag.set("test");
        flag.get();
    }

    public static void main(String[] args) {
        hello("inner");
    }

}
