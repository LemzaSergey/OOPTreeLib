package lib.TreeBidiMap.Interface;


import java.util.Collection;
import java.util.Set;

/**
 * The "read" subset of the {@link java.util.Map} interface.
 *
 * @param <K> the type of the keys in this map
 * @param <V> the type of the values in this map
 *
 * @since 4.0
 * @see Put
 */
public interface Get<K, V> {

    /**
     * @param key key whose presence in this map is to be tested
     * @return <code>true</code> if this map contains a mapping for the specified
     *         key
     * @see java.util.Map#containsKey(Object)
     */
    boolean containsKey(Object key);

    /**
     * @param value value whose presence in this map is to be tested
     * @return <code>true</code> if this map maps one or more keys to the
     *         specified value
     * @see java.util.Map#containsValue(Object)
     */
    boolean containsValue(Object value);

    /**
     * @return a set view of the mappings contained in this map
     * @see java.util.Map#entrySet()
     */
    Set<java.util.Map.Entry<K, V>> entrySet();

    /**
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or
     *         {@code null} if this map contains no mapping for the key
     * @see java.util.Map#get(Object)
     */
    V get(Object key);

    /**
     * @param key key whose mapping is to be removed from the map
     * @return the previous value associated with <code>key</code>, or
     *         <code>null</code> if there was no mapping for <code>key</code>.
     * @see java.util.Map#remove(Object)
     */
    V remove(Object key);

    /**
     * @return <code>true</code> if this map contains no key-value mappings
     * @see java.util.Map#isEmpty()
     */
    boolean isEmpty();

    /**
     * @return a set view of the keys contained in this map
     * @see java.util.Map#keySet()
     */
    Set<K> keySet();

    /**
     * @return the number of key-value mappings in this map
     * @see java.util.Map#size()
     */
    int size();

    /**
     * @return a collection view of the values contained in this map
     * @see java.util.Map#values()
     */
    Collection<V> values();

}