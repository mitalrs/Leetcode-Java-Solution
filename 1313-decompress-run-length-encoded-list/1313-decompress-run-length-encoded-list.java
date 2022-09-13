class Solution {
    public int[] decompressRLElist(int[] nums) {
        //ArrayList<Integer> decompressed = new ArrayList<Integer>();
        int n=0;
        
        for(int t=0;t<nums.length-1;t++)
        {
            n+=nums[t];
            t++;
        }
        
        int []decompressed=new int[n];
        int freq=0,val=0,st=0;
        
        for(int i=0;i<nums.length;i++)
        {
            freq=nums[i];
            val=nums[i+1];
            
             while(freq!=0)
            {
               decompressed[st]=val; 
               
               st++;
               freq--;
            }
            i++;
        }
        return decompressed;
    }
}
//[65,44,72,15]