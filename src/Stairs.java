
public class Stairs {
	public int climbStairs(int A) {
        if(A<=0){
            return 0;
        }
        else if(A==1){
            return 1;
        }
        else if(A==2){
            return 2;
        }
        int a = 0;
        int b = 1;
        int c = 2;
        for(int i=2;i<A;i++){
            a = b+c;
            b = c;
            c = a;
        }
        return a;
    }
}
