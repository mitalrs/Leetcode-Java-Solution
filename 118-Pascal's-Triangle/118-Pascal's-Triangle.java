import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        // for(int row=0;row<numRows.length;row++)
        // {
        //     for(int col=0;col<numRows[row].length;col++)
        //     {
        //         if(col==0 || col==numRows[row].length-1)
        //         {
        //            numRows[row][col]=1; 
        //         }
        //     }
        // }

         List<List<Integer>> lists = new ArrayList<>();
        // int numRows = 5,p1=0,p2=0;
        int p1=0,p2=0;
        
        for(int i=0;i<numRows;i++){
             lists.add(new ArrayList<>());
            for(int j=0;j<i;j++){
                if(i==0 || i==1){
                   lists.add(List.of(1)); 
                }else{
                    if(j==0 || j==i-1){
                       lists.add(List.of(1));  
                    }else{
                        p1=lists.get(i-1).get(j-1);
                        p2=lists.get(i-1).get(j);
                        lists.add(List.of(p1+p2));
                    }
                }
                
            }
        }
        
        // lists.forEach(System.out::println);
        
    
       return lists; 
    }
}





//  List<List<Integer>> lists = new ArrayList<>();
//         int numRows = 5,p1=0,p2=0;
        
//         for(int i=0;i<numRows;i++){
//              lists.add(new ArrayList<>());
//             for(int j=0;j<i;j++){
//                 if(i==0 || i==1){
//                    lists.add(List.of(1)); 
//                 }else{
//                     if(j==0 || j==i-1){
//                        lists.add(List.of(1));  
//                     }else{
//                         p1=lists.get(i-1).get(j-1);
//                         p2=lists.get(i-1).get(j);
//                         lists.add(List.of(p1+p2));
//                     }
//                 }
                
//             }
//         }
        
//         lists.forEach(System.out::println);
        
// 	}




