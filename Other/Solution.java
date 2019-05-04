import java.util.*;
import java.io.*;


public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    List<Integer> primeLibrary = new ArrayList<>();
    int abc = 0;
    int curLargest = 0;

    for (int i = 1; i <= t; ++i) {
      int largest = in.nextInt();
      int count = in.nextInt();

      int[] numList = new int[count];


      
      for (int j = 0; j < count; j++) {
        numList[j] = in.nextInt();
      }

      

      


      

      
      for (int k = primeLibrary.isEmpty() ? 3 : primeLibrary.get(abc - 1); k <= largest; k += 2) {
          if (isPrime(k)) {primeLibrary.add(k); abc++;}
        }
      


      List<Integer> primeList = new ArrayList<>();
      for (int k : numList) {
        for (int a : primeLibrary) {
          if (k % a == 0) {
            if (!primeList.contains(a)) primeList.add(a);
            if (!primeList.contains(k/a)) primeList.add(k / a);
            break;
          }
        }

        if (primeList.size() == 26) break;
      }

      Collections.sort(primeList);
      int[] resInt = new int[count + 1];
      char[] res = new char[count + 1];

      int secondNum = 0;
      for (int x : primeList) {
        if (numList[0] % x == 0 && numList[1] % x == 0) {
          secondNum = x;
          break;
        }
      }

      resInt[0] = numList[0] / secondNum;
      resInt[1] = secondNum;

      for (int x = 2; x < count + 1; x++) {
        resInt[x] = numList[x - 1] / resInt[x - 1];
      }

      for (int x = 0; x < res.length; x++) {
        res[x] = (char)(primeList.indexOf(resInt[x]) + 'A');
      }


      //System.out.println(primeList);
      System.out.println("Case #" + i + ": " + new String(res));
    }
  }


    static boolean isPrime(int n) {
      //check if n is a multiple of 2
      if (n%2==0) return false;
      //if not, then just check the odds
      for(int i=3;i*i<=n;i+=2) {
          if(n%i==0)
              return false;
      }
      return true;
    }
  



}
  