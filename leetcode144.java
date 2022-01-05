/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        
        dfs(root, answer);
        
        return answer;
    }
    public List<Integer> dfs(TreeNode root, List<Integer> list1)
    {
        if(root == null)
        {
            return null;
        }else
        {
            list1.add(root.val);
            dfs(root.left,list1);
            dfs(root.right,list1);
        }
        return list1;
    }

    
}