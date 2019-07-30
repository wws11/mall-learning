package com.macro.mall.tiny.test;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author DJZ-WWS
 * @Date 2019/7/23 16:00
 */
public class DiguiTest {

    /**
     * 找出指定文件夹下所有的文件
     */

    public static List<File> listFiles(File files) {
        List<File> fileList = new ArrayList<>();
        if (files.isDirectory()) {
            for (File file : files.listFiles()) {
                fileList.addAll(listFiles(file));
            }
        } else {
            fileList.add(files);
        }
        return fileList;
    }

    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getSum(num - 1);
    }

    @Test
    public void test1() {
        List<File> l = listFiles(new File("D:\\DevSoft\\maven3.6.0\\maven-repository\\repository"));
        System.out.println("共" + l.size() + "个文件");
        for (File f : l) {
            System.out.println(f.getName());//(这里只打印了文件的文件名)
        }
    }

    @Test
    public void test2() {
        System.out.println(getSum(10001));
    }

    @Test
    public void testMap() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            map.put("haha" + 1, i);
        }
        ;

        System.out.println();
    }



}
