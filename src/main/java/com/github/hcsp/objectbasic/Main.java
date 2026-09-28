package com.github.hcsp.objectbasic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 请想办法在这里写一些代码，占用尽可能多的内存，令JVM抛出内存不足的OutOfMemoryError异常
        List<Object> list = new ArrayList<>();
        while (true) {
            // 不断新建对象，放进list保留引用，不让GC回收
            list.add(new Object());
        }
    }
}
