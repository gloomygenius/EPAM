package com.epam.homework.exсeptions.t01;

import java.io.File;

public class Explorer {
    public static void showItems(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            for (File item : file.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "/");
                } else {
                    System.out.println(item.getName());
                }
            }
        }else System.out.println("куку");
    }
}
