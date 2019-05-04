import java.util.*;

class Solution1{
    int N, L;
    ArrayList<HashSet<Character>> chars;
    HashSet<String> allWords;

    String build(String base){
        if(base.length()==L){
            if(allWords.contains(base)){
                return "-";
            }else{
                return base;
            }
        }

        for(char c : chars.get(base.length())){
            String s = build(base+c);
            if(s != "-"){ return s; }
        }

        return "-";
    }

    void run(){
        Scanner cin = new Scanner(System.in); 
        
        int T = cin.nextInt();
        for(int t=0; t<T; t++){
            N = cin.nextInt();
            L = cin.nextInt();
            cin.nextLine();

            chars = new ArrayList<>();
            for(int i=0; i<L; i++){
                chars.add(new HashSet<Character>(N));
            }

            allWords = new HashSet<>(N);
            for(int i=0; i<N; i++){
                allWords.add(cin.nextLine());
            }

            for(String str : allWords){
                for(int i=0; i<L; i++){
                    chars.get(i).add(str.charAt(i));
                }
            }

            System.out.printf("Case #%d: %s\n", t+1, build(""));
        }

        cin.close();
    }

    public static void main(String[] args){
        Solution1 solution = new Solution1();         
        solution.run();
    }
}