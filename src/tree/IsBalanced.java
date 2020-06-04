class Solution {
    public boolean isBalanced(TreeNode root) {
        return recur(root)!=-1;
    }

    public int recur(TreeNode root){
        if(root==null) return 0;
        int left = recur(root.left);
        if(left==-1) return -1;
        int right = recur(root.right);
        if(right==-1) return -1;
        return Math.abs(left-right)>1?-1:Math.max(left,right)+1;
    }
}