package com.javademo.demo;

import java.io.File;
import java.util.StringTokenizer;

/**
 * @author maple
 * @name 金色木叶枫
 * @since Created time on 2017/7/31 下午11:29.
 */
public class JavaLoad {
    public static void main(String[] args){
        File[] var1;
        //获取java扩展目录下的内容
        String var0 = System.getProperty("java.ext.dirs");
        StringTokenizer var2 = new StringTokenizer(var0, File.pathSeparator);
        int var3 = var2.countTokens();
        var1 = new File[var3];

        for(int var4 = 0; var4 < var3; ++var4) {
            var1[var4] = new File(var2.nextToken());
        }
        System.out.println(var0);
        System.out.println(var2);
        System.out.println(var1);

        String s = System.getProperty("java.class.path");
        System.out.println(s);
    }
}
