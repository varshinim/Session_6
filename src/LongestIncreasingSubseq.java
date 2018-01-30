
public class LongestIncreasingSubseq {
	public int lis(final int[] A) {
        if(A.length==0){
            return 0;
        }
        if(A.length==1){
            return 1;
        }
        int[] arr = new int[A.length];
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = 1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(A[i]>A[j] && arr[i]<arr[j]+1){
                    arr[i] = arr[j]+1;
                }
            }
        }
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}
