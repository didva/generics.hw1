package school.lemon.changerequest.java.generics.task1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PairUtilsTest {

    @Test
    public void testEquals() {
        assertTrue(PairUtils.equals(new Pair<>("a", "b"), new Pair<>("a", "c")));
    }

    @Test
    public void testEqualsNull() {
        assertTrue(PairUtils.equals(null, null));
    }

    @Test
    public void testNotEquals() {
        assertFalse(PairUtils.equals(new Pair<>("a", "b"), new Pair<>("b", "c")));
    }

    @Test
    public void testNotEqualsWithNull() {
        assertFalse(PairUtils.equals(null, new Pair<>("b", "c")));
    }

    @Test
    public void testCompareGreater() {
        assertTrue(PairUtils.compare(new Pair<>(3, "c"), new Pair<>(1, "c")) > 0);
    }

    @Test
    public void testCompareLess() {
        assertTrue(PairUtils.compare(new Pair<>(1, "c"), new Pair<>(2, "c")) < 0);
    }

    @Test
    public void testCompareEquals() {
        assertEquals(0, PairUtils.compare(new Pair<>(1, "c"), new Pair<>(1, "d")));
    }

    @Test
    public void testGetValues() {
        Pair<String, String>[] pairs = new Pair[]{new Pair<>("a", "b"), new Pair<>("c", "d")};
        assertArrayEquals(new String[]{"b", "d"}, PairUtils.getValues(pairs));
    }

    @Test
    public void testGetKeys() {
        Pair<String, String>[] pairs = new Pair[]{new Pair<>("a", "b"), new Pair<>("c", "d")};
        assertArrayEquals(new String[]{"a", "c"}, PairUtils.getKeys(pairs));
    }

    @Test
    public void testCountGreaterThan() {
        Pair<Integer, String>[] pairs = new Pair[]{new Pair<>(1, "b"), new Pair<>(3, "d")};
        assertEquals(1, PairUtils.countGreaterThan(pairs, 2));
    }

    @Test
    public void testContainsUniqueObjects() {
        Pair<Integer, String>[] pairs = new Pair[]{new Pair<>(1, "b"), new Pair<>(3, "d")};
        assertTrue(PairUtils.containsUniqueObjects(pairs));
    }

    @Test
    public void testContainsNonUniqueObjects() {
        Pair<Integer, String>[] pairs = new Pair[]{new Pair<>(1, "b"), new Pair<>(1, "d")};
        assertFalse(PairUtils.containsUniqueObjects(pairs));
    }

}
