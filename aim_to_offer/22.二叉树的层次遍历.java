import java.util.ArrayList;
import java.util.LinkedList;          //linkedList implements List<E>, Deque<E>, Cloneable, java.io.Serializable
import java.util.Queue;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root==null)
            return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();//用链表模拟队列
        queue.offer(root);
        while(queue.size()!=0){
            TreeNode treeNode = queue.poll();
            if(treeNode.left!=null)
                queue.offer(treeNode.left);
            if(treeNode.right!=null)
                queue.offer(treeNode.right);
            list.add(treeNode.val);
        }
        return list;
    }
}