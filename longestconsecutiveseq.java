class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)set.add(num);
        for(int num:nums){
            int count=1;
            if(!set.contains(num-1)){
            while(set.contains(num+1)){
                num++;
                count++;
            }
            ans=Math.max(count,ans);
        }
        }
        return ans;
        
    }
}
