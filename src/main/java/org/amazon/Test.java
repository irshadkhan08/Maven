package org.amazon;

import com.sun.tools.javac.Main;

public class Test {
    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1==t2);

        System.out.println("Hello build");
    }
}
