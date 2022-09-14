package com.alibaba.arrays_;

import java.util.Arrays;

/**
 * 项目名：    chapter13
 * 文件名：    ArraysMethod02
 * 创建时间：   2022/8/30 16:14
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        int []arr = {3, 5, 5, 14, 23, 27, 27, 41, 44, 54, 61, 62, 78, 80, 80, 93, 95};
        int index = Arrays.binarySearch(arr,56);
        System.out.println(index);
    }

}
