package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DiagonalDiffAL {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a) {
        int pdiagonal=0;
        int sdiagonal=0;
        for (int i=0;i<a.length;i++){
            pdiagonal+=a[i][i];
            sdiagonal+=a[i][a.length-1-i];
        }
        if (pdiagonal>sdiagonal){
            return pdiagonal-sdiagonal;
        }
        if (pdiagonal<sdiagonal){
            return sdiagonal-pdiagonal;
        }
        return 0;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] aRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int aItem = Integer.parseInt(aRowItems[j]);
                a[i][j] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

