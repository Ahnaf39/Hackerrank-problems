package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayoftheProgrammerAL {

    // Complete the solve function below.
    static String solve(int year) {
        String option1="12.09."+year;
        String option2="13.09."+year;
        String option3="26.09."+year;
        if(year>1918){
            if  ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                //System.out.println("12.09."+year);
                return option1;
            }
            else{
                //System.out.println("13.09."+year);
                return option2;
            }
        }
        else if(year==1918){
            //System.out.println("26.09."+year);
            return option3;
        }
        else{
            if  (year % 4 == 0){

                //System.out.println("12.09."+year);
                return option1;
            }
            else{
                //System.out.println("13.09."+year);
                return option2;
            }
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = solve(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

