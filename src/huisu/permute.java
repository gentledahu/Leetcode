class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums==null||nums.length==0) return res;
        recur(0,nums);
        return res;

    }

    public void recur(int i,int[] nums){
        if(i==nums.length-1){
            List<Integer> list = new ArrayList<>();
            for(int num:nums) list.add(num);
            res.add(list);
            return ;
        }

        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            recur(i+1,nums);
            swap(nums,i,j);
        }
    }

    public void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}