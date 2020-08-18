package com.test.wfz.controller;

public class TestController {

    public String testMessage () {
        String s = "6543";
        System.out.println(s);
        String[] sArr = s.split("4");
        return sArr[0];
    }
}
