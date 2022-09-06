package com.closon.essence;

import java.util.HashMap;
import java.util.Map;

public class NullPointExceptionTest {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        String s = map.get(null);
        System.out.println(s);
    }
}
