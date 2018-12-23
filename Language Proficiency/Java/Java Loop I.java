//https://www.hackerrank.com/challenges/java-loops-i/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int f=0,i=1;
        for (i = 1;i<=10;i++){
             f = i * N;
            System.out.println(N+" x "+i+" = "+f);
        }
        scanner.close();
    }
}
