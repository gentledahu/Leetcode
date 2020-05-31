class Solution {
    /*
    排序有序的数组，所以双指针解题
    时间复杂度：O(n)
    空间复杂度：O(1)
    */
    public int[] twoSum(int[] nums, int target) {
        if(nums.length<=1) return new int[0];
        int[] res = new int[2];
        int i=0,j=nums.length-1;
        while(i<j){
            while(nums[j]>target){
                j--;
                if(j==0) break;
            }
            int sum = nums[i]+nums[j];
            if(sum==target){
                res[0] = nums[i];
                res[1] = nums[j];
                break;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }

        return res;
    }
}