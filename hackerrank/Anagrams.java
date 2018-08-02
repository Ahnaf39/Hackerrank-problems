package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;


public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function

        if (a.length() != b.length()){
            return false;
        }
        else{
            a = a.toLowerCase();
            b = b.toLowerCase();

            char[] c1 = a.toCharArray();
            char[] c2 = b.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            String str1 = new String(c1);
            String str2 = new String(c2);
            return str1.equals(str2);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}