package com.alibaba.wrapper_;

/**
 * 项目名：    chapter13
 * 文件名：    WrapperExercise02
 * 创建时间：   2022/8/29 18:58
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
        Integer m = -128;
        Integer n = -128;
        System.out.println(m == n);
        //如果在-128 ~ +127之间，直接从cache里取，否则new
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }
}
