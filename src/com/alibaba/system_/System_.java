package com.alibaba.system_;

import java.util.Arrays;

/**
 * 项目名：    chapter13
 * 文件名：    System_
 * 创建时间：   2022/8/30 16:22
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class System_ {
    public static void main(String[] args) {
        int [] src = {1,2,3};
        int [] dest = new int[3];
        System.arraycopy(src,1,dest,1,2);
        System.out.println(Arrays.toString(dest));
    }
}
