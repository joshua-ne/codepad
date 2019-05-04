import java.util.*;
import java.io.*;


public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.

    for (int i = 1; i <= t; ++i) {
      int size = in.nextInt();
      in.nextLine();
      String p = in.nextLine();
      //in.next();
      char[] oldPath = p.toCharArray();
      char[] newPath = new char[oldPath.length];

      
      
      int count = 0;

      while (true) {
        newPath[count] = (oldPath[count] == 'S' ? 'E' : 'S');
        if (count == newPath.length - 1) break;
        count++;
        

        
      }

      System.out.println("Case #" + i + ": " + new String(newPath));
    }
  }



}
  