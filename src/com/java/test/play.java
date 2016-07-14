package com.java.test;

/**
 * 玩游戏
 * Author: miker
 * Date: 2016年07月13日 17:28
 */

public class play {
    public static void main(String[] args) {
        test(4);
    }
    private static void test(Integer num) {
        if (num != null) System.out.println("不为空");
        else System.out.println("为空");
    }
}

