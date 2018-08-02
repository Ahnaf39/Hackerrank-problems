package com.hackerrank;

import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class BigIntegerSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        System.out.println(a.add(b));
        System.out.print(a.multiply(b));
    }
}
