import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meal_Cost = scan.nextDouble(); 
        int tipPercent = scan.nextInt(); 
        int taxPercent = scan.nextInt();
        scan.close();
        int totalCost = (int) Math.round(meal_Cost + meal_Cost * tipPercent / 100.0 + meal_Cost * taxPercent / 100.0);
        System.out.println(totalCost);
    }
}
