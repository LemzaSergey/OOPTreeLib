package lib.TreeBidiMap.Interface;


import lib.TreeBidiMap.Abstract.AbstractEmptyMapIterator;

public class EmptyOrderedMapIterator<K, V> extends AbstractEmptyMapIterator<K, V>
        implements OrderedMapIterator<K, V>, ResettableIterator<K> {

    /**
     * Singleton instance of the iterator.
     * @since 3.1
     */
    @SuppressWarnings("rawtypes")
    private static final OrderedMapIterator INSTANCE = new EmptyOrderedMapIterator<>();

    /**
     * Get a typed instance of the iterator.
     * @param <K> the key type
     * @param <V> the value type
     * @return {@link OrderedMapIterator}&lt;K, V&gt;
     */
    public static <K, V> OrderedMapIterator emptyOrderedMapIterator() {
        return INSTANCE;
    }

    /**
     * Constructor.
     */
    private EmptyOrderedMapIterator() {
        super();
    }

}
