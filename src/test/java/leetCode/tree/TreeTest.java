package leetCode.tree;

import leetCode.model.TreeNode;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TreeTest {


    @Test
    void maxDepthTest(){
        Tree t = new Tree();
        Integer[] rootArray = new Integer[] {3,9,20,null,null,15,7};
        assertEquals(3,t.maxDepth(createCompleteBinaryTree(rootArray)) );
    }

    @Test
    void maxDepthTest1(){
        Tree t = new Tree();
        Integer[] rootArray = new Integer[] {1,null,2};
        assertEquals(2,t.maxDepth(createCompleteBinaryTree(rootArray)) );
    }

    TreeNode createCompleteBinaryTree(Integer[] rootArray) {
        TreeNode tree = new TreeNode();
//
        tree = traverseAndReplace(tree, 0, rootArray);
        return tree;
    }

    TreeNode traverseAndReplace(TreeNode root, int index, Integer[] rootArray) {
        if (index < rootArray.length) {
            if(rootArray[index] != null) {
                root = new TreeNode(rootArray[index]);
                root.setLeft(traverseAndReplace(root.getLeft(), (2 * index + 1), rootArray));
                root.setRight(traverseAndReplace(root.getRight(), (2 * index + 2), rootArray));
            }
        }
        return root;
    }
}