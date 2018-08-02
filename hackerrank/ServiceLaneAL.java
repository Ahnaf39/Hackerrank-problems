package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ServiceLaneAL {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int[] width = new int[n];

        for (int i = 0; i < n; i++) {
            width[i] = scan.nextInt();
        }
        int[] cases = new int[t*2];
        for (int i = 0; i < t*2; i++) {

            cases[i] = scan.nextInt();
        }
        int min = Integer.MAX_VALUE;


        for (int i=0; i< t*2; i++){
            for (int j=cases[i]; j!=cases[i+1]+1;j++ ){
                if (width[j]<min){
                    min = width[j];
                }
            }
            System.out.println(min);
            i++;
            min = Integer.MAX_VALUE;
        }




        scan.close();
    }
}

