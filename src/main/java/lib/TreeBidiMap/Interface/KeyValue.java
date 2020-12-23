package lib.TreeBidiMap.Interface;

public interface KeyValue<K, V> {

    /**
     * Gets the key from the pair.
     *
     * @return the key
     */
    K getKey();

    /**
     * Gets the value from the pair.
     *
     * @return the value
     */
    V getValue();

}