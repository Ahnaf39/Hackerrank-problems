package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StaircaseAL {

    // Complete the staircase function below.
    static void staircase(int n) {
        int i;
        int j;
        int k;
        for (i=0;i<n;i++){
            for (j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (k=j;k<n;k++){
                System.out.print("#");
            }
            System.out.println("");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}

