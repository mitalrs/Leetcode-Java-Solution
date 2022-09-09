class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int seq=1;
        int ans=1;
        
        if(nums.length==0)
        {
            ans=0;
        }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
                seq++;
            }
            else if(nums[i]==nums[i-1])
            {
                continue;
            }
            else{
                seq=1;
            }
            ans=Math.max(ans,seq);
        }
        return ans;
    }
}