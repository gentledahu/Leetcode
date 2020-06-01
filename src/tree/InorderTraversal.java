class Solution {

    //解法一：递归
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return res;
    }

    public void inOrder(TreeNode root){
        if(root==null) return ;
        inOrder(root.left);
        res.add(root.val);
        inOrder(root.right);
    }

    //解法二：借助栈迭代
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur =cur.right;
        }
        return res;
    }
}