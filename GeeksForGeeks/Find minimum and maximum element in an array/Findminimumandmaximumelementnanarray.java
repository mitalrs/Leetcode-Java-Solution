class Compute 
{
    static pair getMinMax(long a[], long n)  
     {
        //long []arr= new long [2];
    //     //Write your code here
        long mx=0;
        long mn=0;
        
    //     // for (int i = 1; i < a.length; i++)
    //     // {

    //     //      mn = Math.min(mn, a[i]);
    //     //      mx = Math.max(mx, a[i]);
    //     // }
        
        // for(int i=0;i<n-1;i++)
        // {
        //     mx=a[i];
        //     if(mx<a[i+1])
        //     {
        //         mx=a[i+1];
        //     }
    
        //     mn=a[i];
        //     if(mn>a[i+1])
        //     {
        //         mn=a[i+1];
        //     }
        // }
        
        pair p=null;
        Arrays.sort(a);
        // long mn=a[0];
        // long mx=a[];
        
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                mn=a[i];
            }
            if(i==n-1)
            {
                mx=a[i];
            }
        }
        
        p=new pair(mn,mx);
        return p;
        // arr[0]=a[0];
        // arr[1]=a[n-1];
        // return arr;
    
    }
}
