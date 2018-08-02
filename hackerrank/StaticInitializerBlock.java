package com.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlock {
    static boolean flag = true;
    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();

    static {
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }
    }


    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

