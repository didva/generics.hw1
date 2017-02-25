package school.lemon.changerequest.java.generics.task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayBasedContainerTest {

    private ArrayBasedContainer<Integer> container;

    @Before
    public void init() {
        container = new ArrayBasedContainer<>();
    }

    @Test
    public void testAdd() {
        Integer[] elements = {1, 2, 3, 4};
        for (Integer element : elements) {
            container.add(element);
        }
        assertEquals(elements.length, container.size());
        for (int i = 0; i < elements.length; i++) {
            assertEquals(elements[i], container.get(i));
        }
    }

    @Test
    public void testAddByIndex() {
        assertTrue(container.add(1, 0));
        assertTrue(container.add(2, 1));
        assertTrue(container.add(0, 0));
        assertFalse(container.add(3, 4));

        assertEquals(3, container.size());
        assertEquals(0, (int) container.get(0));
        assertEquals(1, (int) container.get(1));
        assertEquals(2, (int) container.get(2));
    }

    @Test
    public void testRemove() {
        Integer[] elements = {1, 2, 3, 4};
        for (Integer element : elements) {
            container.add(element);
        }
        assertFalse(container.remove(elements.length));
        assertTrue(container.remove(0));
        assertTrue(container.remove(elements.length - 2));

        Integer[] expectedElements = {2, 3};
        assertEquals(2, container.size());
        for (int i = 0; i < expectedElements.length; i++) {
            assertEquals(expectedElements[i], container.get(i));
        }
    }

    @Test
    public void testClear() {
        Integer[] elements = {1, 2, 3, 4};
        for (Integer element : elements) {
            container.add(element);
        }
        container.clear();
        assertEquals(0, container.size());
    }

}
