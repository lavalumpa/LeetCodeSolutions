package topinterviewquestions.easy.trees;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createdTree(nums,0,nums.length);
    }

    public TreeNode createdTree(int []nums,int bottom, int top){
        if (bottom>=top){
            return null;
        }
        int mid=(top+bottom)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.right=createdTree(nums,mid+1,top);
        node.left=createdTree(nums,bottom,mid);
        return node;
    }
}
