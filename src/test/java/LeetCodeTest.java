import org.example.plus_one.PlusOne;
import org.example.remove_duplicates.ListNode;
import org.example.remove_duplicates.RemoveDuplicatesFromArray;
import org.example.remove_duplicates.RemoveDuplicatesFromList;
import org.example.remove_element.RemoveElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
    public void shouldIncreaseNumberByTwo() {
        ListNode actual = new ListNode(1, new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode expected = RemoveDuplicatesFromList.deleteDuplicates(actual);
        ListNode head = expected;
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}

