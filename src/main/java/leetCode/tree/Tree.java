package leetCode.tree;

import leetCode.model.TreeNode;

public class Tree {

    public int maxDepth(TreeNode root) {
       if(root == null)
           return 0;

        return 1 + Math.max(maxDepth(root.getLeft()) , maxDepth(root.getRight()));
    }
}
