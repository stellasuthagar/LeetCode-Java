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
    public int deepestLeavesSum(TreeNode root) 
    {
        int ans=0,i;
        LinkedList<TreeNode> l=new LinkedList<TreeNode>();
        l.add(root);
        while(!l.isEmpty())
        {
            for(i=l.size()-1,ans=0;i>=0;--i)
            {
                TreeNode h=l.poll();
                ans+=h.val;
                if(h.right!=null)
                {
                    l.add(h.right);
                }
                if(h.left!=null)
                {
                    l.add(h.left);
                }
            }
        }
        return ans;
    }
}