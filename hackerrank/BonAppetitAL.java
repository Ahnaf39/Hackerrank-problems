package com.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetitAL {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        int arrsize = scan.nextInt();
        int removedIndex = scan.nextInt();
        int[] arr = new int[arrsize];
        int sum=0;
        for (int i=0;i<arrsize;i++){
            arr[i]=scan.nextInt();
            if(i==removedIndex){
                arr[i]=0;
            }
            sum+=arr[i];
        }
        int billCharged = scan.nextInt();
        int billActual = sum/2;
        int billRefund = billCharged-billActual;
        if(billRefund>0){
            System.out.print(billRefund);
        }
        else{
            System.out.print("Bon Appetit");
        }
        scan.close();
    }
}
