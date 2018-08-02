package com.hackerrank;

import java.io.*;
import java.util.*;

public class CorrectnessInvariantAL {

    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }

        for(int j=0;j<A.length;j++){
            int key = A[j];
            int k = j-1;
            while(k>=0 && key<A[k]){
                int temp = A[k];
                A[k] = A[k+1];
                A[k+1] = temp;
                k--;
            }
        }

        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int i=0; i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
