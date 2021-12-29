class Solution {
    public List<List<Integer>> generate(int numRows) {
        int count = 1;
         List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0; i<numRows;i++)
        {
            for(int j = 0; j<=i; j++)
            {
               
                if(j == 0)
                {
                    list.add(1);
                }
                else if(i == j)
                {
                    list.add(1);
                }else
                {
                    list.add(temp.get(j-1)+temp.get(j));
                }
            }
            System.out.println(list);
            answer.add(list);
            temp = new ArrayList<>(list);
            list = new ArrayList<>();
        }
        return answer;
    }
}