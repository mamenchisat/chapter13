package com.alibaba.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 项目名：    chapter13
 * 文件名：    ArraysMethod
 * 创建时间：   2022/8/30 15:16
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class ArraysMethod {
    public static void main(String[] args) {
        int[] nums = {92, 2, 34, 133, 12, 13};
        System.out.println(Arrays.toString(nums));
        Integer[] integers = {2, 23, 34, 13, 122, 103};
        System.out.println(Arrays.toString(integers));
        //演示sort方法的使用
        Integer arr[] = {92, 2, 34, 133, 12, 13};
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        //可以传入一个接口comparator实现定制排序
        //这里调用sort方法时要用定制排序，传入了两个参数
        //第一个就是arr数组，第二个就是实现了comparator接口的匿名内部类，要求实现compare方法
        //体现了接口编程
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
