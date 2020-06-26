class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null||head.next==null) return head;
        Set<Integer> set = new HashSet<>();
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        ListNode pre = dummy;
        while(cur!=null){
            if(set.contains(cur.val)){
               pre.next = cur.next;
               cur = pre.next;
            }else{
                set.add(cur.val);
                cur = cur.next;
                pre = pre.next;
            }
        } 
        return dummy.next;
    }
}