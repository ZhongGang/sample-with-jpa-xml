package com.icode.dao.impl;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-2
 * Time: 下午3:56
 */
public class ConstantImplTest {

    @Test
    public void test() throws Exception {
        short a = 1;
        int number = a + 1;
        System.out.println(number);
        a += 1;
        System.out.println(a);

        int b = 2;
        double c = 3;
        float d = 4;
        String e = "hello";
        System.out.println(a + b + c + d + e);
        System.out.println(a + b + e + c + d);


        System.out.println(-2 << 2);
        System.out.println(~2);

        int[] array = {1, 2, 3};

    }
}
