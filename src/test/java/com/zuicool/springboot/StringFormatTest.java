package com.zuicool.springboot;

import org.junit.Assert;
import org.junit.Test;

public class StringFormatTest {
    @Test
    public void test() {
        String expect = "shuyuanapp_android_v1.0_patch1.0.apk";
        String actual = String.format("shuyuanapp_android_v%s_patch%s.apk", "1.0", "1.0");
        Assert.assertEquals(expect, actual);
    }
}
