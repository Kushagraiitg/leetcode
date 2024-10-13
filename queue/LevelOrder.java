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
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root==null){
            return arr;
        }
        q.add(root);
        while(!q.isEmpty()){
            int t = q.size();
            List<Integer> temp = new ArrayList<Integer>();
            for(int i=0;i< t;i++){
                TreeNode tempo = q.poll();
                if(tempo.left!=null){
                    q.add(tempo.left);
                }
                if(tempo.right!=null){
                    q.add(tempo.right);
                }
                temp.add(tempo.val);
            }
            arr.add(temp);
        }
        return arr;
    }
}
