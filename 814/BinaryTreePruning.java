/**
 * 经典的递归问题
 * containsOne判断节点的根所在的子树是否包含1
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        return containsOne(root)?root:null;
    }
    public boolean containsOne(TreeNode node){
        if(node==null) return false;
        boolean a1=containsOne(node.left);
        boolean a2=containsOne(node.right);
        if(!a1) node.left=null;
        if(!a2) node.right=null;
        return node.val==1||a1||a2;
    }
}