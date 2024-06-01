package leetcode;
// +
// https://leetcode.com/problems/count-complete-tree-nodes/description/
public class Task222 {

    // 222. Count Complete Tree Nodes

    static public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode leftNode = new TreeNode(0);
        TreeNode rightNode = new TreeNode(0);
        TreeNode lastNode = new TreeNode(0);

        root.left = leftNode;
        root.right= rightNode;
        root.right.left = lastNode;

        System.out.println("Count nodes -> " + countNodes(root)); // 4
    }
}
