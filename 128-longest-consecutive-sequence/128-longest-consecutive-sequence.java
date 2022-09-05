class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        // int n=nums.length;
        int seq=1,mxseq=1;
        
       
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
            
            if(mxseq<=seq)
            {
                mxseq=seq;
            }
            
        }
        
         if(nums.length==0)
        {
            mxseq=0;
        }
        
        return mxseq;
    }
}