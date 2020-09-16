package topinterviewquestions.easy.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> res=new ArrayList<>();
        List<TreeNode> temp= new ArrayList<>();
        temp.add(root);
        while (temp.size()>0){
            List<Integer> values=new ArrayList<>();
            List<TreeNode> leaves=new ArrayList<>();
            for (TreeNode node :temp){
                values.add(node.val);
                if (node.left!=null){
                    leaves.add(node.left);
                }
                if (node.right!=null){
                    leaves.add(node.right);
                }
            }
            res.add(values);
            temp=leaves;
        }
        return res;
    }
}
