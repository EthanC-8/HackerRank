import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static double calculateSD(double arr[],int n) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = n;

        for (double num : arr) {
            sum += num;
        }

        double mean = sum / length;

        for (double num : arr) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        float ans = (float)Math.sqrt(standardDeviation / length);
        return Math.round(ans * 10) / 10.0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n = Integer.parseInt(sc.nextLine());
        double arr[] = new double[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        double SD = calculateSD(arr, n);
        System.out.println(SD);
        sc.close();
    }
}
