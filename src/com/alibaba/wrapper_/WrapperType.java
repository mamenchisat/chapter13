package com.alibaba.wrapper_;

/**
 * 项目名：    chapter13
 * 文件名：    WrapperType
 * 创建时间：   2022/8/29 10:59
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class WrapperType {
    public static void main(String[] args) {
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        System.out.println(integer == integer1);

        int i = integer.intValue();

        //jdk5之后
        //自动装箱和拆箱
        //自动装箱
        int n2 =200;
        Integer integer2 = n2;
        //自动拆箱
        int j = integer2.intValue();

        Object obj;
        if (true) {
            obj = new Integer(1);
        }else
            obj = new Double(2.0);
        System.out.println(obj);
    }
}
