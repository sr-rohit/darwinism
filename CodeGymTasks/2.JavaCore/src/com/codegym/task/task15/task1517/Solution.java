package com.codegym.task.task15.task1517;

/* 
Static modifiers and exceptions

*/

public class Solution {
    public static int A = 0;

    static {
        // Throw an exception here
        if(true)
            throw new RuntimeException();
    }

    public static int B = 5;

    public static void main(String[] args) throws Exception {
        System.out.println(B);
    }
}
