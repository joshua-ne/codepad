import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();  
        for (int i = 1; i <= t; ++i) { 
        	int N = in.nextInt();
        	int L = in.nextInt();

        	Set<String> wordSet = new HashSet<>(N);
        	List<Set<Character>> charSets = new ArrayList<>(L);
        	for (int j = 0; j < L; j++) {
        		charSets.add(new HashSet<Character>());
        	}

        	for (int j = 0; j < N; j++) {
        		String str = in.next();
        		wordSet.add(str);
        		for (int k = 0; k < str.length(); k++){
        			charSets.get(k).add(str.charAt(k));
        		}
        	}

        	
			
			String res = buildAWord("", charSets, wordSet, L);
        	
            System.out.println("Case #" + i + ": " + res);
        }
    }

    static String buildAWord(String str, List<Set<Character>> charSets, Set<String> wordSet, int L) {
    	if (str.length() == L) {
    		if (wordSet.contains(str)) {
    			return "-";
    		} 
    		return str;
    		
    	}

    	for (Character c : charSets.get(str.length())) {
    		
    		String s = buildAWord(str + c, charSets, wordSet, L);
    		if (s != "-") return s;
    	}
    	return "-";

    }
}