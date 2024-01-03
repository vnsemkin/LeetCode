import org.example.plus_one.PlusOne;
import org.example.remove_duplicates.RemoveDuplicates;
import org.example.remove_element.RemoveElement;
import org.junit.jupiter.api.Test;

public class LeetCodeTest {

    @Test
    public void shouldReturnElementsNumber() {
        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = RemoveDuplicates.removeDuplicates(array);
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
        PlusOne.plusOne(new int[]{9,8,9});
    }
}
