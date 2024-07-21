package org.example.same_tree;

import org.example.binary_tree_inorder_traversal.TreeNode;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both nodes are null, so they're the same
        if (p == null && q == null) {
            return true;
        }

        // One node is null, the other isn't, so they're different
        if (p == null || q == null) {
            return false;
        }

        // If the values are different, the trees are different
        if (p.val != q.val) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
