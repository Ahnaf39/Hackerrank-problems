package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinusAL {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double posRatio=0;
        double negRatio=0;
        double zeroRatio=0;
        double pos=0;
        double neg=0;
        double zero=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
            }
            if(arr[i]<0){
                neg++;
            }
            if(arr[i]==0){
                zero++;
            }
        }
        posRatio = pos / (pos+neg+zero);
        negRatio = neg / (pos+neg+zero);
        zeroRatio = zero / (pos+neg+zero);

        System.out.println(posRatio);
        System.out.println(negRatio);
        System.out.println(zeroRatio);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

