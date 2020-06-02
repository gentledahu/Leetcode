class Solution {
    //迭代解法
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    public boolean isMirror(TreeNode l,TreeNode r){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(l);
        queue.add(r);
        while(!queue.isEmpty()){
            l = queue.poll();
            r = queue.poll();
            if(l==null&&r==null){
                continue;
            }
            if(l==null||r==null||l.val!=r.val){
                return false;
            }
            queue.add(l.left);
            queue.add(r.right);
            queue.add(l.right);
            queue.add(r.left);
        }
        return true;
    }

    //递归解法
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root,root);
    }

    public boolean isSymmetric(TreeNode r1,TreeNode r2){
        if(r1==null&&r2==null) return true;
        if(r1==null||r2==null) return false;
        return r1.val==r2.val&&isSymmetric(r1.left,r2.right)&&isSymmetric(r1.right,r2.left);
    }

}