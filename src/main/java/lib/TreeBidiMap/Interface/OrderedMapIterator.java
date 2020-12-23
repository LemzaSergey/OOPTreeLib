package lib.TreeBidiMap.Interface;

public interface OrderedMapIterator<K, V> extends MapIterator<K, V>, OrderedIterator<K> {

    /**
     * Checks to see if there is a previous entry that can be iterated to.
     *
     * @return <code>true</code> if the iterator has a previous element
     */
    @Override
    boolean hasPrevious();

    /**
     * Gets the previous <em>key</em> from the <code>Map</code>.
     *
     * @return the previous key in the iteration
     * @throws java.util.NoSuchElementException if the iteration is finished
     */
    @Override
    K previous();

}