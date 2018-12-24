import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static double Median(double arr[], int n) {
        Arrays.sort(arr);

        if (n % 2 != 0)
            return (double) arr[n / 2];

        return (double) (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
    }
    public static double mode(double arr[], int n) {
        double maxValue = 0.0, maxCount = 0.0;

        for (int i = 0; i < arr.length; ++i) {
            int count = 0;
            for (int j = 0; j < arr.length; ++j) {
                if (arr[j] == arr[i])
                    ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int i; double t=0.0,arr[] = new double[n];
        for (i =0;i<n;i++){
            arr[i] = sc.nextInt();
            t = t +arr[i];
        }
        System.out.println(t / n);
        System.out.println(Median(arr, n));
        Double d = new Double(mode(arr, n));
        int mod = d.intValue();
        System.out.println(mod);
        sc.close();
    }
}
