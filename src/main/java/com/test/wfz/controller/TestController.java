package com.test.wfz.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestController {

    public String testMessage () {
        String s = "65143";
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        BigDecimal d = new BigDecimal(0.00);
        List<Double> list = new ArrayList<>();
        list.add(1.1d);
        list.forEach(e ->{
            System.out.println(12345678);
        });
        d = d.add(new BigDecimal(1.1d));
        System.out.println(d.doubleValue());
    }

    public void test() {
        System.out.println(123321);
    }
}
