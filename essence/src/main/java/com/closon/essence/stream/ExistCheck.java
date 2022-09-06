package com.closon.essence.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangwg
 */
public class ExistCheck {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
//        list.stream().filter(str->)
        list.forEach(str -> {
            if (str.equals("2")) {
                return;
            } else {
                System.out.println(str);
            }
        });
        System.out.println("end");

    }
}
