//https://www.hackerrank.com/challenges/non-divisible-subset/problem

import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] remainder = new int[k];

        for(int i = 0; i < n; i++){
            remainder[in.nextInt() % k]++;
        }

        int ans = 0;
        ans += Math.min(remainder[0], 1);
        
        for(int i = 1; i <= remainder.length / 2; i++){
            if(i != remainder.length - i) {
                ans += Math.max(remainder[i], remainder[remainder.length - i]);
            } else {
                ans += Math.min(remainder[i], 1);
            }
        }

        System.out.println(ans);
    }
}
