package com.ian.mike.validator;

/**
 * @author mike ian
 * @date 2024/11/26
 * @desc
 **/
public class HelloObjValidator {

    public static void hello(String msg) {
        System.out.println("validator hello msg : " + msg);
    }

    public static void main(String[] args) {
        hello("inner");
    }

}
