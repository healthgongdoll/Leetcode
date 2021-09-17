//LeetCode 46
class Solution {
    static List<List<Integer>> total;
    static ArrayList<Integer> answer;
    static boolean[] visited;
    static int size;
    public List<List<Integer>> permute(int[] nums) {
        
        size = nums.length;
        visited = new boolean[size];
        total = new ArrayList<>();
          answer = new ArrayList<>();
        backtracking(0,nums);
        return total;
    }
    public void backtracking(int curr,int[] num)
    {
        if(curr == size)
        {
        
            total.add((List<Integer>)answer.clone());
            return;
        }
        
        for(int i = 0; i<size;i++)
        {
            if(visited[i] != false)
            {
                continue;
            }
            visited[i] = true;
            System.out.print(num[i]);
            answer.add(num[i]);
            backtracking(curr+1,num);
            answer.remove(answer.size()-1);
            visited[i] = false;
        }
        System.out.println();
    }
}