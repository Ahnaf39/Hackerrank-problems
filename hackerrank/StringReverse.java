package com.hackerrank;

import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length() / 2;
        boolean isPalindrome = true;
        for (int i=0; i<len; i++) {
            if (A.charAt(i) != A.charAt(A.length()-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Yes" : "No");
    }
}




