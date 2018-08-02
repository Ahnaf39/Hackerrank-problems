package com.hackerrank;

import java.io.*;
import java.util.*;

public class List {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer>list=new LinkedList<>();
        for(int i=0; i<n; i++){
            list.add(scan.nextInt());
        }
        int q = scan.nextInt();
        for (int j=0; j<q;j++){
            String query = scan.next();
            if(query.equals("Insert")){
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index,value);
            }
            else{
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
