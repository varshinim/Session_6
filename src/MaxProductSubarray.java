
public class MaxProductSubarray {
	public int maxProduct(final int[] A) {
        int[] max_arr = new int[A.length];
        int[] min_arr = new int[A.length];
        max_arr[0] = A[0];
        min_arr[0] = A[0];
        int max_value = A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>0){
                max_arr[i] = Math.max(A[i],max_arr[i-1]*A[i]);
                min_arr[i] = Math.min(A[i],min_arr[i-1]*A[i]); 
            }
            else{
                max_arr[i] = Math.max(A[i],min_arr[i-1]*A[i]);
                min_arr[i] = Math.min(A[i],max_arr[i-1]*A[i]); 
            }
            max_value = Math.max(max_value,max_arr[i]);
        }
        return max_value;
    }
}
