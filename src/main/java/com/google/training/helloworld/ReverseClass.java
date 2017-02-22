package com.google.training.helloworld;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by alosha on 2/22/17.
 */
public class ReverseClass {
    public String message;
    public ReverseClass(String name) {
        char[] chars = name.toCharArray();
        char[] reversed = new char[chars.length];
        for(int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }

        message = new String(reversed);
    }
}
