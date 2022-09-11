class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0,check=0;
        for (int i = 0; i < candies.length; i++)
        {
            if (candies[i] > max)
                max = candies[i];
        }
       // Boolean[] boolArray = new Boolean[candies.length];
         ArrayList<Boolean> list =  new ArrayList<Boolean>();
        for(int j=0;j<candies.length;j++)
        {
            check=candies[j]+extraCandies;
            if(max<=check)
            {
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}