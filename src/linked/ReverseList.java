class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode cur = head;
        ListNode preNode = null;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = preNode;
            preNode = cur;
            cur = next;
        }

        return preNode;
    }
}