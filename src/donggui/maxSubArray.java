class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int num:nums){
            if(sum<=0) sum = num; //总和<=0于结果无增益，直接等于当下数字
            else sum += num;
            max = max<sum?sum:max;
        }
        return max;
    }
}