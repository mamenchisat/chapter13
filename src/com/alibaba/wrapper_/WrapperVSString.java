package com.alibaba.wrapper_;

/**
 * 项目名：    chapter13
 * 文件名：    WrapperVSString
 * 创建时间：   2022/8/29 11:30
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类转String
        Integer i = 100;
        //方式1
        String str1 = i + "";
        //方式2
        String s = i.toString();
        //方式3
        String s1 = String.valueOf(i);

        //string转包装类
        String str4 = "12345";
        //1
        Integer n1 = Integer.parseInt(str4);
        //2
        Integer integer = new Integer(str4);
    }
}
