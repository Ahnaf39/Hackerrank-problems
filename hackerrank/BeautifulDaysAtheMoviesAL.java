package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulDaysAtheMoviesAL {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int numOfBeautifulDays=0;
        for(int l=i; l<=j;l++) {
            if((l-reverse(l))%k ==0)  numOfBeautifulDays++;
        }
        return numOfBeautifulDays;
    }

    public static int reverse(int number){
        int reverse = 0;
        while(number!=0){
            reverse = 10*reverse +number%10;
            number = number/10;
        }
        reverse += number;
        return reverse;
    }




    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

