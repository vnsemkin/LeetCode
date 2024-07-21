import org.example.binary_tree_inorder_traversal.BinaryTreeInorderTraversal;
import org.example.binary_tree_inorder_traversal.TreeNode;
import org.example.plus_one.PlusOne;
import org.example.remove_duplicates.ListNode;
import org.example.remove_duplicates.RemoveDuplicatesFromArray;
import org.example.remove_duplicates.RemoveDuplicatesFromList;
import org.example.remove_element.RemoveElement;
import org.example.same_tree.SameTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeTest {

    @Test
    public void shouldReturnElementsNumber() {
        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = RemoveDuplicatesFromArray.removeDuplicates(array);
        System.out.println(i);
    }

    @Test
    public void shouldRemoveElements() {
        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = RemoveElement.removeElement(array, 3);
        System.out.println(i);
    }

    @Test
    public void shouldIncreaseNumberByOne() {
        PlusOne.plusOne(new int[]{9, 8, 9});
    }

    @Test
    public void shouldRemoveDuplicatesFromList() {
        ListNode actual = new ListNode(1, new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode head = RemoveDuplicatesFromList.deleteDuplicates(actual);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    @Test
    public void shouldReturnListFromTreeInorderedTraversal() {
        List<Integer> expected = List.of(1, 3, 2);
        TreeNode node =
                new TreeNode(1,
                        new TreeNode(2, null, new TreeNode(3, null, null)), null);

        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        List<Integer> actual = binaryTreeInorderTraversal.inorderTraversal(node);

        System.out.println("Actual:" + actual);
        System.out.println("Expected:" + expected);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnIsThreeTheSame() {
        TreeNode node1 =
                new TreeNode(1,
                        new TreeNode(2, null,
                                new TreeNode(3, null, null)), null);
        TreeNode node2 =
                new TreeNode(1,
                        new TreeNode(2, null,
                                new TreeNode(3, null, null)), null);

        SameTree sameTree = new SameTree();
        boolean isEquals = sameTree.isSameTree(node1,node2);

        assertTrue(isEquals);
    }
}

