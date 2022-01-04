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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode>queue = new LinkedList();
        
        queue.offer(root);
        if(root == null)
        {
            return answer;
        }
        while(!queue.isEmpty())
        {
            int size = queue.size();
            List sub = new ArrayList<>();
            for(int i = 0; i<size;i++)
            {
                TreeNode current = queue.poll();
                sub.add(current.val);
                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
            answer.add(sub);
        }
        return answer;
        
    }
}