package com.hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class JesseandCookiesDS {

    /*
     * Complete the cookies function below.
     */
    static int cookies(int k, int[] A) {
        /*
         * Write your code here.
         */
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<A.length;i++){
            pq.add(A[i]);
        }
        int count=0;
        while(pq.peek()<k && pq.size()>1){
            int sweetest=pq.poll();
            int secondSweetest=pq.poll();
            pq.add((1*sweetest)+(2*secondSweetest));
            count++;
        }
        if(pq.peek()>=k)return count;
        else return -1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] A = new int[n];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        int result = cookies(k, A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
