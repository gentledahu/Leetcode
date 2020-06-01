class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return res;
    }

    public void preOrder(TreeNode root){
        if(root==null) return;
        res.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}