class Solution {
    public int pivotIndex(int[] nums) {
        int tsum=0,csum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            tsum+=nums[i];
        }
        for(int j=0;j<nums.length;j++)
        {
            tsum-=nums[j];
            
            if(csum==tsum)
            {
                return j;
            }
            csum += nums[j];
        }
        return -1;
    }
}