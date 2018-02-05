
public class BuySellStocksII {
	public int maxProfit(final int[] A) {
        int maxProfit = 0;
        int diff = Integer.MIN_VALUE;
        for(int i=1;i<A.length;i++){
            diff = A[i]-A[i-1];
            if(diff>0){
                maxProfit = maxProfit+diff;
            }
        }
        return maxProfit;
    }
}
