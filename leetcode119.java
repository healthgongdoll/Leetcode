class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> newList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i<rowIndex+1;i++)
        {
            for(int j = 0; j<=i; j++)
            {
                if(j==0)
                {
                    newList.add(1);
                }
                
                else if(j == i)
                {
                    newList.add(1);
                }else
                {
                    newList.add(temp.get(j-1)+temp.get(j));  
                }
            }
            temp = new ArrayList<>(newList); //배열을 그대로 복사
            newList = new ArrayList<>();
        }
        
        return temp;
        
    }
}