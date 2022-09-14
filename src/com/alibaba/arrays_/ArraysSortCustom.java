package com.alibaba.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 项目名：    chapter13
 * 文件名：    ArraysSortCustom
 * 创建时间：   2022/8/30 15:42
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] array = {80, 95, 54, 78, 27, 44, 61, 23, 80, 14, 27, 5, 62, 93, 41, 3, 5};
        bubble02(array, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println(Arrays.toString(array));
    }


    //结合冒泡 + 定制
    public static void bubble02(int[] arr, Comparator comparator) {
        int i = 0;
        for (; i < arr.length - 1; i++) {
            //数组的排序由Comparator决定
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[i], arr[j]) > 0) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}

