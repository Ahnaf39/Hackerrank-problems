package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedStringAL {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        char[] chars = s.toCharArray();
        long a=0;
        long out=0;
        for (int i=0;i<chars.length;i++){
            if (chars[i]=='a'){
                a++;
            }
        }
        out=(n/chars.length)*a;
        if (n%chars.length!=0){
            for (int i=0; i<n%chars.length;i++){

                if(chars[i]=='a'){
                    out++;
                }
            }
        }
        return out;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
