package school.lemon.changerequest.java.generics.task2;

public class ArrayBasedContainer<T> implements Container<T> {

    private static final int INITIAL_ARRAY_SIZE = 10;

    private T[] array;
    private int size;

    public ArrayBasedContainer() {
        this.array = (T[]) new Object[INITIAL_ARRAY_SIZE];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return array[index];
        }
    }

    @Override
    public boolean add(T element, int index) {
        if (index < 0 || index > size) {
            return false;
        }
        checkSize();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        ++size;
        return true;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        --size;
        return true;
    }

    @Override
    public void add(T element) {
        checkSize();
        array[size++] = element;

    }

    private void checkSize() {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

}
