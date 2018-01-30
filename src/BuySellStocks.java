
public class BuySellStocks {
	public int maxProfit(final int[] A) {
        if(A.length==0){
            return 0;
        }
        int buy = A[0];
        //int sell = A[0];
        int profit = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]<=buy){
                buy = A[i];
                //sell = A[i];
            }
            else if(A[i]>buy){
                //sell = A[i];
                profit = Math.max(profit,A[i]-buy);
            }
        }
        /*if(buy==sell){
            profit = 0;
        }*/
        return profit;
    }
}
