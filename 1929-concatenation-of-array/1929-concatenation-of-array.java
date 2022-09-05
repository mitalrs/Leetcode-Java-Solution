class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length+nums.length;
        int []a=new int[n];
        int s=0;
        
        for(int i=0;i<n;i++)
        {
            a[i]=nums[s];
            s++;
            if(s==nums.length)
            {
                s=0;
            }
        }
        return a;
    }
}