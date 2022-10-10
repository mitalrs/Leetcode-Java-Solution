class Solution {
    public int maxProfit(int[] prices) {
//         int c=0,bestselling=0;
       
//         for(int b=c;b<prices.length;b++)
//         {
//         for(int s=b+1;s<prices.length;s++)
//         {
//             if(b<s)
//             {
//                 bestselling+=(s-b);
//                 c=s+1;
//             }
//         }
//         }
//         return bestselling;
        
        int bestselling=0;
        
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                bestselling+=(prices[i]-prices[i-1]);
            }
        }
        return bestselling;
    }
}