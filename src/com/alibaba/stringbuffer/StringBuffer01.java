package com.alibaba.stringbuffer;

/**
 * 项目名：    chapter13
 * 文件名：    StringBuffer01
 * 创建时间：   2022/8/29 20:40
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        //存在堆里面，StringBuffer类被Final修饰，不能被继承
        //StringBuffer的更新实际上可以更新内容，不用每次更新地址，效率高
        StringBuffer stringBuffer1 = new StringBuffer();
        new StringBuffer(100);
        //String 转StringBuffer
        String str = "hello tom";
        StringBuffer buffer = new StringBuffer(str);
        //StringBuffer to String
        StringBuffer stringBuffer = new StringBuffer("buffer");
        String s = stringBuffer.toString();
        String s1 = new String(stringBuffer);
    }
}
