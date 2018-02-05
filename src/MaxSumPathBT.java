
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
public class MaxSumPathBT {
	int maxValue = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode A) {
       pathSum(A);
       return maxValue;
    }
    public int pathSum(TreeNode A){
        if(A==null){
            return 0;
        }
        int left = Math.max(pathSum(A.left),0);
        int right = Math.max(pathSum(A.right),0);
        maxValue = Math.max(maxValue,A.val+left+right);
        return A.val+Math.max(left,right);
    }
}
