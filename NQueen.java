class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[] resArray = new int[n];
        void solveNQueens(resArray, 0);
        System.out.println(resArray);
        return convertResult(resArray);
    }

    void solveNQueens(int[] resArray, int currentRow) {
    	int n = resArray.length;

    	if (currentRow == n) return;

    	for (int i = 0; i < n; i++) {
    		resArray[currentRow] = i;
    		if (checkValidity(resArray, currentRow)) {
    			solveNQueens(resArray, currentRow + 1);
    		}
    	}
    }

    boolean checkValidity(int[] resArray, int currentRow) {

    	int curCol = resArray[currentRow];
    	for (int i = 0; i < currentRow; i++) {
    		if (curCol == resArray[i] + (currentRow - i) || curCol == resArray[i] + (currentRow + i)) {
    			return false;
    		}
    	}
    	return true;
    }

    List<List<String>> convertResult (int[] resArray) {
    	List<List<String>> res = new ArrayList<ArrayList<String>>();
    	return res;
    }
}