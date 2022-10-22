class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        if(n==1)
        {
            return 1;
        }
       
        int l=0,count=1,ans=0;
         int appears = Math.round(nums.length/2)+1;
         Arrays.sort(nums);
         
         for(int r=0;r<nums.length;r++)
         {
            if(nums[l]!=nums[r])
            {
                l=r;
                count =1;
            }
            else if(nums[l]==nums[r])
            {
                count++;
            }
            if(appears==count)
            {
                ans =nums[l];
            }
         }
          return ans;
        
    }
}