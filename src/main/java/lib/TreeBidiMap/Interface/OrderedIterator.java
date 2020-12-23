package lib.TreeBidiMap.Interface;

import java.util.Iterator;

public interface OrderedIterator<E> extends Iterator<E> {

    /**
     * Checks to see if there is a previous element that can be iterated to.
     *
     * @return <code>true</code> if the iterator has a previous element
     */
    boolean hasPrevious();

    /**
     * Gets the previous element from the container.
     *
     * @return the previous element in the iteration
     * @throws java.util.NoSuchElementException if the iteration is finished
     */
    E previous();

}