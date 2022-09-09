class Solution {
    public int longestConsecutive(int[] nums) {
         Set<Integer> set = new HashSet<>();
         for (int t : nums)
         {
            set.add(t);
         }
        
        int start=1;
        int ans=0,maxans=1;
        if(nums.length==0)
        {
            maxans=0;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            start=nums[i];
            if(set.contains(start-1)!=false)
            {
                continue;
            }
            while(set.contains(start)!=false)
            {
                start++;
            }
            ans=start-nums[i];
            maxans=Math.max(ans,maxans);
        }
        return maxans;
    }
}