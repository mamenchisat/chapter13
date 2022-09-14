package com.alibaba.string_;

/**
 * 项目名：    chapter13
 * 文件名：    String01
 * 创建时间：   2022/8/29 19:14
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class String01 {
    public static void main(String[] args) {
        //value是一个final类型，不可以修改，即value不能指向新的地址，但是单个字符的内容是可以变化的
        String name = "jack";
        name = "tom";
        final char value[] = {'a', 'b', 'c'};
        char[] v2 = {'j', 'd', 'c'};
        value[0] = 'k';
        //value = v2;

        String n1 = "abc";
        String n2 = new String("abc");
        System.out.println(n1 == n2.intern());
        System.out.println(n2 == n2.intern());
    }
}
