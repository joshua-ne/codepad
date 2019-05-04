import java.util.*;
import java.io.*;


public class Solution2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.

    for (int i = 1; i <= t; ++i) {
      int size = in.nextInt();
      in.nextLine();
      String p = in.nextLine();
      //in.next();
      char[] oldPath = p.toCharArray();
      //System.out.println(oldPath.length);
      char[] newPath = findPath(size, oldPath);
      System.out.println("Case #" + i + ": " + new String(newPath));
    }
  }

  static char[] findPath(int size, char[] oldPath) {
    char[] newPath = new char[oldPath.length];

    char first = (oldPath[0] == 'E' ? 'S' : 'E');
    buildNewPath(size, oldPath, newPath, 0, 0, 0, first);

    return newPath;
  }

  static boolean buildNewPath(int size, char[] oldPath, char[] newPath, int totalCount, int oldSCount, int newScount, char next) {

    if (totalCount == oldPath.length) {System.out.println("I reached the last!");return true;}

    newPath[totalCount] = next;
    if (next == 'S') {newScount++;}
    if (oldPath[totalCount] == 'S') {oldSCount++;}
    totalCount++;




    if (!isValid(size, totalCount, newScount, oldSCount, oldPath, 'S')) {
      if (isValid(size, totalCount, newScount, oldSCount, oldPath, 'E'))
        buildNewPath(size, oldPath, newPath, totalCount, oldSCount, newScount, 'E');
      else
        return false;
      } else {
        System.out.println("line 49");
        if(buildNewPath(size, oldPath, newPath, totalCount, oldSCount, newScount, 'S')) {
          return true;
        } else {
          return buildNewPath(size, oldPath, newPath, totalCount, oldSCount, newScount, 'E');
        }
      }

      return true;
  }

  static boolean isValid(int size, int totalCount, int newScount, int oldSCount, char[] oldPath, char test) {
    if (test == 'S' && newScount >= size - 1) {return false;}
    if (test == 'E' && totalCount - newScount >= size - 1) {return false;}
    if (newScount == oldSCount && oldPath[totalCount] == test) {return false;}
    return true;
  }


}
  