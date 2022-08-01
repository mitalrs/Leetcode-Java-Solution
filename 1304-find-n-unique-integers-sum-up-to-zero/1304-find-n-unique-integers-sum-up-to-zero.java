class Solution {
    public int[] sumZero(int n) {
        int []an = new int[n];
    
//         int sum=0;
        int a=1;
//         for(int i=0;i<n-1;i++)
//         {
//             an[i]=a;
            
//             sum+=a;
//             a++;
//         }
//         an[n-1]=-sum;
        
//     return an;
        
        if(n%2==0)
        {
            for(int i=0;i<n;i++)
            {
                an[i]=a;
                an[i+1]=-a;
                a++;
                i++;
            }
        }
        else{
            for(int i=0;i<n-1;i++)
            {
                an[i]=a;
                an[i+1]=-a;
                a++;
                i++;
            }
            an[n-1]=0;
        }
        return an;
    }
}