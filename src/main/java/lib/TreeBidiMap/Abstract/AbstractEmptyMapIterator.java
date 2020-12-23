package lib.TreeBidiMap.Abstract;

public abstract class AbstractEmptyMapIterator<K, V> extends AbstractEmptyIterator<K> {

    /**
     * Create a new AbstractEmptyMapIterator.
     */
    public AbstractEmptyMapIterator() {
        super();
    }

    public K getKey() {
        throw new IllegalStateException("Iterator contains no elements");
    }

    public V getValue() {
        throw new IllegalStateException("Iterator contains no elements");
    }

    public V setValue(final V value) {
        throw new IllegalStateException("Iterator contains no elements");
    }

}