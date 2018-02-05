
public class MaxSumAdj {
	public int adjacent(int[][] A) {
        int curr_sum = Math.max(A[0][0],A[1][0]);
        int prev_ele = 0;
        int curr_ele = 0;
        for(int i=1;i<A[0].length;i++){
            curr_ele = Math.max(prev_ele,curr_sum);
            curr_sum = prev_ele + Math.max(A[0][i],A[1][i]);
            prev_ele = curr_ele;
        }
        return Math.max(prev_ele,curr_sum);
    }
}
