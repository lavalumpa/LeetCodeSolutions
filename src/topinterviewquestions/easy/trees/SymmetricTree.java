package topinterviewquestions.easy.trees;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return isEqualMirror(root.left,root.right);
    }

    public boolean isEqualMirror(TreeNode left, TreeNode right){
        if (left==null ^ right==null) return false;
        if (left == null) return true;
        return (left.val==right.val)
                && isEqualMirror (left.left,right.right)
                && isEqualMirror(left.right,right.left);
    }
}
