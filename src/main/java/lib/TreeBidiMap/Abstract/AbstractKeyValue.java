package lib.TreeBidiMap.Abstract;


import lib.TreeBidiMap.Interface.KeyValue;

/**
 * Abstract pair class to assist with creating <code>KeyValue</code>
 * and {@link java.util.Map.Entry Map.Entry} implementations.
 *
 * @param <K> the type of keys
 * @param <V> the type of values
 * @since 3.0
 */
public abstract class AbstractKeyValue<K, V> implements KeyValue<K, V> {

    /** The key */
    private K key;
    /** The value */
    private V value;

    /**
     * Constructs a new pair with the specified key and given value.
     *
     * @param key  the key for the entry, may be null
     * @param value  the value for the entry, may be null
     */
    protected AbstractKeyValue(final K key, final V value) {
        super();
        this.key = key;
        this.value = value;
    }

    /**
     * Gets the key from the pair.
     *
     * @return the key
     */
    @Override
    public K getKey() {
        return key;
    }

    protected K setKey(final K key) {
        final K old = this.key;
        this.key = key;
        return old;
    }

    /**
     * Gets the value from the pair.
     *
     * @return the value
     */
    @Override
    public V getValue() {
        return value;
    }

    protected V setValue(final V value) {
        final V old = this.value;
        this.value = value;
        return old;
    }

    /**
     * Gets a debugging String view of the pair.
     *
     * @return a String view of the entry
     */
    @Override
    public String toString() {
        return new StringBuilder()
                .append(getKey())
                .append('=')
                .append(getValue())
                .toString();
    }

}