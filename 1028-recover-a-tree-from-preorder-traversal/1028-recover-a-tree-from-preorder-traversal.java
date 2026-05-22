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
    static int in=0;
    public TreeNode recoverFromPreorder(String traversal) 
    {
        in=0;
        return help(traversal,0);
    }
    public TreeNode help(String t,int d)
    {
        if(in>=t.length())
        {
            return null;
        }
        int dc=0;
        while((in+dc)<t.length() && t.charAt(in+dc)=='-')
        {
            dc++;
        }
        if(dc!=d)
        {
            return null;
        }
        in+=dc;
        int v=0;
        while(in<t.length() && Character.isDigit(t.charAt(in)))
        {
            v=v*10+(t.charAt(in++)-'0');
        }
        TreeNode n=new TreeNode(v);
        n.left=help(t,d+1);
        n.right=help(t,d+1);

        return n;
    }
}