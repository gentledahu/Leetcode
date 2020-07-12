class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length-k+1];
        for(int i=0;i<k;i++){
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]) deque.removeLast();
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        for(int i=k;i<nums.length;i++){
            if(nums[i-k]==deque.peekFirst()) deque.removeFirst();
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]) deque.removeLast();
            deque.addLast(nums[i]);
            res[i-k+1] = deque.peekFirst();
        }
        return res;
    }
}