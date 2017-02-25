package school.lemon.changerequest.java.generics.task1;

import java.util.Objects;

public final class PairUtils {

    private PairUtils() {
    }

    public static <K, V> boolean equals(Pair<K, V> left, Pair<K, V> right) {
        if (left == right) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return Objects.equals(left.getKey(), right.getKey());
    }

    public static <K extends Comparable<K>, V> int compare(Pair<K, V> left, Pair<K, V> right) {
        if (left == null || right == null || left.getKey() == null || right.getKey() == null) {
            throw new IllegalArgumentException();
        }
        return left.getKey().compareTo(right.getKey());
    }

    public static <K, V> V[] getValues(Pair<K, V>[] pairs) {
        if (pairs == null) {
            throw new IllegalArgumentException();
        }
        V[] values = (V[]) new Object[pairs.length];
        for (int i = 0; i < pairs.length; ++i) {
            values[i] = pairs[i].getValue();
        }
        return values;
    }

    public static <K, V> K[] getKeys(Pair<K, V>[] pairs) {
        if (pairs == null) {
            throw new IllegalArgumentException();
        }
        K[] keys = (K[]) new Object[pairs.length];
        for (int i = 0; i < pairs.length; ++i) {
            keys[i] = pairs[i].getKey();
        }
        return keys;
    }

    public static <K extends Comparable<K>, V> int countGreaterThan(Pair<K, V>[] pairs, K value) {
        if (pairs == null || value == null) {
            throw new IllegalArgumentException();
        }
        int counter = 0;
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey() != null && pair.getKey().compareTo(value) > 0) {
                ++counter;
            }
        }
        return counter;
    }

    public static <K, V> boolean containsUniqueObjects(Pair<K, V>[] pairs) {
        if (pairs == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < pairs.length - 1; i++) {
            for (int j = i + 1; j < pairs.length; j++) {
                if ((pairs[i] == pairs[j])
                        || (pairs[i] == null || pairs[j] == null)
                        || Objects.equals(pairs[i].getKey(), pairs[j].getKey())) {
                    return false;
                }
            }
        }
        return true;
    }

}
