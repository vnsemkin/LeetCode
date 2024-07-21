package org.example.binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-inorder-traversal/description/
public class BinaryTreeInorderTraversal {
    private List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.right);
            res.add(root.val);
            inorderTraversal(root.left);
        }
        return res;
    }
}
