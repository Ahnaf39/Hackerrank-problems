package com.hackerrank;

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String b = String.format("%03d", x);
            String c = String.format("%-15s", s1);
            System.out.println(c+b);
            //Complete this line
        }
        System.out.println("================================");

    }
}



