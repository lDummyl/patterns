package behave;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

    private final T [] array;

    private int position = 0;

    public MyIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return position < array.length;
    }

    @Override
    public T next() {
        T t = array[position];
        position++;
        return t;
    }
}
