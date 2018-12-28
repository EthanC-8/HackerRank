import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndCost {
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter(System.out);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(reader.readLine());

            int[] b = new int [N];
            String[] s = reader.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                b[j] = Integer.parseInt(s[j]);
            }

            long[][] dp = new long[2][N];
            for (int j = 1; j < N; j++) {
                dp[0][j] = Math.max(dp[0][j - 1] + Math.abs(b[j] - b[j - 1]),
                        dp[1][j - 1] + Math.abs(b[j] - 1));


                dp[1][j] = Math.max(dp[0][j - 1] + Math.abs(b[j - 1] - 1),
                        dp[1][j - 1] + Math.abs(1 - 1));
            }


            writer.println(Math.max(dp[0][N - 1], dp[1][N - 1]));
        }
        writer.flush();
        writer.close();

    }

}
