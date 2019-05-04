import java.util.*;
import java.io.*;


public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.

    for (int i = 1; i <= t; ++i) {
      Integer n = in.nextInt();

      Integer tmp = n;
      int digit = 0;
      int kthDigit = 0;
      Integer complement = 0;

      while (tmp != 0) {

        digit = tmp % 10;
        kthDigit++;

        if (digit == 4) {
          complement += Integer.valueOf((int) Math.pow(10, kthDigit - 1));
        }
        tmp = tmp / 10;
      }

      System.out.println("Case #" + i + ": " + (complement) + " " + (n - complement));
    }
  }
}
  