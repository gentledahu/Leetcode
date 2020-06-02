class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode pre = node;
        ListNode tail = node;
        while(true){
            int count = k;
            while(tail!=null&&count>0){
                tail =tail.next;
                count--;
            }

            if(tail==null) break;
            ListNode first = pre.next;
            while(pre.next!=tail){
                ListNode cur = pre.next;
                pre.next = cur.next;
                cur.next = tail.next;
                tail.next = cur;
            }
            pre = first;
            tail = pre;
        }
        return node.next;
    }
}