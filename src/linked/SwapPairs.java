class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode first = node;
        while(first.next!=null){
            ListNode left = first.next;
            ListNode right =left.next;
            if(right==null)break;
            left.next = right.next;
            first.next = right;
            right.next = left;
            first = left;            
        }
        return node.next;

    }
}