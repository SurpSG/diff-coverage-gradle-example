package org.github.surpsg;

public class SubProj1 {

    public static void method1(boolean callSubProj2) {
        if (callSubProj2) {
            SubProj2.method2();
        } else {
            System.out.println("Hello from sub-proj-1");
        }
    }

}
