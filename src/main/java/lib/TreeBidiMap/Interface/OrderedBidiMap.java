package lib.TreeBidiMap.Interface;

public interface OrderedBidiMap<K, V> extends BidiMap<K, V>, OrderedMap<K, V> {

    /**
     * Gets a view of this map where the keys and values are reversed.
     * <p>
     * Changes to one map will be visible in the other and vice versa.
     * This enables both directions of the map to be accessed equally.
     * <p>
     * Implementations should seek to avoid creating a new object every time this
     * method is called. See <code>AbstractMap.values()</code> etc. Calling this
     * method on the inverse map should return the original.
     * <p>
     * Implementations must return an <code>OrderedBidiMap</code> instance,
     * usually by forwarding to <code>inverseOrderedBidiMap()</code>.
     *
     * @return an inverted bidirectional map
     */
    @Override
    OrderedBidiMap<V, K> inverseBidiMap();

}