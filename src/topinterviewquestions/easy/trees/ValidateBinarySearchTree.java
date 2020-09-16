package topinterviewquestions.easy.trees;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer bottom, Integer top) {
        if (node == null) {
            return true;
        }
        if (top != null && node.val >= top) {
            return false;
        }
        if (bottom != null && node.val <= bottom) {
            return false;
        }
        if (!helper(node.right, node.val, top)) {
            return false;
        }
        if (!helper(node.left, bottom, node.val)) {
            return false;
        }
        return true;
    }
}
