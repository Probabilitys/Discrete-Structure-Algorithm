/**
 * Positional List ADT
 * a sequence of positions storing objects
 */

public interface PositionalList<E> {
    
    /** Returns the number of elements. */
    int size();

    /** Indicates whether the list is empty. */
    boolean isEmpty();

    /** Returns the first position, or null if empty. */
    Position<E> first();

    /** Returns the last position, or null if empty. */
    Position<E> last();

    /** Returns the Position immedidately before p, or null if p is first. */
    Position<E> before(Position<E> p)
        throws IllegalArgumentException;

    /** Returns the Position immedidately after p, or null if p is last. */
    Position<E> after(Position<E> p)
        throws IllegalArgumentException;

    /** Add element e to the front and returns its new position. */
    Position<E> addFirst(E e);

    /** Add element e to the end and returns its new position. */
    Position<E> addLast(E e);

    /** Add element e immediately before p and returns its new position. */
    Position<E> addBefore(Position<E> p, E e)
        throws IllegalArgumentException;

    /** Add element e immediately after p and returns its new position. */
    Position<E> addAfter(Position<E> p, E e)
        throws IllegalArgumentException;
    
    /** Replaces the element at p and returns the old element. */
    E set(Position<E> p, E e)
        throws IllegalArgumentException;

    /** Remove the element at p and returns the removed element. */
    E remove(Position<E> p)
        throws IllegalArgumentException;
}
