class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String res = strs[0];
        for(int i=1;i<strs.length;i++){
            int j = 0;
            for(;j<res.length()&&j<strs[i].length();j++){
                if(res.charAt(j)!=strs[i].charAt(j)) break;
            }

            res = res.substring(0,j);
            if(res.equals("")) break;
        }
        return res;
    }
}