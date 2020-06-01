class Solution {
    //解法一：两次遍历
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(-1);
        ListNode cur = node;
        cur.next = head;
        int len = 0;
        //求得链表长度
        while(cur.next!=null){
            len++;
            cur = cur.next;
        }
        cur = node;
        //需要走的步长
        int step = len-n;
        while(step>0){
            cur = cur.next;
            step--;
        }
        cur.next = cur.next.next;
        return node.next;
    }

    //解法二：双指针，一次遍历
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode node = new ListNode(-1);
        ListNode first = node;
        ListNode second = node;
        node.next = head;
        while(n>=0){
            first =first.next;
            n--;
        }
        while(first!=null){
            first = first.next;
            second =second.next;
        }
        second.next = second.next.next;
        return node.next;
        
    }
}