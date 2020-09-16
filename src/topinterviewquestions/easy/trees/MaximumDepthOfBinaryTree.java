package topinterviewquestions.easy.trees;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return depth(root, 0);
    }

    public int depth(TreeNode root, int dep) {
        if (root == null) {
            return dep;
        }
        dep++;
        int left = depth(root.left, dep);
        int right = depth(root.right, dep);
        return Math.max(left, right);
    }

}
