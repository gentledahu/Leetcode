class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //添加哨兵节点
        ListNode node = new ListNode(-1);
        ListNode p = l1,q = l2,cur = node;
        int jinwei = 0;
        while(p!=null||q!=null){
            int x = p==null?0:p.val;
            int y = q==null?0:q.val;
            int sum = x+y+jinwei;
            jinwei = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            if(p!=null) p = p.next;
            if(q!=null) q = q.next;
        }
        if(jinwei>0){
            cur.next = new ListNode(jinwei);
        }
        return node.next;
    }
}