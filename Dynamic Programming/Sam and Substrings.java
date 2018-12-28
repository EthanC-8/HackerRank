import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SamAndSubStrings {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        String N = reader.readLine();

        long[] dp = new long[N.length()];
        dp[0] = Integer.parseInt(N.substring(0, 1));
        for (int i = 1; i < N.length(); i++) {
            dp[i] = ((10 * dp [i - 1]) % 1_000_000_007l +
                    ((i + 1) * Integer.parseInt(N.substring(i, i + 1))) % 1_000_000_007) % 1_000_000_007l;

        }

        long sum = 0;
        for (int i = 0; i < N.length(); i++) {
            sum = (sum + dp[i]) % 1_000_000_007l;
        }

        writer.println(sum);
        writer.flush();
        writer.close();
    }

}
