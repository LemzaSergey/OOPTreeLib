package lib.TreeBidiMap.Interface;

import lib.TreeBidiMap.Abstract.AbstractMapEntry;

import java.util.Map;

/**
 * A {@link java.util.Map.Entry Map.Entry} that throws
 * UnsupportedOperationException when <code>setValue</code> is called.
 *
 * @param <K> the type of keys
 * @param <V> the type of mapped values
 * @since 3.0
 */
public final class UnmodifiableMapEntry<K, V> extends AbstractMapEntry<K, V> implements Unmodifiable {

    /**
     * Constructs a new entry with the specified key and given value.
     *
     * @param key  the key for the entry, may be null
     * @param value  the value for the entry, may be null
     */
    public UnmodifiableMapEntry(final K key, final V value) {
        super(key, value);
    }

    /**
     * Constructs a new entry from the specified <code>KeyValue</code>.
     *
     * @param pair  the pair to copy, must not be null
     * @throws NullPointerException if the entry is null
     */
    public UnmodifiableMapEntry(final KeyValue<? extends K, ? extends V> pair) {
        super(pair.getKey(), pair.getValue());
    }

    /**
     * Constructs a new entry from the specified <code>Map.Entry</code>.
     *
     * @param entry  the entry to copy, must not be null
     * @throws NullPointerException if the entry is null
     */
    public UnmodifiableMapEntry(final Map.Entry<? extends K, ? extends V> entry) {
        super(entry.getKey(), entry.getValue());
    }

    /**
     * Throws UnsupportedOperationException.
     *
     * @param value  the new value
     * @return the previous value
     * @throws UnsupportedOperationException always
     */
    @Override
    public V setValue(final V value) {
        throw new UnsupportedOperationException("setValue() is not supported");
    }

}