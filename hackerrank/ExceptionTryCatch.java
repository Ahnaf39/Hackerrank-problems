package com.hackerrank;

import java.io.*;
import java.util.*;

public class ExceptionTryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        try{
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(y==0){
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
            else{
                System.out.println(x/y);
            }

        }
        catch(Exception e){
            System.out.println("java.util.InputMismatchException");
        }
        scan.close();
    }
}

