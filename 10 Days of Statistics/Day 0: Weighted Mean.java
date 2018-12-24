import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

        static double weightedMean(int X[], int W[], int n) 
    { 
        int sum = 0, numWeight = 0; 
        for (int i = 0; i < n; i++) 
        { 
            numWeight = numWeight + X[i] * W[i]; 
            sum = sum + W[i]; 
        } 
       float ans = (float) (Math.round(numWeight * 10) / 10.0) / sum;
        return Math.round(ans * 10) / 10.0;
    } 
       
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int i,j, X[] = new int[n], W[] = new int[n];
        for (i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }
        for (j = 0; j < n; j++) {
            W[j] = sc.nextInt();
        }   
        System.out.println(weightedMean(X, W, n)); 
        sc.close();
    }  
} 
