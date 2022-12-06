class Solution {
    public void setZeroes(int[][] mt) {
        
	    int m = mt.length, n = mt[0].length;
        boolean r=false, c=false, er=false,ec=false;


        //row
         if(m==1){
             for(int i=0; i<n; i++){
                 if(mt[0][i]==0){
                     er=true;
                 }
             }
         }
         if(er){
              for(int i=0; i<n; i++){
                 mt[0][i]=0;
             }
         }
       

       
       //coloum
        if(n==1){
             for(int i=0; i<m; i++){
                 if(mt[i][0]==0){
                     ec=true;
                 }
             }
         }
         if(ec){
              for(int i=0; i<m; i++){
                 mt[i][0]=0;
             }
         }


         //matrix logic

        for(int j=0; j<m; j++){
            if(mt[0][j]==0){
                r= true;
                break;
            }

        }

        for(int i=0; i<n; i++){
            if(mt[i][0]==0){
                c=true;
                break;
            }
        }

        for(int i=0; i<m; i++){
            for(int j=i; j<n; j++){
                if(mt[i][j]==0){
                    mt[i][0]=0;
                    mt[0][j]=0;
                }
            }
        }

        for(int i=1; i<m; i++){
            if(mt[i][0]==0){
                for(int j=1; j<n; j++){
                    mt[i][j]=0;
                }
            }
        }

        for(int j=1; j<n; j++){
            if(mt[0][j]==0){
                for(int i=1; i<m; i++){
                    mt[i][j]=0;
                }
            }
        }
        if(c){
             for(int i=0; i<m; i++){
                 mt[i][0]=0;
             }
         }
        if(r){
             for(int j=0; j<n; j++){
                 mt[0][j]=0;
             }
         }

    // return mt;
    }
}
