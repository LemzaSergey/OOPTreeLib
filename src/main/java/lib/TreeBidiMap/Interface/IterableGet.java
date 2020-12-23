package lib.TreeBidiMap.Interface;

public interface IterableGet<K, V> extends Get<K, V> {

    MapIterator<K, V> mapIterator();

}
