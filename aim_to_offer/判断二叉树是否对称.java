class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        return isSymmetrical(pRoot,pRoot);
    }
    boolean isSymmetrical(TreeNode pRootl,TreeNode pRootr){
        if(pRootl==null && pRootr==null){
            return true;
        }
        if(pRootl==null || pRootr==null){
            return false;
        }
        if(pRootl.val!=pRootr.val){
            return false;
        }
        return isSymmetrical(pRootl.left,pRootr.right) && isSymmetrical(pRootl.right,pRootr.left);
    }
}