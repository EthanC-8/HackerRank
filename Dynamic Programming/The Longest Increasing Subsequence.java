import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LongestIncreasingSubsequence {

    private static Integer greaterBinarySearch(int[] a, int elem) {

        int start = 0;
        int end = a.length;
        int middle = start + (end - start) / 2;
        while (start <= end) {
            middle = start + (end - start) / 2;

            if (a[middle] < elem) {
                start = middle + 1;
            } else if (a[middle] > elem) {
                end = middle - 1;
            } else {
                while (++middle < a.length) {
                    if (a[middle] > elem) {
                        return middle;
                    }
                }
                return null;
            }
        }

        if (a[middle] < elem) {
            while (++middle < a.length) {
                if (a[middle] > elem) {
                    return middle;
                }
            }
            return null;
        } else {
            while (--middle >= 0) {
                if (a[middle] <= elem) {
                    return middle + 1;
                }
            }
            return middle + 1;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int N = Integer.parseInt(reader.readLine());

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        int[] dp = new int[N + 1];
        dp[0] = -Integer.MAX_VALUE;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        int max = 1;
        for (int i = 0; i < N; i++) {
            Integer j = greaterBinarySearch(dp, a[i]);
            if (j != null && dp[j - 1] < a[i] && dp[j] > a[i]) {
                dp[j] = a[i];

                if (max < j) {
                    max = j;
                }
            }
        }

        writer.println(max);
        writer.flush();
        writer.close();
    }
}
