
public class UniqueBinarySearchTreesII {
	public int numTrees(int A) {
        if(A<0){
            return 0;
        }
        int[] ans = new int[A+1];
        ans[0] = 1;
        ans[1] = 1;
        for(int i=2;i<=A;i++){
            for(int j=0;j<=i-1;j++){
                ans[i] += ans[j] * ans[i-j-1];
            }
        }
        return ans[A];
    }
}
