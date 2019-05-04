import java.util.*;
import java.io.*;


public class Solution1 {
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

      char first = oldPath[0] == 'S' ? 'E' : 'S';
      int level = 0;

      buildPath(size, 0, 0, newPath, oldPath, level, first);

      System.out.println("Case #" + i + ": " + new String(newPath));
      //break;
      } 
    }

    static boolean buildPath(int size, int newSCount, int oldSCount, char[] newPath, char[] oldPath, int level, char next) {
      if (level == 2 * size - 2) {
        return true;
      } else {
        if (!checkValidity(size, newSCount, oldSCount, newPath, oldPath, level, next)) {
          return false;
        } 
      }


      if (next == 'S') {
        newSCount++;
      }
      if (oldPath[level] == 'S') {
        oldSCount++;
      }
      newPath[level] = next;
      level++;

      if (buildPath(size, newSCount, oldSCount, newPath, oldPath, level, 'S')) {
        return true;
      } else if (buildPath(size, newSCount, oldSCount, newPath, oldPath, level, 'E')) {
        return true;
      } else {
        return false;
      }
    }

    static boolean checkValidity(int size, int newSCount, int oldSCount, char[] newPath, char[] oldPath, int level, char next) {

      boolean checkRes = true;

      if (next == 'S' && newSCount >= size - 1) {checkRes = false;}
      if (next == 'E' && level - newSCount >= size - 1) {checkRes = false;}
      if (oldSCount == newSCount && next == oldPath[level]) {checkRes = false;}
      return checkRes;

    }
}
  